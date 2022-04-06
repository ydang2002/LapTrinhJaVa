package lap_trinh_winform_part3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Bai2 implements ActionListener  {
	
	private JFrame f;
	private JLabel lb;
	private JMenuItem vangChuMenuItem, vangNenMenuItem, xanhChuMenuItem, xanhNenMenuItem, doChuMenuItem, doNenMenuItem;
	
	public Bai2() {
		prepareGUI();
		showMenu();
	}
	
	private void prepareGUI() {
		f = new JFrame();
		f.setSize(400,400);
		lb = new JLabel("Hello Java!",JLabel.CENTER);
		f.add(lb);
	}
	
	private void showMenu() {
		//tao một menu bar
		JMenuBar MenuBar = new JMenuBar();
		//Tạo các menu
		JMenu mauChuMenu, mauNenMenu;
		mauChuMenu = new JMenu("Mau chu");
		mauNenMenu = new JMenu("Mau nen");
		//Tạo các item
		
		vangChuMenuItem = new JMenuItem("Mau vang");
		vangNenMenuItem = new JMenuItem("Mau vang");
		xanhChuMenuItem = new JMenuItem("Mau xanh");
		xanhNenMenuItem = new JMenuItem("Mau xanh");
		doChuMenuItem = new JMenuItem("Mau do");
		doNenMenuItem = new JMenuItem("Mau do");
		
		vangChuMenuItem.addActionListener(this);
		vangNenMenuItem.addActionListener(this);
		xanhNenMenuItem.addActionListener(this);
		xanhChuMenuItem.addActionListener(this);
		doChuMenuItem.addActionListener(this);
		doNenMenuItem.addActionListener(this);
		
		//Them item vào các menu
		mauChuMenu.add(vangChuMenuItem);
		mauChuMenu.add(xanhChuMenuItem);
		mauChuMenu.add(doChuMenuItem);
		mauNenMenu.add(vangNenMenuItem);
		mauNenMenu.add(xanhNenMenuItem);
		mauNenMenu.add(doNenMenuItem);
		//Thêm menu vào menubar
		MenuBar.add(mauChuMenu);
		MenuBar.add(mauNenMenu);
		f.setJMenuBar(MenuBar);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == doChuMenuItem) {
			lb.setForeground(Color.RED);
		}
		if(e.getSource() == vangChuMenuItem) {
			lb.setForeground(Color.YELLOW);
		}
		if(e.getSource() == xanhChuMenuItem) {
			lb.setForeground(Color.GREEN);
		}
		if(e.getSource() == doNenMenuItem) {
			f.getContentPane().setBackground(java.awt.Color.RED);
		}
		if(e.getSource() == vangNenMenuItem) {
			f.getContentPane().setBackground(java.awt.Color.YELLOW);
		}
		if(e.getSource() == xanhNenMenuItem) {
			f.getContentPane().setBackground(java.awt.Color.GREEN);
		}
		
		
	}
	

	public static void main(String[] args) {
		 new Bai2();

	}

}
