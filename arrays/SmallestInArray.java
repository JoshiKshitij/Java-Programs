package arrays;

public class SmallestInArray {

	public static void main(String[] args) {
		int array[] = {1,22,-1,6,0,99,66};
		//smallestInArray(array);// n interations
		smallestInArrayHalfIterations(array) ; //  n/2+1 iterations
	}
	private static void smallestInArrayHalfIterations(int[] array) {
		int smallest = array[0];
		for (int i = 0; i < array.length/2+1; i++) {
			if(array[i] < array[array.length-1] && smallest >array[i]) {
				smallest = array[i];
			}
			if(array[i] > array[array.length-1] && smallest > array[array.length-1]) {
				smallest = array[array.length-1];
			}
		}
		System.out.println(smallest);
	}
	private static void smallestInArray(int[] array) {
		int smallest =array[0];int index=0;
		for (int i = 0; i < array.length; i++) {
	     	if(smallest > array[i] )
	     	{smallest = array[i];	
	     	index = i;
	     	}
	     	}
		System.out.println("Smallest no is "+smallest + " at index "+ index);
	}
}
