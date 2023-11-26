package com.basic.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dob {

	String date;
	static boolean ans = true; // Phương thức nhập ngày public

	String dmy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap dob: ");
		String date1 = sc.nextLine();
		date = new SimpleDateFormat("dd/MM/yyyy").format(date1);
		return date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
