package com.basic.bai2;

import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên N = ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tongChan = 0;
		int tongLe = 0;
		int count = 0;
		
		if (N > 0) {
			if (N % 2 == 0) {
				System.out.println("Đây là số chẵn!");
				for (int i = 0; i <= N; i += 2) {
					tongChan = tongChan + i;
				}
				System.out.println("Tổng số chẳn từ 0-N = " + tongChan);
			} else {
				System.out.println("Đây là số lẻ! ");
				for (int i = 1; i <= N; i += 2) {
					tongLe = tongLe + i;
				}
				System.out.println("Tổng số lẻ từ 0-N = " + tongLe);
			}
		}
		for (int i = 0; i <= N; i++) {
			if (i % 3 == 0 && i % 2 !=0) {
				count++;
			}
		}
		System.out.println("Tổng số từ 0-N: chia hết cho 3: "+count);
	}
}
