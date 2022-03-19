package lap_trinh_winform_part2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4 extends JPanel implements ActionListener {
	
	static String birtString = "Bird";
	static String catString = "Cat";
	static String dogString = "Dog";
	static String rabbitString = "Rabbit";
	static String pigString = "Pig";
	
	JLabel picture;
	JFrame f;
	JRadioButton bird, cat, dog, rabbit, pig; 
	
	public Bai4() {
		super(new BorderLayout());
		
		
		bird = new JRadioButton (birtString);
		bird.setActionCommand(birtString);
		bird.setSelected(true);
		
		cat = new JRadioButton(catString);
		cat.setActionCommand(catString);
		
		dog = new JRadioButton(dogString);
		dog.setActionCommand(dogString);
		
		rabbit = new JRadioButton(rabbitString);
		rabbit.setActionCommand(rabbitString);
		
		pig = new JRadioButton(pigString);
		pig.setActionCommand(pigString);
		
		//Nhóm các nút radio
		ButtonGroup group = new ButtonGroup();
		group.add(bird);
		group.add(cat);
		group.add(dog);
		group.add(rabbit);
		group.add(pig);
		
		// Đăng kí listener cho các nút
		bird.addActionListener(this);
		cat.addActionListener(this);
		dog.addActionListener(this);
		rabbit.addActionListener(this);
		pig.addActionListener(this);
		
		 picture = new JLabel(createImageIcon("images/"
                 + birtString
                 + ".gif"));
		
		
		
		//kích thước picture
		picture.setPreferredSize(new Dimension(400, 600));
		
		//đạt các nút thành một cột
		JPanel radioPanel = new JPanel(new GridLayout(0, 1));
		radioPanel.add(bird);
		radioPanel.add(cat);
		radioPanel.add(dog);
		radioPanel.add(rabbit);
		radioPanel.add(pig);
		
		//Đặt vị trí các 
		add(radioPanel, BorderLayout.LINE_START);
        add(picture, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
      
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		picture.setIcon(createImageIcon("images/"
                + e.getActionCommand()
                + ".gif"));
		
	}

	protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = RadioButtonDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
	
	 private static void createAndShowGUI() {
	        
	        JFrame frame = new JFrame("RadioButtonDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      
	        JComponent newContentPane = new Bai4();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        
	        frame.pack();
	        frame.setVisible(true);
	    }

	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });

	}

	

}
