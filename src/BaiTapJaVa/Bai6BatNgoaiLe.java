package BaiTapJaVa;

import java.util.Scanner;
import java.lang.*;

public class Bai6BatNgoaiLe {
	static float soChia,soBiChia;
	//Scanner sc = new Scanner(System.in);
	 /*static void nhapSo() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu so la so thuc: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.trim().isEmpty()) {
			throw new Exception("Ban chua nhap so bi chia hoac nhap khoang trang");
		}
		
		if(str2.trim().isEmpty()) {
			throw new Exception("Ban chua nhap so chia hoac nhap khoang trang");
		}
		
		soBiChia = Float.parseFloat(str1);
		soChia = Float.parseFloat(str2);
	}*/
	
static float nhapSo() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		String str1 = sc.nextLine();
		
		if(str1.trim().isEmpty()) {
			throw new Exception("Ban chua nhap so bi chia hoac nhap khoang trang");
		}
		
		
		soBiChia = Float.parseFloat(str1);
		return soBiChia;
	}

static float nhapSo2() throws Exception{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so: ");
	String str2 = sc.nextLine();
	
	if(str2.trim().isEmpty()) {
		throw new Exception("Ban chua nhap so chia hoac nhap khoang trang");
	}
	
	soChia = Float.parseFloat(str2);
	return soChia;
}

static void chia() {
	if(soChia == 0) {
		throw new ArithmeticException("so chia phai khac 0");
	}else {
		System.out.println("ket qua: "+ soBiChia/soChia);
	}
	/*try {
		System.out.println("ket qua: "+ soBiChia/soChia);
	} catch (ArithmeticException ex) {
		System.out.println("Loi: "+ ex.getMessage());
	}
	System.out.println("so chia phai khac 0");*/
}

	public static void main(String[] args) {
		try {
			float n1, n2;
			n1 = nhapSo();
			n2 = nhapSo2();
			System.out.println(n1+"\t");
			System.out.println(n2+"\t");
		} catch(IllegalArgumentException ex) {
			System.out.println("Loi: Nhap vao khong phai la so");
		} catch(Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
		}
		
		chia();
	}

}
