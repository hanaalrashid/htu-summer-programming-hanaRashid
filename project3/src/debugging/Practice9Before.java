package debugging;

import java.util.Scanner;

public class Practice9Before {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Shape Area Calculator");

		while (true) {
			System.out.println();
			System.out.println("-=-=-=-=-=-=-=-=-=-");
			System.out.println();
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Circle");
			System.out.println("4) Quit");
			System.out.println();

			System.out.print("Which shape: ");

			int shape = keyboard.nextInt();
			System.out.println();

			if (shape == 1) {
				area_triangle();
			} else if (shape == 2) {
				area_rectangle();
			} else if (shape == 3) {
				area_circle();
			} else if (shape == 4) {
				quit();
				keyboard.close();
				break;
			}

		}

	}

	public static double area_triangle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Base: ");
		int base = keyboard.nextInt();

		System.out.print("Height: ");
		int height = keyboard.nextInt();

		System.out.println();

		double A = (base * height) * 0.5;

		System.out.println("The area is " + A + ".");

		return A;

	}

	public static int area_rectangle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Length: ");
		int length = keyboard.nextInt();

		System.out.print("Width: ");
		int width = keyboard.nextInt();

		System.out.println();

		int A = length * width;

		System.out.println("The area is " + A + ".");

		return A;
	}

	public static double area_circle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Radius: ");
		int radius = keyboard.nextInt();

		System.out.println();

		double A = Math.PI * radius * radius;

		System.out.println("The area is " + A + ".");

		return A;

	}

	public static String quit() {

		System.out.println("GoodBye");
		return null;

	}

}
