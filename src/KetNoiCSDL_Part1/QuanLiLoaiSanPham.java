package KetNoiCSDL_Part1;

import java.util.ArrayList;
import java.sql.*;

public class QuanLiLoaiSanPham {

	public  ArrayList<String> layMaLoaiSP(){
		ArrayList<String> listMaLoaiSP = new ArrayList<>();
		
		
			try {
			
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
}
