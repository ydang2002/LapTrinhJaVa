package Bai7Den10;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/*public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}*/
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}

	public int compareTo(Date date) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void nhapNgayThangNam(Scanner sc) {
		
		System.out.println("Nhap ngay: ");
		day = sc.nextInt();
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		System.out.println("Nhap nam: ");
		year = sc.nextInt();	
		
	}
	
	
	
	public void xuatNgay(Date date) {
		System.out.println(date.day + "/" + date.month + "/" + date.year);
	}
}
