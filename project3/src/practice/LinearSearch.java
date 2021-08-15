package practice;

public class LinearSearch {

	public static void main(String[] args) {
		// Input 
		int array[]= {10,20,20,40,50,9,4,5};
		int item=5;
		int index=-1;
		
		//System.out.println("The size of the array is "+ array.length);
		// Process
		for(int i=0;i<array.length;i++) {
			if(item==array[i]) {
				index=i;
			}
			else {
				index=-1;
			}
			
			if(index!=-1) {
				System.out.println("Item is found at " + index);
			}
			
		}
		if(index==-1) {
			System.out.println("Item is not found " + index);
		}
		
		
		
		
		
		
		
		
		
		
		
	//	int []array2= new int [] {10,20,20,40,50,9,4,5,100};
		
	/*	int [] array3= new int[10];
		
		for(int i=0;i<10;i++) {
			array3[i]=i+1;
			System.out.println(array3[i]+ " at index " + i);
		}
		
		*/
	}

}
