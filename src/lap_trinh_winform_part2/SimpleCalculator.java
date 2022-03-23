package lap_trinh_winform_part2;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    SimpleCalculator(){
        JFrame f = new JFrame("Simple calculator");
        JLabel num1 = new JLabel("Num1");
        JLabel num2 = new JLabel("Num2");
        JLabel result = new JLabel("Result");
        JLabel KQ = new JLabel();
        JTextField tf1 = new JTextField(6);
        JTextField tf2 = new JTextField(6);
        JButton Cong = new JButton("+");
        JButton Tru = new JButton("-");
        JButton Nhan = new JButton("*");
        JButton Chia = new JButton("/");

        num1.setBounds(50,20,150,30);
        num2.setBounds(50,70,150,30);
        num1.setOpaque(true);
        //num1.setBackground(Color.BLUE);
        result.setBounds(50,120,150,30);
        KQ.setBounds(250,120,200,30);
        KQ.setBorder(BorderFactory.createLineBorder(Color.black));
        tf1.setBounds(250,20,200,30);
        tf2.setBounds(250,70,200,30);
        Cong.setBounds(100,190,63,40);
        Tru.setBounds(179,190,63,40);
        Nhan.setBounds(258,190,63,40);
        Chia.setBounds(337,190,63,40);
        
        
        f.setSize(500,300);
        f.setLayout(null);
        f.add(num1);
        f.add(tf1);
        f.add(num2);
        f.add(tf2);
        f.add(result);
        f.add(KQ);
        f.add(Cong);
        f.add(Tru);
        f.add(Nhan);
        f.add(Chia);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              try {
                  int num1 = Integer.parseInt(tf1.getText());
                  int num2 = Integer.parseInt(tf2.getText());
                  KQ.setText(String.valueOf(num1+num2));

            } 
             catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(f,"Vui long nhap vao so nguyen","Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        });
        Tru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              try {
                  int num1 = Integer.parseInt(tf1.getText());
                  int num2 = Integer.parseInt(tf2.getText());
                  KQ.setText(String.valueOf(num1-num2));

            } 
             catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(f,"Vui long nhap vao so nguyen","Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        });
        Nhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              try {
                  int num1 = Integer.parseInt(tf1.getText());
                  int num2 = Integer.parseInt(tf2.getText());
                  KQ.setText(String.valueOf(num1*num2));

            } 
             catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(f,"Vui long nhap vao so nguyen","Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        });
        Chia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              try {
                  int num1 = Integer.parseInt(tf1.getText());
                  int num2 = Integer.parseInt(tf2.getText());
                  KQ.setText(String.valueOf(num1*1.0/num2));

            } 
             catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(f,"Vui long nhap vao so nguyen","Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        });

    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}