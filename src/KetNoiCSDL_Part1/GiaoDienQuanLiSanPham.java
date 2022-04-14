package KetNoiCSDL_Part1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class GiaoDienQuanLiSanPham extends JFrame {
	DefaultTableModel model = new DefaultTableModel();
	JTable jTable1 = new JTable();
	JLabel jLabel, jLabe2, jLabe3; 
	JTextField tfMaSP, tfTenSP, tfGia;
	JButton btHienThi, btThem, btSua, btXoa, btTimKiem,btThoat,btXoatf;
	JFrame jFrame;
	JPanel jPanel1, jPanel2, jpanel3;
	JComboBox<String> cbMaLoaiSP;
	
	String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
	String user="root";
	String password="12345678";
	
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	int q, i;
	
	
	public GiaoDienQuanLiSanPham() {
		initComponents();
		doDuLieuComboBox();
		jTable1.setModel(model);
		model.addColumn("Mã sản phẩm");
		model.addColumn("Tên sản phẩm");
		model.addColumn("Giá");
		model.addColumn("Tên loai sản phẩm");
		
	}
	
	private void initComponents() {
		 jFrame = new JFrame("Quản Lí Sản Phẩm");
		 jLabel = new JLabel("Mã sản phẩm");
		 jLabe2 = new JLabel("Tên sản phẩm");
		 jLabe3 = new JLabel("Giá");
		 cbMaLoaiSP = new JComboBox<String>();
		 
		 tfMaSP = new JTextField();
		 tfTenSP = new JTextField();
		 tfGia = new JTextField();
		 
		 btXoatf = new JButton("Nhập Lại");
		 btHienThi = new JButton("Hiển thị danh sách");
		 btThem = new JButton("Thêm");
		 btSua = new JButton("sửa");
		 btXoa = new JButton("xóa");
		 btTimKiem = new JButton("Tìm kiếm");
		 btThoat = new JButton("Thoát");
		 
		 JScrollPane sp=new JScrollPane(jTable1);
		 jPanel1 = new JPanel();
		 jPanel1.setLayout(new GridLayout(4,2));
		 jPanel1.add(jLabel);
		 jPanel1.add(tfMaSP);
		 jPanel1.add(jLabe2);
		 jPanel1.add(tfTenSP);
		 jPanel1.add(jLabe3);
		 jPanel1.add(tfGia);
		 jPanel1.add(cbMaLoaiSP);
		 
		 jPanel2 = new JPanel();
		 jPanel2.add(btXoatf);
		 jPanel2.add(btHienThi);
		 jPanel2.add(btThem);
		 jPanel2.add(btSua);
		 jPanel2.add(btXoa);
		 jPanel2.add(btTimKiem);
		 jPanel2.add(btThoat);
		 
		 
		 
		 
		 jpanel3 = new JPanel();
		 jpanel3.add(sp);
		 
		 jFrame.add(jPanel1,BorderLayout.NORTH);
		 jFrame.add(jPanel2,BorderLayout.CENTER);
		 jFrame.add(jpanel3,BorderLayout.SOUTH);
		 
		 jFrame.setBounds(100, 100, 752, 599);
		 jFrame.setVisible(true);
		 jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 jTable1.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent evt) {
			 jTable1MouseClicked(evt); }});
		 
		 
		 btHienThi.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 btHienThiActionPerformed(evt); }});
		 
		 btXoatf.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 btXoatfActionPerformed(evt); }});
		 
		 btThem.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
			 btnThemActionPerformed(evt); }});
		 
		 btSua.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 btSuaActionPerformed(evt); }});
		 
		 btXoa.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 btXoaActionPerformed(evt); }});
		 
		 btThoat.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
			 btnThoatActionPerformed(evt); }});
		 
		 
		 
		 cbMaLoaiSP.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 cbMaLoaiSPActionPerformed(evt); }});
	}
	
	private void jTable1MouseClicked (MouseEvent evt) {
		int i=jTable1.getSelectedRow();
		if (i>=0){
			tfMaSP.setText(model.getValueAt(i, 0).toString());
			tfTenSP.setText(model.getValueAt(i, 1).toString());
			tfGia.setText(model.getValueAt(i, 2).toString());
			cbMaLoaiSP.setSelectedItem(model.getValueAt(i, 3).toString());//xem lại setToolTipText
			}
		}
	
	private void loadData() {
		try {
			connection = (Connection) DriverManager.getConnection(url, user, password);
			String sql = ("select MaSP, TenSP, Gia, TenLoaiSP from SanPham, LoaiSanPham where SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP");
			statement = connection.prepareStatement(sql);
			rs = statement.executeQuery();
			
			ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
			q = stData.getColumnCount();
			
			DefaultTableModel recordTable = (DefaultTableModel)jTable1.getModel();
			recordTable.setRowCount(0);
			
			while(rs.next()) {
				Vector<String> columnData = new Vector<String>();
				for(int i=1; i <= q; i++) {
					columnData.add(rs.getString(1));
					columnData.add(rs.getString(2));
					columnData.add(Integer.toString(rs.getInt(3)));
					columnData.add(rs.getString(4));
				}
				recordTable.addRow(columnData);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
private void btHienThiActionPerformed(ActionEvent evt) {
	loadData();
	}

	private void btXoatfActionPerformed(ActionEvent evt) {
		tfMaSP.setText("");
		tfTenSP.setText("");
		tfGia.setText("");
	}
	
	private void btnThemActionPerformed(ActionEvent evt) {
	try {
		connection = (Connection) DriverManager.getConnection(url, user, password);
		String sql = ("insert into sanpham (MaSP, TenSP, Gia, MaLoaiSP) value(?, ?, ?, ?)");
		statement = connection.prepareStatement(sql);
		
		statement.setString(1, tfMaSP.getText());
		statement.setString(2, tfTenSP.getText());
		statement.setString(3, tfGia.getText());
		statement.setString(4, cbMaLoaiSP.getSelectedItem().toString());
		
		
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	loadData();
	}
	
	private void btSuaActionPerformed(ActionEvent evt) {
		int i=jTable1.getSelectedRow();
		try {
			connection = (Connection) DriverManager.getConnection(url, user, password);
			String sql = ("update sanpham set TenSP = ?, Gia = ?, MaLoaiSP = ?" + "where MaSP = ?");
			statement = connection.prepareStatement(sql);
			statement.setString(4, tfMaSP.getText());
			statement.setString(1, tfTenSP.getText());
			statement.setString(2, tfGia.getText());
			statement.setString(3, cbMaLoaiSP.getSelectedItem().toString());
			
				statement.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		loadData();
	}
	
	private void btXoaActionPerformed (ActionEvent evt) {
		int i=jTable1.getSelectedRow();
		try {
			connection = (Connection) DriverManager.getConnection(url, user, password);
			String sql = ("delete from sanpham where MaSP = ?");
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, model.getValueAt(i, 0).toString());
			
				statement.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		loadData();
	}
	
	private void btnThoatActionPerformed (ActionEvent evt) {
		System.exit(0);
		}
	
	
	
	
	private void cbMaLoaiSPActionPerformed (ActionEvent evt) {
		String MaLoaiSP = (String)cbMaLoaiSP.getSelectedItem().toString();
		//statement.setString(3, MaLoaiSP);
	}
	
	
	
	
	private void doDuLieuComboBox() {
		try {
			
			String url="jdbc:mysql://Localhost:3306/QuanLiSanPham";
			String user="root";
			String password="12345678";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			Statement stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery("select MaLoaiSP from loaisanpham  ");
			cbMaLoaiSP.removeAllItems();//xóa tất cả các mục được hiển thị trong comboBox
	
			while(rs.next())
            {
				//đổ dữ liệu vào conboBox
				cbMaLoaiSP.addItem(rs.getString("MaLoaiSP"));
            }
				rs.close();
				stmt.close();
				connection.close();
				
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}

	public static void main(String[] args) {
		new GiaoDienQuanLiSanPham();

	}
	
	

}
