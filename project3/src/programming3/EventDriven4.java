package programming3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EventDriven4 {

	public static void main(String[] args) {
	JFrame frame= new JFrame("Counters");
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 400);
	frame.setLocationRelativeTo(null);
	
	JLabel lbl1=new JLabel("Words : ");
	lbl1.setBounds(60, 25, 100, 30);
	JLabel lbl2=new JLabel("Characters : ");
	lbl2.setBounds(200, 25, 100, 30);
	
	JTextArea area=new JTextArea();
	area.setBounds(20, 75, 350, 200);
	JButton btn1=new JButton("Count words and Characters");
	btn1.setBounds(100,300,200,30);
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String content= area.getText();
			String [] words=content.split(" ");
			lbl1.setText("Words : " +words.length );
			int charactersNo = content.replace(" ", "").length();
			lbl2.setText("Characters :"+charactersNo);
			
		}
	});
	frame.add(lbl1);
	frame.add(lbl2);
	frame.add(area);
	frame.add(btn1);
	frame.setVisible(true);

	}

}
