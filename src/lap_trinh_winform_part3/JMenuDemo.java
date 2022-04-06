package lap_trinh_winform_part3;
import javax.swing.*;
 
import javafx.scene.paint.Color;
 
import java.awt.event.*;
import java.awt.*;
 
 
public class JMenuDemo implements ActionListener {
    JFrame f;
    JLabel l;
    JMenuItem txtBlue,txtRed,txtYellow,bgBlue,bgRed,bgYellow;
    void prepareMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu textColor = new JMenu("Mau chu");
        JMenu BackgroundColor = new JMenu("Mau nen");
        txtBlue = new JMenuItem("Mau xanh");
        txtRed = new JMenuItem("Mau do");
        txtYellow = new JMenuItem("Mau vang");
        bgBlue = new JMenuItem("Mau xanh");
        bgRed = new JMenuItem("Mau do");
        bgYellow = new JMenuItem("Mau vang");
        txtBlue.addActionListener(this);
        txtRed.addActionListener(this);
        txtYellow.addActionListener(this);
        bgBlue.addActionListener(this);
        bgRed.addActionListener(this);
        bgYellow.addActionListener(this);
 
        textColor.add(txtBlue);
        textColor.add(txtRed);
        textColor.add(txtYellow);
        BackgroundColor.add(bgBlue);
        BackgroundColor.add(bgRed);
        BackgroundColor.add(bgYellow);
        mb.add(textColor);
        mb.add(BackgroundColor);
        f.setJMenuBar(mb);
 
    }
    JMenuDemo(){
        f = new JFrame("JMenu Demo");
        prepareMenu();
        f.setSize(800,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("Hello Java!");
        l.setFont(new Font("Arial", Font.BOLD, 25));
        l.setBounds(350,40,150,40);
        f.add(l);
 
       
       
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == txtBlue) l.setForeground(java.awt.Color.BLUE);
       if (e.getSource() == txtRed) l.setForeground(java.awt.Color.RED);
       if (e.getSource() == txtYellow) l.setForeground(java.awt.Color.YELLOW);
       if (e.getSource() == bgBlue) f.getContentPane().setBackground(java.awt.Color.BLUE);
       if (e.getSource() == bgRed) f.getContentPane().setBackground(java.awt.Color.RED);
       if (e.getSource() == bgYellow) f.getContentPane().setBackground(java.awt.Color.YELLOW);
       
    }
   
    public static void main(String[] args) {
        new JMenuDemo();
    }
   
 
}