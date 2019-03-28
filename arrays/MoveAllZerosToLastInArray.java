package arrays;

public class MoveAllZerosToLastInArray {

	public static void main(String[] args) {
		
		int array[] = {1,5,0,6,9,3,6,2,9,0,5,0};
		int counter =0;
		for (int i = 0; i < array.length ; i++) {
			if(array[i]!=0) {
				array[counter++] = array[i];
			}
		}
		for (int i = counter; i < array.length; i++) {
			array[i] = 0;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}
}
