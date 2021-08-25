package eventdriven;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main6 {

	public static void main(String[] args) {
		// Window- Frame
		JFrame frame=new JFrame("Welcome");
		frame.setSize(400, 100);
		
		// Components 
		
		JLabel lbl=new JLabel("Name");
		JTextField field=new JTextField(20);
		
		JButton btn=new JButton("Say Hello");
	
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String input=field.getText();
			if(input.length()>=10) {
				JOptionPane.showMessageDialog(null,"Number of charcters has exceeded the limit");
			}
			else {
				JOptionPane.showMessageDialog(null,"You are welcome "+ input);
			}
				
			}
		});
		
		frame.add(lbl);
		frame.add(field);
		frame.add(btn);
	
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

	}

}
