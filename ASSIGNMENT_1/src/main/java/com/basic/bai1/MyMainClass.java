package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {
	static boolean ans = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculateUtils CU = new CalculateUtils();
		double x = CU.nhapX();
		double y = CU.nhapY();
		System.out.println("Nhập lệnh ACTION với chuỗi là CONG,TRU,NHAN,CHIA : ");
		String chuoi = new Scanner(System.in).nextLine();
		chuoi.trim();
		switch (chuoi.toUpperCase()) {
		case "CONG":
			System.out.println("Kết quả phép cộng =" + CU.tinhCong(x, y));
			break;
		case "TRU":
			System.out.println("Kết quả phép trừ =" + CU.tinhTru(x, y));
			break;

		case "NHAN":
			System.out.println("Kết quả phép nhân =" + CU.tinhNhan(x, y));
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
				}catch(ArithmeticException e) {
					System.out.println("Nhập lại số Y");
			        y = CU.nhapY();
					ans = false;
				}
			} while (ans == false);
			System.out.println("Kết quả phép chia =" + CU.tinhChia(x, y));
			break;
		}
	}
}
