package arrays;

import java.util.Arrays;

public class MoveAllNegativeToLast {

	private static void unOrderedOutput( int[] array){
		int j = array.length-1; int counter=0;
		for (int i = 0; i < array.length;  ) {
			while(i < array.length&&array[i] >= 0) {
				i++;counter++;
			}
			while(j>=0&&array[j] < 0) {
				j--;counter++;
			}
			if(i >= j) {break;}
			int temp = array[j];
			array[j]= array[i];
			array[i]= temp;
			i++; j--; counter++;
		}
		//counter will give you no of iterations;
		System.out.println(counter);

	}


	public static void main(String[] args) {
		//the order or array is reverse when you will get the output
		int array[] = {1,-3,-10,-2,5,-3,-17,19,1,4,-3,-2,1,1,1};
		ArraysUtil.display(array);
		//unOrderedOutput(array);
		//ArraysUtil.display(array);
		orderedOutput(array);
		ArraysUtil.display(array);
	}


	private static void orderedOutput(int[] array) {
		int j = 0;
		int counter=0; 
		//time complexity is O(2n)
		int output [] = array;
		while(j < output.length) {
			if(output[j] >= 0) {
				array[counter++] = output[j];
			}
			j++;
		}
		j=0;
		while(j <output.length) {
			if(output[j] < 0) {
				array[counter++] = output[j];
			}
			j++;
		}
	}
}

