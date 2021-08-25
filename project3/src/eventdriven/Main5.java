package eventdriven;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main5 {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter a number"); int a = sc.nextInt();
		 * System.out.println("Please enter your name"); String name = sc.next();
		 * System.out.println(name); System.out.println(a);
		 */
		
		
		String value=JOptionPane.showInputDialog("Please enter a number");
		int numericValue=Integer.parseInt(value);
		
		int result=numericValue*5;
		System.out.println(result);
		
		String name=JOptionPane.showInputDialog("Please enter your name");
		System.out.println(name);
		
		JOptionPane.showMessageDialog(null, "welcome " + name);
		
		
		
		
		/*
		 * String name=JOptionPane.showInputDialog("What is your name? "); //
		 * System.out.println(name);
		 * 
		 * String age=JOptionPane.showInputDialog("What is your age?"); int
		 * ageValue=Integer.parseInt(age); // System.out.println(ageValue);
		 * 
		 * JOptionPane.showMessageDialog(null, "Hello from " + name + " Your age is "+
		 * age );
		 */

	}

}
