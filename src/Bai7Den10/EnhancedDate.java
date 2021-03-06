package Bai7Den10;

import java.util.Scanner;
import java.util.Vector;



/*link tham khao: https://www.howkteam.vn/course/viet-chuong-trinh-so-sanh-2-thoi-gian-nhap-vao-va-in-ra-ket-qua/tim-ngay-truoc-va-sau-cua-mot-ngay-1306*/
public class EnhancedDate extends Date{
	public EnhancedDate() {
		
	}
	
	public EnhancedDate(int day, int month, int year) {
		super(day, month, year);
	}
	/*public int n = 0;
	private Vector<Date> danhSachNgay = new Vector<Date>(n);
	
	/*public void QuanLiDanhSachNgay() {
		danhSachNgay = new Vector<Date>(n);
	}*/
	
	// them ngay vao danh sach
	/*public void themNgay(Date date) {
		danhSachNgay.add(date);
	}
	
	//ham nhap danh sach ngay
	public void nhapDanhSachNgay(Scanner sc) {
		Date date = new Date();
		
		System.out.print("Nhap so luong ngay nhap vao:");
		 n = sc.nextInt();
		
		System.out.println("Nhap danh sach ngay: ");
		for(int i = 0; i < n; i++ ) {
			System.out.println("Nhap ngay thu " + (i + 1) + " la:");
			try {
				date.nhapNgayThangNam(sc);
			
			} catch(Exception ex) {
				System.out.println("Loi: Ngay phai la so nguyen " );
			}
			
			
			//bat ngoai le ngay khong hoop le
			//nemNgoaiLe(getDay(), getMonth(), getYear());
			
			themNgay(date);
		}
	}*/
	
	// ham kiem tra co phai nam nhuan k
	public boolean isLeapYear() {
		if(((getYear() % 4 == 0) && (getYear() % 100 != 0)) ||(getYear() % 400 == 0)){
			return true;
		}else return false;
	}
	
	//ham tra ve so ngay trong thang nam cho truoc
	public int tinhSoNgayTrongThang() {
		int soNgay = 0;
		
		switch (getMonth()) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			soNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			soNgay = 30;
			break;
		case 2:
				if(isLeapYear()) {
					soNgay = 29;
				}else {
					soNgay = 28;
				}
				break;
		}
		return soNgay;
	}
	
	//ham kiem tra ngay co hop le khong
	public boolean isValidDate() {
		if(getYear() < 0) {
			return false;
		}
		
		if(getMonth() < 1 || getMonth() > 12) {
			return false;
		}
		
		if(getDay() <1 || getDay() > tinhSoNgayTrongThang()) {
			return false;
		}
		return true;
	}
	
	public Date prevDay(int day, int month, int year) {
		day--;
		if(day == 0) {
			month--;
			if(month == 0) {
				month = 12;
				year--;
			}
			day = tinhSoNgayTrongThang();
		}
		return new Date(day, month, year) ;
	}
	
	public Date nextDay(int day, int month, int year) {
		day++;
		if(day > tinhSoNgayTrongThang()) {
			day = 1;
			month++;
			if(month > 12) {
				month = 1;
				year++;
			}
		}
		return new Date(day, month, year);
	}
	/*https://mkyong.com/java/how-to-compare-dates-in-java/*/
	/*public int compareTo(Date date1, Date date2) {
		int ketQua = date1.compareTo(date2);
		if(ketQua == 0) { 
			return 0;
		}else if(ketQua > 0) {
			return 1;
		}
		return -1;
		
	}*/
	
	public int compareTo(Date d) {
		if(this.getYear() > d.getYear()) {
			return 1;
		}else if(this.getYear() < d.getYear()) {
			return -1;
		}else {
			if(this.getMonth() > d.getMonth()) {
				return 1;
			}else if(this.getMonth() < d.getMonth()) {
				return -1;
			}else {
				if(this.getDay() > d.getDay()) {
					return 1;
				}else if(this.getDay() < d.getDay()) {
					return -1;
				}return 0;
			}
		}
	}
	
	//B?i 9 
	/*public void nemNgoaiLe(int day, int month, int year) {
		if(isValidDate(day, month, year) == false) {
			throw new IllegalArgumentException("Ngay khong hop le");
		}
	}*/
	
	/*public void xuatNgayNamNhuan() {
	
		for(Date date : danhSachNgay) {
			if(isLeapYear()) {
				date.xuatNgay(date);
			}
		}
		
	}
	
	public void ngayLienTruoc() {
		
		for(Date date : danhSachNgay) {
			System.out.println("Ngay lien truoc: ");
			date.xuatNgay(date);
			System.out.println("la: ");
			prevDay(getDay(), getMonth(), getYear());
			date.xuatNgay(date);
		}
		
	}*/
	
	
	
	/*@Override 
	public void nhapNgayThangNam(Scanner sc) {
		super.nhapNgayThangNam(sc);
	}*/
	
	/*public void xuatDanhSach() {
		for(Date date : danhSachNgay) {
			date.xuatNgay(date);
		}
	}*/
}/*https://helpex.vn/question/lam-the-nao-de-so-sanh-ngay-trong-java-ban-sao-5cb1674dae03f6169c9e680e*/
