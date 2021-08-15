package algorithms;

public class MaximumValue {
public static void main(String[] args) {
	int n1=70;
	int n2=70;
	int n3=7;
	
	if(n1> n2 && n1>n3) {
		System.out.println("n1 is the greatest number " +n1 );
	}
	else if(n2> n1 && n2>n3) {
		System.out.println("n2 is the greatest number "+ n2);
	}
	else if(n3>n1 && n3>n2)
	{
		System.out.println("n3 is the greatest number "+ n3);
	}
	else {
		System.out.println("the three numbers are equal");
	}
}
}
