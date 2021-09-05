package eventdriven;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int counter=0; 
	public static void main(String[] args) {
		JFrame frame=new JFrame("increment and decrement");
		frame.setSize(350,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setLayout(new FlowLayout());

		JButton minusBtn=new JButton("-");
		JLabel label=new JLabel("0");
		JButton plusBtn=new JButton("+");
		minusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	 	   //label.setText(--counter +" ");
	 	   label.setText(Integer.toString(--counter));
			
				
			}
		});
	
		plusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  label.setText(Integer.toString(++counter));		
			}
		});
	
		
		frame.add(minusBtn);
		frame.add(label);
		frame.add(plusBtn);

		
		frame.setVisible(true);
		
	}

}
