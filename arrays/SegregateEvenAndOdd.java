package arrays;

import java.util.Arrays;

public class SegregateEvenAndOdd {
		 public static void main(String[] args) {
			int array[] = {1,2,3,1,4,2,3,5,3,4,6,7};
			int j = 0;
			//time complexity O(n)
			for (int i = 0; i < array.length; i++) {
				
				if(array[i]%2==0) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					j+=2;
				}
			}
			 ArraysUtil.display(array);
		}
}
