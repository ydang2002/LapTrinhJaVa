package lap_trinh_winform_part3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Bai1  {

	DefaultTableModel model = new DefaultTableModel();
	JTable jTable1 = new JTable();
	
	private JFrame f;
	private JButton bt1, bt2;
	private JPanel jPanel1, jPanel2, jpanel3;
	private JLabel lb;
	
	public Bai1() {
		initComponents();
		jTable1.setModel(model);
		//jTable1.setBounds(30,40,100,200);
		model.addColumn("Name");
		model.addColumn("Phone no");
		
		
	}
	
	private void initComponents() {
		f = new JFrame();
		lb = new JLabel("Phonebook");
		//lb.setBounds(100, 50, 300, 400);
		bt1 = new JButton("Add Contact");
		//bt1.setBounds(40, 200, 150, 30);
		bt2 = new JButton("Delete Contact");
		//bt2.setBounds(200, 200, 150, 30);
		
		JScrollPane sp=new JScrollPane(jTable1);
		
		jPanel1 = new JPanel();
		jPanel1.add(lb);
		//jPanel1.setBounds(100, 10, 300, 400);
		
		jpanel3 = new JPanel();
		jpanel3.add(sp);
		//jpanel3.setBounds(100,100,100,200);
		
		jPanel2 = new JPanel();
		jPanel2.add(bt1);
		jPanel2.add(bt2);
		//jPanel2.setBounds(100, 200, 300, 400);
		
		
		
		f.add(jPanel1,BorderLayout.NORTH);
		f.add(jPanel2,BorderLayout.SOUTH);
		f.add(jpanel3,BorderLayout.CENTER);
		
		f.setSize(500,300);
		//f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnAddActionPerformed(evt);
				
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnDeleteActionPerformed(evt);
				
			}
		});
	}
	
	private void btnAddActionPerformed(ActionEvent evt) {
		String name = JOptionPane.showInputDialog(f,"Nhập tên");
		String phone = JOptionPane.showInputDialog(f,"Nhập số điện thoại");
		
		Object rowData[] = new Object[2];
		rowData[0] = name;
		rowData[1] = phone;
		
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.addRow(rowData);
	}
	
	private void btnDeleteActionPerformed(ActionEvent evt) {
		int i=jTable1.getSelectedRow();
		if(i>=0){
			model.removeRow(i);
		}
	}
	
	public static void main(String[] args) {
		new Bai1();
////hghhhhhhhhhhhhhhhhhhhhhh
	}

}
