package KetNoiCSDL_Part1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;



public class QuanLiSanPham {
	static Scanner scan = new Scanner(System.in);
	Connection connection = null;
	PreparedStatement statement = null;

	public  void hienThiDanhSachSP() {
		//Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        
        try {
        	ketNoisql();
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
		QuanLiLoaiSanPham quanLiLoaiSanPham = new QuanLiLoaiSanPham();
		ArrayList<String> ds = new ArrayList<String>();
		do {	
		 ds=quanLiLoaiSanPham.layMaLoaiSP();
		 System.out.println("Moi ban nhap ma loai san pham ");
		 for (String string : ds) {
			 System.out.println(string);
		}
		 nMaLoaiSanPham = scan.nextLine();
	        
	        if(!ds.contains(nMaLoaiSanPham)) {
	        	System.out.println("Ban da nhap sai ma loai san pham, moi ban nhap lai!!!!!");
	        }
		}while(!ds.contains(nMaLoaiSanPham));
	
		
		SanPham sanPham = new SanPham();
		sanPham.input();
	
		try {
			ketNoisql();
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
		System.out.println("Sua thong tin san pham theo ma san pham");
		SanPham sanPham = new SanPham();
		sanPham.input();
		
		try {
  			ketNoisql();
			String sql2 = ("update sanpham set TenSP = ?, Gia = ? " + "where MaSP = ?");
			statement = connection.prepareCall(sql2);
			statement.setString(1, sanPham.getTenSP());
			statement.setInt(2, sanPham.getGia());
			statement.setString(3, sanPham.getMaSP());
			statement.execute();
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}
	
	public  void xoaSP() {
		System.out.println("Nhap ma san pham can xoa: ");
        String MaSP = scan.nextLine();
		try {
			ketNoisql();
			String sql2 = ("delete from sanpham where MaSP = ?");
			statement = connection.prepareCall(sql2);
			statement.setString(1, MaSP);
			statement.execute();
			
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}
	
	public  void timSp() {
		System.out.println("Nhap ma loai san pham can Tim: ");
        String MaLoaiSP = scan.nextLine();
		try {
			ketNoisql();
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
	
	public void ketNoisql() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
		String user="root";
		String password="12345678";
		 connection=(Connection) DriverManager.getConnection(url, user, password);
	}
	
}
