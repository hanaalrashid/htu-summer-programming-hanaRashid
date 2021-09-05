package programming3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventDriven2 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Welcome");
		frame.setSize(400, 100);
		
		// Components
		//JPanel pnl=new JPanel();
		JLabel lbl=new JLabel("Name");
		JTextField txtName=new JTextField(20);
		//pnl.add(lbl);
		
		JButton btn=new JButton("say Hello");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txtName.getText();
				JOptionPane.showMessageDialog(null, "Hello " +name);
				
			}
		});
	    frame.add(lbl);
	    frame.add(txtName);
	    frame.add(btn);
	    
	    // center of the screen
	    frame.setLocationRelativeTo(null);
	    // layout
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);

	}

}
