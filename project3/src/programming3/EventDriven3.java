package programming3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDriven3 {
 static int counter=0;
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("increment and decrement");
		frame.setSize(350,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		// add components to the frame 
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JLabel lbl= new JLabel("0");
		plusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lbl.setText(++counter+"");
				lbl.setText(Integer.toString(++counter));
				
			}
		});
	
		minusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(Integer.toString(--counter));				
			}
		});
		frame.add(minusBtn);
		frame.add(lbl);
		frame.add(plusBtn);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

	}

}
