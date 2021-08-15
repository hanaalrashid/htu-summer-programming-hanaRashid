package algorithms;

public class BinarySearch2 {

	public static void main(String[] args) {
		  int arr[] = {10,20,30,40,50};  
		  int item=100;
		  int low=0;
		  int high=arr.length-1;
		  boolean flag=false;
		  while(low<=high ) {
			  int middle=low+(high-low)/2;
			  if(arr[middle]==item) {
				  System.out.println("The item is found at index "+middle);
				  flag=true;
			  }
			  if(arr[middle]<item) {
				  low=middle+1;
			  }
			  else {
				  high=middle-1;
			  }
			  
			
		  }
		  if(!flag) {
		  System.out.println("The item is not found ");
		  }
		  

	}

}
