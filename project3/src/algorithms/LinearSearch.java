package algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr= {2,1,3,4,5,6};
		int item=1;
		int index=-1;

		for(int i=0; i<arr.length;i++) {
			if (arr[i]==item) {
				index=i;
				
			}
			else {
				index=-1;		
			}
			
			if(index!=-1) {
				System.out.println("item is found at index "+ index);
			}
			
		}
	}

}
