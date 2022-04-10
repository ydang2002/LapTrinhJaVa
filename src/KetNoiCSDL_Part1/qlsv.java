package KetNoiCSDL_Part1;

import java.sql.Connection;
import java.sql.DriverManager;

public class qlsv {/*SanPham sanPham = new SanPham
                		(resultSet.getString("MaSP"), 
                        resultSet.getString("TenSP"), 
                        resultSet.getInt("Gia"),  
                        resultSet.getString("MaLoaiSP"));*/
	/*while(rs.next())
				System.out.println("Ma San Pham: " + rs.getString(1) +
				" Tên san Pham: " + rs.getString(2) + " Gia: " +
				rs.getInt(3) + " Ma loai san pham: " + rs.getInt(4));*/

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/QLHS";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			
			System.out.println("Kết nối thành công");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Kết nối thất bại");
			//System.err.println(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
		}
	}

}
