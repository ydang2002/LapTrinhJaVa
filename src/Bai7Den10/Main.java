package Bai7Den10;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public void nhapNgayThangNam() {
		
	}
	public static void main(String[] args) {
		
		EnhancedDate enhancedDate = new EnhancedDate();
		int n;
		Vector<Date> v = new Vector<Date>(n);
		
		System.out.println("nhap n doi tuong Date: ");
		n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			
			try {
				System.out.println("nhap ngay");
				enhancedDate.day = sc.nextInt();
				System.out.println("nhap thang");
				enhancedDate.month = sc.nextInt();
				System.out.println("nhap nam");
				enhancedDate.year = sc.nextInt();
				
			} catch(IllegalArgumentException ex) {
				System.out.println("Loi: Nhap vao khong phai la so");
			} catch(Exception ex) {
				System.out.println("Loi: " + ex.getMessage());
			}
			
			if(enhancedDate.isValidDate(enhancedDate.day, enhancedDate.month, enhancedDate.year)) {
				System.out.println("ngay khong hop le");
			}
			v.add(i);
		}
		
	}

}
