package lap_trinh_winform_part2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4 extends JPanel implements ActionListener {
	
	//Đặt tên cho các JradioButton
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
		bird.setActionCommand(birtString);//dùng cho hàm actionPerformed, khi người dùng click vào button thì chương trình hiểu và hiển thị ảnh
		bird.setSelected(true);// mặc định khi chạy chương trình thì nút  Bird được chọn
		
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
		
		// Thêm sự kiện cho các Button
		bird.addActionListener(this);
		cat.addActionListener(this);
		dog.addActionListener(this);
		rabbit.addActionListener(this);
		pig.addActionListener(this);
		
		//Đường dẫn thư mục các ảnh cần hiển thị
		 picture = new JLabel(createImageIcon("images/"
                 + birtString
                 + ".gif"));
		
		
		
		//kích thước picture
		picture.setPreferredSize(new Dimension(400, 600));
		
		//đặt các nút thành một cột
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

	//Trả về hình ảnh hoặc đường dẫn không hợp lệ
	protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = RadioButtonDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Không tìm thấy file: " + path);
            return null;
        }
    }
	
	 private static void khoiTaoJframe() {
	        
	        JFrame frame = new JFrame("RadioButtonDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      
	        JComponent newContentPane = new Bai4();
	        frame.setContentPane(newContentPane);

	        frame.pack();//kích thước cho Jframe
	        frame.setVisible(true);
	    }

	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	khoiTaoJframe();
	            }
	        });

	}

	
//https://v1study.com/java-swing-cach-su-dung-button-check-box-va-radio.html
//https://docs.oracle.com/javase/tutorial/uiswing/examples/components/RadioButtonDemoProject/src/components/RadioButtonDemo.java
//Phương thức pack () được định nghĩa trong lớp Window trong Java và nó định kích thước khung sao cho tất cả nội dung của nó bằng hoặc cao hơn kích thước ưa thích của chúng.
}
