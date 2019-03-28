package arrays;

import java.util.Arrays;

public class SortAndMixAssendingDesendingOrder {

	public static void main(String[] args) {
		int array[] ={1,8,3,4,5,-7};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]  +" ");
		}
		System.out.println();
		int output[] = new int[array.length];
		int j = array.length-1; int k = 0; 
		for (int i = j; i >= 0;  ) {
			 output[i] = array[j];
			 i--; j--;
			 if(i > 0) {
			 output[i] = array[k];
			 i--; k++;
			 }
		}
	
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]  +" ");
		}
	
	}
}
