package com.basic.bai3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainScreen {
	static boolean ans = true;

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String msg = "";
		boolean x = false;
		String dob = "";
		float finalGrade = 0;
		String gender = "";
		String numberRegex = "[0-9]";
		do {
			do {
				try {
					System.out.println("Nhập thông tin Student: ");
					System.out.print("Nhập fullName: ");
					String fullName = sc.nextLine();
					System.out.print("Nhập address: ");
					String address = sc.nextLine();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate date = null;
					do {
						try {
							System.out.println("Ngày tháng năm: ");
							dob = sc.nextLine();
							date = LocalDate.parse(dob, formatter);
							x = true;
						} catch (DateTimeException e) {
							System.out.println("Lỗi. Xin hãy nhập lại!");
							x = false;
						}
						if (x) {
							dob = formatter.format(date);
							System.out.println(dob);
							x = true;
							break;
						}
					} while (x == false);
					do {
						try {
							System.out.print("Gender (Male/Female): ");
							gender = sc.nextLine().trim();
							if (gender.matches(numberRegex)) {
								throw new Exception();
							} else if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
								x = true;
								break;
							} else {
								throw new Exception();
							}
						} catch (Exception e) {
							System.out.println("Lỗi, xin hãy nhập lại!");
							x = false;
						}
					} while (x == false);
					do {
						try {
							System.out.print("FinalGrade = ");
							finalGrade = Float.parseFloat(sc.nextLine());
							if (finalGrade < 0 || finalGrade > 10) {
								System.out.println("Dữ liệu không đúng, xin hãy nhập lại!");
								x = false;
							} else {
								x = true;
								break;
							}
						} catch (Exception e) {
							System.out.println("Lỗi, xin hãy nhập lại!");
							x = false;
						}
					} while (x == false);
					Student sd = new Student(fullName, address, dob, gender, finalGrade);
					list.add(sd);
					break;
				} catch (Exception e) {
					System.out.println("Nhập sai");
					ans = false;
				}
			} while (ans == false);

			System.out.println("Tiếp tục nhập nữa không ? Nhập Yes/No");
			msg = sc.nextLine().trim().toUpperCase();
		} while (msg.equalsIgnoreCase("YES"));

		// in ra thông tin học sinh
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Student[" + i + "]:\n" + list.get(i).getFullName() + "\n" + list.get(i).getAddress()
					+ "\n" + list.get(i).getDob() + "\n" + list.get(i).getGender() + "\n"
					+ list.get(i).getFinalGrade());
		}
		// Xếp hạng : p = point
		String xh = "";
		float point = 0;
		int sumSd = 0;
		for (int i = 0; i < list.size(); i++) {
			float p = list.get(i).getFinalGrade();
			String n = list.get(i).getFullName();
			xh = (p < 4) ? n + " học lựa kém"
					: ((p >= 4
							&& p < 5)
									? n + " học lực yếu"
									: (((p >= 5 && p < 5.5) ? n + " học lực trung bình yếu"
											: ((((p >= 5.5 && p < 6.5) ? n + " học lực trung bình "
													: (((((p >= 6.5 && p < 7) ? n + " học lực trung bình khá "
															: ((((((p >= 7 && p < 8) ? n + " học lực khá"
																	: (((((((p >= 8 && p < 8.5)
																			? n + " học lực khá giỏi"
																			: "Học lực giỏi")))))))))))))))))))));
			System.out.println("Kết quả học tập" + xh);
			point = point + list.get(i).getFinalGrade();
			sumSd++;
		}
		System.out.println("Tổng điểm trung bình của all học sinh" + point / sumSd);

	}
}
