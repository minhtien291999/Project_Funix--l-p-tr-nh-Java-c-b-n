package com.basic.bai3;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		/*
		 * String fullName = ""; String address = ""; String gender = ""; float
		 * finalGrade = 0;
		 */
//		String dob = "";
//		ArrayList<Student> list = new ArrayList<Student>();
//		System.out.println("Nhap dob: ");
//		Scanner sc = new Scanner(System.in);
//		String date1 = sc.nextLine();
//		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		/*
		 * dob d = new dob(); Student sd = new Student(fullName, address, dob, gender,
		 * finalGrade); list.add(sd); for (int i = 0; i < list.size(); i++) {
		 * System.out.println("Student[" + i + "]:\n" + list.get(i).getFullName() + "\n"
		 * + list.get(i).getAddress() + "\n" + list.get(i).getDob() + "\n" +
		 * list.get(i).getGender() + "\n" + list.get(i).getFinalGrade());
		 * 
		 * }
		 */
//		System.out.println(date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		ThuNghiem tn = new ThuNghiem();
		boolean x = false;
		String d = "";
		float grade = 0;
		String gender = "";
		String numberRegex = "[0-9]";

		/*
		 * do { try { System.out.println("Ngày tháng năm: "); d = sc.nextLine();
		 * LocalDate.parse(d, formatter); x = true; } catch (DateTimeException e) {
		 * System.out.println("Lỗi. Xin hãy nhập lại!"); x = false; } if (x) { String
		 * DOB = d.formatted(formatter); System.out.println(DOB); x = true; break; } }
		 * while (x == false);
		 */

		
		/*
		 * do { try { System.out.print("FinalGrade = "); grade =
		 * Float.parseFloat(sc.nextLine()); if (grade < 0 || grade > 10) {
		 * System.out.println("Dữ liệu không đúng, xin hãy nhập lại!"); x = false; }
		 * else { x = true; break; } } catch (Exception e) {
		 * System.out.println("Lỗi, xin hãy nhập lại!"); x = false; } } while (x ==
		 * false);
		 */
		 
		// -----------------------------------------------------------------------------------------------------------------
		/*
		 * do { try { System.out.print("Gender (Male/Female): "); gender =
		 * sc.nextLine().trim(); if (gender.matches(numberRegex)) { throw new
		 * Exception(); } else if (gender.equalsIgnoreCase("Male") ||
		 * gender.equalsIgnoreCase("Female")) { x = true; break; } else { throw new
		 * Exception(); } } catch (Exception e) {
		 * System.out.println("Lỗi, xin hãy nhập lại!"); x = false; } } while (x ==
		 * false);
		 */
	}
}
