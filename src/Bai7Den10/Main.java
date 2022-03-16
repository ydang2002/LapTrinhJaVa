package Bai7Den10;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;



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
		/*Vector<Date> listDate = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Nhap so luong ngay nhap vao:");
			 int n = sc.nextInt();
			 for(int i = 0; i < n; i++ ) {
					System.out.println("Nhap ngay thu " + (i + 1) + " la:");
					
					System.out.println("Nhap ngay: ");
					int day = sc.nextInt();
					System.out.println("Nhap thang: ");
					int month = sc.nextInt();
					System.out.println("Nhap nam: ");
					int year = sc.nextInt();	
					
					EnhancedDate date = new EnhancedDate(day, month, year);
					listDate.add(date);
			 }
		} catch (InputMismatchException e) {
			System.out.println("nhap sai du lieu");
		} catch (IllegalArgumentException e) {
			System.out.println("Ngay khong hop le");
		}*/
		
		Vector<Date> dateList = new Vector<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ngay:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int d, m, y;
            System.out.println("Moi nhap ngay: ");
            d = input.nextInt();
            System.out.println("Moi nhap thang: ");
            m = input.nextInt();
            System.out.println("Moi nhap nam: ");
            y = input.nextInt();

            try {
                Date a = new EnhancedDate(d, m, y);
                dateList.add(a);
            } catch (NumberFormatException e) {
                System.out.println("Ngay thang nam phai la so nguyen.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ngay nhap vao khong hop le.");
            }
        }

		
		for(Date date : dateList) {
			EnhancedDate date1 = new EnhancedDate();
			if(date1.isLeapYear()) {
				date1.xuatNgay(date);
			}
		}
		
		for (int i = 0; i < dateList.size(); i++) {
            ((EnhancedDate) dateList.get(i)).prevDay().xuatNgay();
            ((EnhancedDate) dateList.get(i)).nextDay().display();
        }

        EnhancedDate min = ((EnhancedDate) dateList.get(0));
        EnhancedDate max = ((EnhancedDate) dateList.get(0));

        for (int i = 0; i < dateList.size(); i++) {
            if (((EnhancedDate) dateList.get(i)).compareTo(min) == -1) {
                min = ((EnhancedDate) dateList.get(i));
            }
            if (((EnhancedDate) dateList.get(i)).compareTo(max) == 1) {
                max = ((EnhancedDate) dateList.get(i));
            }
        }

        for (int i = 0; i < dateList.size(); i++) {
            for (int j = 0; j < dateList.size(); j++) {
                if (i != j && ((EnhancedDate) dateList.get(i))
                        .compareTo(((EnhancedDate) dateList.get(j))) == 0) {
                    dateList.remove(j);
                }
            }
        }

        Collections.sort(dateList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return ((EnhancedDate) o1).compareTo(o2);
            }
        });

        input.close();
    }
		/*EnhancedDate enhancedDate = new EnhancedDate();
		
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
