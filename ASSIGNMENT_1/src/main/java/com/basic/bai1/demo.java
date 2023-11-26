package com.basic.bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

class PhepTinh {
	static boolean ans = true;
	static Scanner sc = new Scanner(System.in);

	public double tinhCong(double x, double y) {
		return x + y;
	}

	// Phép trừ
	public double tinhTru(double x, double y) {
		return x - y;
	}

	// Phép nhân
	public double tinhNhan(double x, double y) {
		return x * y;
	}

	// Phép chia
	public double tinhChia(double x, double y) {
		return x / y;
	}

	public double nhapX() {
		double x = 0;
		do {
			try {
				System.out.print("Số x = ");
				x = Double.parseDouble(sc.nextLine());
				ans = true;
			} catch (Exception e) {
				System.out.println("Sai dữ liệu, xin hãy nhập lại");
				ans = false;
			}
			if (ans)
				break;
		} while (ans == false);
		return x;
	}

	public double nhapY() {
		double y = 0;
		do {
			try {
				System.out.print("Số y = ");
				y = Double.parseDouble(sc.nextLine());
				ans = true;
			} catch (Exception e) {
				System.out.println("Sai dữ liệu, xin hãy nhập lại");
				ans = false;
			}
			if (ans)
				break;
		} while (ans == false);
		return y;
	}
}

public class demo {
	static boolean ans = true;
	static Scanner sc = new Scanner(System.in);
	static String numberRegex = "[0-9]";

	public static void main(String[] args) {
		String msg = "";
		String action = "";
		PhepTinh pt = new PhepTinh();
		double x = pt.nhapX();
		double y = pt.nhapY();
		do {
			do {
				try {
					System.out.print("Nhập ACTION: ");
					action = sc.nextLine().trim().toUpperCase();
					if (action.matches(numberRegex)) {
						throw new InputMismatchException();
					} else {
						ans = true;
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Sai dữ liệu, xin hãy nhập lại");
					ans = false;
				}
			} while (ans == false);
			switch (action) {
			case "CONG":
				System.out.println("Kết quả phép cộng =" + pt.tinhCong(x, y));
				break;
			case "TRU":
				System.out.println("Kết quả phép trừ =" + pt.tinhTru(x, y));
				break;

			case "NHAN":
				System.out.println("Kết quả phép nhân =" + pt.tinhNhan(x, y));
				break;

			case "CHIA": 
				do {
					try {
						if (y == 0) {
							throw new ArithmeticException();
						} else {
							ans = true;
							break;
						}
					} catch (ArithmeticException ae) {
						System.out.println("Sai dữ liệu, xin hãy nhập lại");
						y = pt.nhapY();
						ans = false;
					}
				} while (ans == false);
				System.out.println("Kết quả phép chia =" + pt.tinhChia(x, y));
				break;
			}
			System.out.print("Bạn có muốn tiếp tục tính toán hay không? (Y/N): ");
			msg = sc.nextLine();
		} while (msg.equalsIgnoreCase("Y"));
	}
}
