package KeoThaGiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M\u00E3 H\u1ECDc Sinh", "T\u00EAn H\u1ECDc Sinh", "M\u00E3 Gi\u1EA3ng Vi\u00EAn", "T\u00EAn Gi\u1EA3ng Vi\u00EAn"}));
		comboBox.setBounds(25, 24, 95, 21);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(153, 25, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00ECm");
		btnNewButton.setBounds(275, 24, 85, 21);
		contentPane.add(btnNewButton);
	}
}
