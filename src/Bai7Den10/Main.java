package Bai7Den10;

import java.util.Scanner;



/*public class QuanLiDanhSachNgay{
	
	private Vector<Date> danhSachNgay;
	public QuanLiDanhSachNgay() {
		
		danhSachNgay = new Vector<Date>();
	}
	
	public void themNgay(Date date) {
		danhSachNgay.add()
	}
}*/

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		EnhancedDate enhancedDate = new EnhancedDate();
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			
			System.out.println("1: Nhap danh sach n doi tuong Date");
			System.out.println("2: Nhung ngay thuoc nam nhuan");
			System.out.println("3: Ngay lien truoc va ngay lien sau");
			System.out.println("4: Ngay lon nhat va ngay no nhat");
			System.out.println("5: ");
			System.out.println("6: ");
			System.out.println("0: Thoat");
			String luaChon = sc.nextLine();
			switch(luaChon) {
				case "1":{
					enhancedDate.nhapDanhSachNgay(sc);
					break;
				}
				case "2":{
					enhancedDate.xuatNgayNamNhuan();
					break;
				}
				case "3":{
					Date date = new Date();
					enhancedDate.ngayLienTruoc();
					break;
				}
				case "4":{
					enhancedDate.ngayNhoNhatLonNhat();
					break;
				}
				case "5":{
					
					break;
				}
				case "6":{
					
					break;
				}
				case "0":{
					return;
				}
					
				default :
				System.out.println("vui long chon dung hinh thuc");
			}
		}
		
		//int n = 0;
		//Vector<Date> v = new Vector<Date>(n);
		
		
		
		/*System.out.println("nhap n doi tuong Date: ");
		n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			
			try {
				System.out.println("nhap ngay");
				enhancedDate.setDay(sc.nextInt());
				System.out.println("nhap thang");
				enhancedDate.setMonth(sc.nextInt());
				System.out.println("nhap nam");
				enhancedDate.setYear(sc.nextInt());
				
			} catch(IllegalArgumentException ex) {
				System.out.println("Loi: Nhap vao khong phai la so");
			} catch(Exception ex) {
				System.out.println("Loi: " + ex.getMessage());
			}
			
			//enhancedDate.nemNgoaiLe(day, month, year);
			
			//v.add(i);
		}*/
		
	}

}
