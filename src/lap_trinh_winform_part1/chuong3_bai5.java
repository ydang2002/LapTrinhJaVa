package lap_trinh_winform_part1;

import java.awt.*;
import javax.swing.*;

public class chuong3_bai5 {
	
	chuong3_bai5(){
		JFrame f = new JFrame("JPanel Demo Program");
		f.setSize(305,150);
		JPanel panel1 = new JPanel();
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b;
		
		l1 = new JLabel("Enter username:");
		l2 = new JLabel("Enter Passworrd:");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		b = new JButton("Login");
		
		l1.setSize(300,200);
		l2.setSize(300,200);
		
		b.setSize(200,200);
		
		
		panel1.setBorder(BorderFactory.createTitledBorder("Login Panel"));
		panel1.add(l1);
		panel1.add(t1);
		
		panel1.add(l2);
		panel1.add(t2);
		
		panel1.add(b);
		
		f.add(panel1);
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new chuong3_bai5();

	}

}
