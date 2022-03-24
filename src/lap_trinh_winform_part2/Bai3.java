package lap_trinh_winform_part2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Color;




public class Bai3 {
	
	JFrame f;
	JComboBox cb;
	
	Bai3(){
		//Khởi tạo JFrame 
		f = new JFrame("JComboBox");
		String combo[]= {"White","Green","Blue","Yellow","Red"};
		cb = new JComboBox(combo);
		cb.setBounds(50,50,90,20);
		
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,300);
		
		cb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cb.getSelectedItem() == "White") {
					f.getContentPane().setBackground(Color.WHITE);
				} else if(cb.getSelectedItem() == "Green") {
					f.getContentPane().setBackground(Color.GREEN);
				} else if(cb.getSelectedItem() == "Blue") {
					f.getContentPane().setBackground(Color.BLUE);
				} else if(cb.getSelectedItem() == "Yellow") {
					f.getContentPane().setBackground(Color.YELLOW);
				}  else if(cb.getSelectedItem() == "Red") {
					f.getContentPane().setBackground(Color.RED);
				}
				
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); 
	}
	public static void main(String[] args) {
		new Bai3();

	}

}
