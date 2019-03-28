package arrays;

import java.util.Arrays;

public class RotateAndFindTheMaximunSum {
	public static void main(String[] args) {
		Integer array[]= {10,1,2,3,4,5,6,7,8,9};
		 System.out.println(rotateAndSum(array));
	}

	private static int rotateAndSum(Integer[] array) {
		int sum = 0;int max =0;
	
		for (int i = 0; i < array.length; i++) {
				int temp = array[0];  sum = temp*0;
				System.out.print(Arrays.asList(array ));
				for (int j = 1; j < array.length; j++) {
				array[j-1] = array[j];
				sum+= j*array[j];
			}
			array[array.length-1]=temp;
			System.out.println( "sum is -->"+sum);
			if(max < sum) {	max= sum;}
		}
		return max;
	}
}
