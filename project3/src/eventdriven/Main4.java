package eventdriven;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JBUTTON");
		JButton btn1 = new JButton();
		ImageIcon icon = new ImageIcon("..\\src\\images\\like.jpg");
		

		btn1.setIcon(icon);
		btn1.setBounds(125, 30, 120, 50);
		frame.add(btn1);

		frame.setSize(400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
