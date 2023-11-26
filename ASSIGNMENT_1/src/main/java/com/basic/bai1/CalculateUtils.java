package com.basic.bai1;

import java.util.Scanner;

public class CalculateUtils {
	static boolean ans = true;
	static Scanner input = new Scanner(System.in);

	// Nhập x
	public double nhapX() {
		double x = 0;
		do {
			try {
				System.out.println("Nhập số X = ");
				x = Double.parseDouble(input.nextLine());
				ans = true;
			} catch (Exception e) {
				System.out.println("Sai dữ liệu, nhập lại X = ");
				ans = false;
			}
			if (ans)
				break;
		} while (ans == false);
		return x;
	}

	// Nhập Y
	public double nhapY() {
		double y = 0;
		do {
			try {
				System.out.println("Nhập số Y = ");
				y = Double.parseDouble(input.nextLine());
				ans = true;
			} catch (Exception e) {
				System.out.println("Sai dữ liệu, nhập lại Y = ");
				ans = false;
			}if (ans)
				break;
		} while (ans == false);
		return y;
	}

	// Phép cộng
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

}
