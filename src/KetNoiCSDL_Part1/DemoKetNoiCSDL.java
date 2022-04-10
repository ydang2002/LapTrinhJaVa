package KetNoiCSDL_Part1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoKetNoiCSDL {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbUrl="jdbc:sqlserver://Localhost:1433;DatabaseName=baiTapSQL";
			String username="sa";
			String password="";
			Connection con=DriverManager.getConnection(dbUrl, username, password);
			
			System.out.println("Kết nối thành công");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Kết nối thất bại");
			//System.err.println(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
		}
			

	}

}