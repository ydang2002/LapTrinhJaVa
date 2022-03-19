package lap_trinh_winform_part2;

import javax.swing.*;
import java.awt.event.*;

public class Bai5 extends JFrame implements  ActionListener{
	JCheckBox checkBox1, checkBox2, checkBox3, checkBox4;
	JLabel label;
	JButton btn;
	
		Bai5(){
			JFrame f = new JFrame("Food Ordering");
			
			label = new JLabel("Menu");
			label.setBounds(50,20,100,50);
			
			btn = new JButton("Order");
			btn.setBounds(100,270,100,30);
			
			checkBox1 = new JCheckBox("Pizza ($25)");
			checkBox1.setBounds(100,50,100,50);
			
			checkBox2 = new JCheckBox("Burger ($20)");
			checkBox2.setBounds(100,100,100,50);
			
			checkBox3 = new JCheckBox("Tea ($5)");
			checkBox3.setBounds(100,150,100,50);
			
			checkBox4 = new JCheckBox("Coffee ($10)");
			checkBox4.setBounds(100,200,100,50);
			
			f.add(btn);
			f.add(label);
			f.add(checkBox1);
			f.add(checkBox2);
			f.add(checkBox3);
			f.add(checkBox4);
			
			/*checkBox1.addItemListener(this);
			checkBox2.addItemListener(this);
			checkBox3.addItemListener(this);
			checkBox4.addItemListener(this);*/
			btn.addActionListener(this);
			
			f.setSize(400,450);
			f.setLayout(null);
			f.setVisible(true);
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int amount = 0;
			String msg = "";
			if(checkBox1.isSelected()) {
				amount += 25;
				 msg += "Pizza : $25\n";
			}
			
			if(checkBox2.isSelected()) {
				amount += 20;
				 msg += "Burger : $20\n";
			}
			
			if(checkBox3.isSelected()) {
				amount += 5;
				 msg += "Tea : $5\n";
			}
			
			if(checkBox4.isSelected()) {
				amount += 10;
				 msg += "Coffee : $10\n";
			}
			
			msg += "--------------------\n";
			
			JOptionPane.showMessageDialog(this, msg + "Total: $" + amount);
			
		}
		

	public static void main(String[] args) {
		new Bai5();
	}

	
}
