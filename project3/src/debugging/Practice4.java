package debugging;

public class Practice4 {

	public static void main(String[] args) {
	    int array[]=new int [5];
	    int count=0;
		/*
		 * for(int i :array){ array[i]=++count;
		 * 
		 * System.out.println(array[i]);
		 * 
		 * 
		 * }
		 */
	    
	    for(int i=0;i<array.length;i++) {
	    	array[i]=++count;
	    	System.out.println(i + " "+ array[i]);
	    }

}
}