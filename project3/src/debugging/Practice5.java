package debugging;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter width");
		int width=sc.nextInt();
		int length = 40;

		try {

			int ratio = length / width;
			System.out.println(ratio);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Executed");
		}

	}
}
