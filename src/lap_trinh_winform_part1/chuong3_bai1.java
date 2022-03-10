package lap_trinh_winform_part1;
import javax.swing.*;
public class chuong3_bai1 {

	public static void main(String[] args) {
		JFrame f=new JFrame("HelloWord");
		JButton b=new JButton("Click");
		f.setBounds(250,200,300,200);
		b.setBounds(80,80,100, 40);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
