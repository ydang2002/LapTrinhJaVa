package lap_trinh_winform_part2;
import javax.swing.*;
import java.awt.event.*;
public class test implements ActionListener {
	JFrame f;
	JButton b,c;
	JTextField tf;
	public test() {
	f=new JFrame("Button Example");
	tf=new JTextField();
	tf.setBounds(50,50, 150,20);
	b=new JButton("Click Here");
	b.setBounds(50,100,95,30);
	b.addActionListener(this);
	c= new JButton(new ImageIcon("E:\\ImageIcon\\Find.png"));
	c.setBounds(200,100 , 95, 30);
	c.addActionListener(this);
	f.add(b);f.add(tf); f.add(c);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == b) {
		tf.setText("Welcome to Javapoint.");
		} else if (e.getSource() == c) {
		JOptionPane.showConfirmDialog(f, "Bạn chắc chắn tiếp tụcchứ?");
		}
	}
	
	public static void main(String[] args) {
		new test();

	}

}
