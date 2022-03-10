package lap_trinh_winform_part1;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class chuong3_bai2 {

	public static void main(String[] args) {
		JFrame f=new JFrame("Label Example");
		f.setBounds(250,200,250,200);
		JLabel l1,l2;
		JButton b1,b2,b3;
		JTextField t1,t2;
		
		l1 = new JLabel("Enter your name");
		l2 = new JLabel("Enter your city");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		b1 = new JButton("Clear");
		b2 = new JButton("Submit");
		b3 = new JButton("Exit");
		
		b1.setSize(300,200);
		b2.setSize(300,200);
		b3.setSize(300,200);
		l1.setSize(300,200);
		l2.setSize(300,200);
		
		
		
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t1);
		
		f.add(l2);
		f.add(t2);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
