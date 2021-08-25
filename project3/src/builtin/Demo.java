package builtin;

import java.util.Scanner;

//import java.lang.String; // It is already imported 
public class Demo {

	public static void main(String[] args) {
		/*
		 * String name1="Ahmad"; // String pool String name2=new String ("Ahmad"); //
		 * object String name3=new String("Ahmad"); // object
		 * 
		 * // Compare the addresses System.out.println(name1==name2);
		 * System.out.println(name2==name3);
		 * 
		 * 
		 * // Compare the content boolean result=name2.equals(name3);
		 * System.out.println(result);
		 * 
		 * int len=name2.length(); System.out.println(len);
		 * 
		 * String upperCaseString= name2.toUpperCase();
		 * System.out.println(upperCaseString); System.out.println(name2.toLowerCase());
		 */
		

		// Scanner 
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("Please enter an Integer"); int x=sc.nextInt();
		 * System.out.println(x); System.out.println("Please enter an Integer"); int
		 * y=sc.nextInt(); System.out.println(y);
		 */
		
	/*	System.out.println("Please enter your name");
		String input=sc.next();
		System.out.println(input);
		*/
		
		/*System.out.println("Please enter float value");
		float f=sc.nextFloat();
		System.out.println(f);
		*/
		// Math 
		
		System.out.println(Math.PI); 
		/*int x= Math.abs(-10);
		System.out.println(x);
		double y=Math.abs(3.4);
		System.out.println(y);
		
		double z=Math.ceil(3.5);
		System.out.println(z);
		
		double floor=Math.floor(3.5);
		System.out.println(floor);
		
		float min= Math.min(2, 4);
		System.out.println(min);
		
		float max=Math.max(3.0f,9.0f);
		System.out.println(max);
		
		System.out.println(Math.round(323.545));
		*/
		
		System.out.println(Math.random());
		System.out.println(Math.random()*20);
		System.out.println(5+Math.random()*30); // from 5 to 30
		
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.sqrt(4));
		
		String name="Hana";
		char [] characters=name.toCharArray();
	}

}
