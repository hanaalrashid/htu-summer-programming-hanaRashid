package mainpackage;

public class MainMethodDemo {

	//1- public
	// 2- static 
	// 3- void : return 
	// String [] args : Command line args
 public static void main(String[] ar) {
	int size=ar.length;
	System.out.println(size);
	for (int i=0;i<size;i++) {
		System.out.println(ar[i]);
	}
}	

}
