package KetNoiCSDL_Part1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;



public class QuanLiSanPham {
	static Scanner scan = new Scanner(System.in);

	public  void hienThiDanhSachSP() {
		//Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			Statement stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery("select MaSP, TenSP, Gia, TenLoaiSP from SanPham, LoaiSanPham where SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP");
			//System.out.println("Kết nối thành công");
			
			while(rs.next()) 
				System.out.println("Ma San Pham: " + rs.getString(1) +
					" Ten san Pham: " + rs.getString(2) + " Gia: " +
					rs.getInt(3) + " Ten loai san pham: " + rs.getString(4));
				
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Kết nối thất bại");
		}
	}
	
	static String nMaLoaiSanPham;
	public void themSP() {
		ArrayList<String> ds = new ArrayList<String>();
		do {	
		 ds=layMaLoaiSP();
		 System.out.println("Moi ban nhap ma loai san pham ");
		 for (String string : ds) {
			 System.out.println(string);
		}
		 nMaLoaiSanPham = scan.nextLine();
	        
	        if(!ds.contains(nMaLoaiSanPham)) {
	        	System.out.println("Ban da nhap sai ma loai san pham, moi ban nhap lai!!!!!");
	        }
		}while(!ds.contains(nMaLoaiSanPham));
	
		
		/*System.out.println("Moi ban nhap ma loai san pham ");
		String MaLoaiSP = scan.nextLine();*/
		
		/*LoaiSanPham loaiSanPham = new LoaiSanPham();
		loaiSanPham.input2();*/
		SanPham sanPham = new SanPham();
		sanPham.input();
		PreparedStatement statement = null;
		
		
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			String sql2 = ("insert into sanpham (MaSP, TenSP, Gia, MaLoaiSP) VALUES (?, ?, ?, ?)");
			statement = connection.prepareCall(sql2);
			statement.setString(1, sanPham.getMaSP());
			statement.setString(2, sanPham.getTenSP());
			statement.setInt(3, sanPham.getGia());
			statement.setString(4, nMaLoaiSanPham);
			statement.execute();
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
		}
	
	public  void suaSP() {
		System.out.println("Sua thong tin san pham theo ma loai san pham");
		LoaiSanPham loaiSanPham = new LoaiSanPham();
		loaiSanPham.input2();
		SanPham sanPham = new SanPham();
		sanPham.input();
		PreparedStatement statement = null;
		
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			String sql = ("update LoaiSanPham set TenLoaiSP = ? " + "where MaLoaiSP = ?");
			statement = connection.prepareCall(sql);
			statement.setString(1, loaiSanPham.getMaLoaiSP());
			statement.setString(2, loaiSanPham.getTenLoaiSP());
			statement.execute();
			//insert into sanpham values('BC03','Thuoc ke',5000,'3BC01')
			String sql2 = ("update sanpham set MaSP = ? , TenSP = ?, Gia = ? " + "where MaLoaiSP = ?");
			statement = connection.prepareCall(sql2);
			statement.setString(1, sanPham.getMaSP());
			statement.setString(2, sanPham.getTenSP());
			statement.setInt(3, sanPham.getGia());
			statement.setString(4, sanPham.getMaLoaiSP());
			statement.execute();
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}
	
	public  void xoaSP() {
		System.out.println("Nhap ma loai san pham can xoa: ");
        String MaLoaiSP = scan.nextLine();
		PreparedStatement statement = null;
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			String sql = ("delete from LoaiSanPham where MaLoaiSP = ?");
			statement = connection.prepareCall(sql);
			statement.setString(1,MaLoaiSP );
			statement.execute();
			//insert into sanpham values('BC03','Thuoc ke',5000,'3BC01')
			String sql2 = ("delete from sanpham where MaLoaiSP = ?");
			statement = connection.prepareCall(sql2);
			statement.setString(1, MaLoaiSP);
			statement.execute();
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}
	
	public  void timSp() {
		System.out.println("Nhap ma loai san pham can Tim: ");
        String MaLoaiSP = scan.nextLine();
		PreparedStatement statement = null;
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			String sql = ("select MaSP, TenSP, Gia, TenLoaiSP from SanPham sp, LoaiSanPham lsp where sp.MaLoaiSP = lsp.MaLoaiSP and sp.MaLoaiSP = ? ");
			statement = connection.prepareStatement(sql);
			statement.setString(1,MaLoaiSP );
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) 
				System.out.println("Ma San Pham: " + rs.getString(1) +
					" Ten san Pham: " + rs.getString(2) + " Gia: " +
					rs.getInt(3) + " Ten loai san pham: " + rs.getString(4));
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}
	
	public static ArrayList<String> layMaLoaiSP(){
		ArrayList<String> listMaLoaiSP = new ArrayList<>();
		
		
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			Statement stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery("select MaLoaiSP from loaisanpham  ");
	
			while(rs.next())
            {
				String maLoaiSP = new String(rs.getString("MaLoaiSP"));               
                listMaLoaiSP.add(maLoaiSP);
            }
				
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
			
			return listMaLoaiSP;
	}
	
	/*public static ArrayList<String> layMaLoaiSP(){
		ArrayList<String> listMaLoaiSP = new ArrayList<String>();
		
		do {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			Statement stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery("select MaLoaiSP from loaisanpham  ");
	
			while(rs.next())
            {
				String maLoaiSP = new String(rs.getString("MaLoaiSP"));               
                listMaLoaiSP.add(maLoaiSP);
            }
				
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
			
			
			//System.out.println("Nhap ma loai san pham(Loại 1: 1BC00, Loai 2: 2BC00) ");
			nMaLoaiSanPham = scan.nextLine();
	        
	        if(!listMaLoaiSP.contains(nMaLoaiSanPham)) {
	        	System.out.println("Ban da nhap sai ma loai san pham, moi ban nhap lai!!!!!");
	        }
		}while(!listMaLoaiSP.contains(nMaLoaiSanPham));
	}*/
	
}
