package lap_trinh_winform_part2;
import javax.swing.JOptionPane;

public class Bai2 {

	public static void main(String[] args) {
		int qes;
		do {
			
			String num1 = JOptionPane.showInputDialog("");
			String num2 = JOptionPane.showInputDialog("");
			if(num1 != null && !num1.trim().equals("") || num2 != null && !num2.trim().equals("")) {
				try {
					
					int num = Integer.parseInt(num1);
					int number = Integer.parseInt(num2);
					
					
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,  "Nhập sai dữ liệu");
				}
			}
			qes=JOptionPane.showConfirmDialog(null, "Tiếp tục không?", "Question",JOptionPane.YES_NO_OPTION);
		}while(qes == JOptionPane.YES_OPTION);
		
		
		
		

	}

}
