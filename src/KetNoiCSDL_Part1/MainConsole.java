package KetNoiCSDL_Part1;

import java.util.Scanner;

//import com.sun.javafx.logging.Logger;

//import java.sql.*;

public class MainConsole {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		QuanLiSanPham quanLiSanPham =new QuanLiSanPham();
		int choose;
		
		do {
			
			showMenu();
			choose = Integer.parseInt(scan.nextLine());
			
			switch (choose) {
			case 1:
				quanLiSanPham.hienThiDanhSachSP();
                break;
            case 2:
            	quanLiSanPham.themSP();
                break;
            case 3:
            	quanLiSanPham.suaSP();
                break;
            case 4:
            	quanLiSanPham.xoaSP();
                break;
            case 5:
            	quanLiSanPham.timSp();
                break;
            case 6:
            	System.out.println("Thoat!!!");
                break;
			default:
				System.out.println("Vui long nhap dung lua chon!!!");
                break;
			}
			
			
		}while(choose != 6);

	}
	
	static void showMenu() {
		System.out.println("1. Hien thi danh sach san pham");
        System.out.println("2. Them san pham");
        System.out.println("3. Sua san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim san pham");
        System.out.println("6. Thoat");
        System.out.println("Choose: ");
		
	}
	/*System.out.println("Ma San Pham: " + rs.getString(1) +
				" Ten san Pham: " + rs.getString(2) + " Gia: " +
				rs.getInt(3) + " Ten loai san pham: " + rs.getString(4));*/	

}
