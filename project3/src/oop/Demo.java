package oop;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
	/* String carName="mercedese";
	 String carType="x";
	 String carColor="blue";
	 
	 String car2Name="mercedese";
	 String car2Type="x";
	 String car2Color="blue";
	 
	 String car3Name="mercedese";
	 String car3Type="x";
	 String car3Color="blue";
	 */
		
		Car car1=new Car();
		car1.speed=100;
		car1.type="ford";
		car1.color="blue";
		car1.electrical=false;
		System.out.println(car1.speed);
		System.out.println(car1.type);
		System.out.println(car1.color);
		System.out.println(car1.electrical);
		System.out.println("*******************");
		
		Car car2=new Car();
		System.out.println(car2.speed);
		System.out.println(car2.type);
		System.out.println(car2.color);
		System.out.println(car2.electrical);
		
		// Construction 
		Student student1=new Student();
		student1.id=12233;
		student1.name="Ahmad";
		student1.numberOfCompletedHours=30;
		student1.major="CS";
		student1.gpa=3.8;
		student1.school="SCI";
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println(student1.numberOfCompletedHours);
		System.out.println(student1.major);
		System.out.println(student1.major);
		
		double result3 = Math.sqrt(25);
		System.out.println(result3);
		
	
		Random r=new Random();
		int x=r.nextInt();
		
		System.out.println(x);
		
	}

}
