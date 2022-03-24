package lap_trinh_winform_part2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Bai1 implements ActionListener {
	JFrame  f; 
	JButton b;
	JLabel l;
	//khoi tao bien dem i
	private int i = 0;
	
	public  Bai1() {
		f = new JFrame("Counter");
		b = new JButton ("Click me");
		l = new JLabel("Click Count: "+ i);
		
		
		b.setBounds(50,10,95,30);
		b.addActionListener(this);//Thêm sự kiện cho Button: Click me
		
		f.add(l);
		f.add(b);
		
		l.setBounds(150,10,95,30);
		f.setSize(300,200);
		f.setLayout(null);//không dùng bố cục
		f.setVisible(true);//Hiển thị Jframe
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			i = i + 1;
			l.setText("Click Count: "+i);
		}
		
	}
	public static void main(String[] args) {
		
		new Bai1();
	}

	

	
	
	
	
	
}
