package practice;

public class LinearSerach2 {

	public static int findItem(int [] array, int item) {
		int index=-1;
		for(int i=0;i<array.length;i++) {
			if(item==array[i]) {
				index=i;
			}
			else {
				index=-1;
			}
			if(index!=-1) {
				return i;
			}
			
	}
		return index;
	}
	public static void main(String[] args) {
		int array[]= {10,20,20,40,50,9,4,5,5};
		int item=5;
		int location=findItem(array,item);
		
		if(location!=-1) {
			System.out.println("Item is found at " + location);
		}
		
	
	if(location==-1) {
		System.out.println("Item is not found " + location);
	}

	}

}
