package lap_trinh_winform_part1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class chuong3_bai3 {

	public static void main(String[] args) {
		JFrame f=new JFrame("GridLayout");
		//f.setBounds(250,200,300,200);
		
		f.setLayout(new GridLayout(3,3,5,5));
		
		f.add(new JButton("Press 1"));
		f.add(new JButton("Press 2"));
		f.add(new JButton("Press 3"));
		f.add(new JButton("Press 4"));
		f.add(new JButton("Press 5"));
		f.add(new JButton("Press 6"));
		f.add(new JButton("Press 7"));
		f.add(new JButton("Press 8"));
		
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
