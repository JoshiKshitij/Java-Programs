package arrays.important;

import java.util.ArrayList;

public class SmallestSeriesOfThreeElemtInLinerTime {
	/*
	 * Input: arr[] = {12, 11, 10, 5, 6, 2, 30} Output: 5, 6, 30
	 * 
	 * Input: arr[] = {1, 2, 3, 4} Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4
	 * 
	 * Input: arr[] = {4, 3, 2, 1} Output: No such triplet
	 */


	public static void main(String[] args) {
		int array[] = { 12, 10, 11, 5, 6,30 };
		int[] outOne = new int[3];
		outOne[0] = array[0];
		int[] outTwo = new int[3];
		// outTwo[0] =array[1];
		int indexOne = 0, indexTwo = 0;
		// sortThreeNo(array, 0);
		for (int i = 0; i < array.length; i++) {
			if (indexOne < outOne.length && array[i] >= outOne[0]) {
				outOne[indexOne++] = array[i];

			} 
			else {

				if (indexTwo < outTwo.length && array[i] >= outTwo[0]) {
					outTwo[indexTwo] = array[i];
//					System.out.println(outTwo[indexTwo]);
					indexTwo++;
				} 
				else {
						if( outOne[0] > outTwo[0]) {
							indexOne = 0;
							outOne[0] = array[i];
							outOne[1] = 0;
							outOne[2] = 0;
						}
						else {
							indexTwo = 0;
							outTwo[0] = array[i];
							outTwo[1] =0;
							outTwo[2] =0;
						}
				}
				
			}

		}

		for (int i = 0; i < outOne.length; i++) {
			System.out.print(outOne[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i = 0; i < outTwo.length; i++) {
			System.out.print(outTwo[i] + " ");
		}
		System.out.println();
	}
}
