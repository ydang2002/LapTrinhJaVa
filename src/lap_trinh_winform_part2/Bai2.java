package lap_trinh_winform_part2;
import javax.swing.*;
import java.awt .event. *;
import java.awt.*;

public class Bai2 extends JFrame implements ActionListener {
	
	JFrame f;
	JButton btTong, btHieu, btTich, btThuong;
	//hai so nhap vao va ket qua
	JTextField tf1, tf2, tf3;
	//luu ket qua 
	private double result;
	//Dùng nhận tầng contentPane của JFrame
	//Container container;
	//Nhóm thành phần trên giao diện 
	JPanel panel1, panel2;
	
	
	public Bai2() {
		//Tạo các thành phần tren6v giao diện
		f = new JFrame("SimpleCalculator");
		
		JLabel numlb1, numlb2, Resultlb;
		numlb1 = new JLabel("Num1: ");
		tf1 = new JTextField();
		numlb2 = new JLabel("Num2: ");
		tf2 = new JTextField();
		Resultlb = new JLabel("Result: ");
		tf3 = new JTextField();
		//Textfield chứa kết quả không được dùng dữ liệu
		tf3.setEditable(false);
		
		
			
		
		//Panel1 chúa ba textField
		panel1 = new JPanel();
		//Tạo layout gồm 3 hàng 2 cột
		panel1.setLayout(new GridLayout(3,2));
		//Đưa các thành phần vào Panel1
		panel1.add(numlb1);
		panel1.add(tf1);
		panel1.add(numlb2);
		panel1.add(tf2);
		panel1.add(Resultlb);
		panel1.add(tf3);
		
		
		//Tạo 4 nút cho 4 phép toán
		btTong = new JButton("+");
		btHieu = new JButton("-");
		btTich = new JButton("*");
		btThuong = new JButton("/");
		
		btTong.addActionListener(this);
		btHieu.addActionListener(this); 
		btTich.addActionListener(this); 
		btThuong.addActionListener(this);
		
		//panel2 chứa 4 nút
		panel2 = new JPanel();
		panel2.add(btTong);
		panel2.add(btHieu);
		panel2.add(btTich);
		panel2.add(btThuong);
		
		//Đưa 2 Panel1 và Panel2 vào JFrame
		f.add(panel1);
		f.add(panel2,"South");
		f.setSize(300,200);
		//f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//Hàm tính tổng
	public void Tong() {
		
		if(tf1.getText() != null && !tf1.getText().trim().equals("") || tf2.getText() != null && !tf2.getText().trim().equals("") || tf1.getText() == null || tf2.getText() == null) {
			try {
				
				double num = Double.parseDouble(tf1.getText());
				double number = Double.parseDouble(tf2.getText());
				
				
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,  "Nhập sai dữ liệu");
			}
		}
		
		
		
		result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
			//Hiển thị kết quả
		   tf3.setText(String.valueOf(result)); 
	}
	
	//Hàm tính Hiệu
	public void Hieu() {
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	//Hàm tính tích
	public void Tich() {
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result)); 
	}
	
	//Hàm tính thương
	public void Thuong() {
		 result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
		    tf3.setText(String.valueOf(result));
	}
	
	//Xử lí khi người dùng nhấn các nút phép toán
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btTong) {
			Tong();
		}
		if(e.getSource() == btHieu) {
			Hieu();
		}
		if(e.getSource() == btTich) {
			Tich();
		}
		if(e.getSource() == btThuong) {
			Thuong();
		}
	}

	public static void main(String[] args) {
		
		new Bai2();
		
		/*JFrame f = new JFrame("SimpleCalculator");
		
		
		int qes;
		do {
			
			String num1 = JOptionPane.showInputDialog("");
			String num2 = JOptionPane.showInputDialog("");
			if(num1 != null && !num1.trim().equals("") || num2 != null && !num2.trim().equals("")) {
				try {
					
					int num = Integer.parseInt(num1);
					int number = Integer.parseInt(num2);
					
					
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,  "Nhập sai dữ liệu");
				}
			}
			qes=JOptionPane.showConfirmDialog(null, "Tiếp tục không?", "Question",JOptionPane.YES_NO_OPTION);
		}while(qes == JOptionPane.YES_OPTION);*/
		
		
		
		
//https://codelearn.io/sharing/lam-mot-may-tinh-bang-java-swing
	}

	

	

}
