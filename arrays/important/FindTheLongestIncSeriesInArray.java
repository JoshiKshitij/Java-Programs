package arrays.important;

public class FindTheLongestIncSeriesInArray {
	/*
	 * Input arr[] = {1, 11, 2, 10, 4, 5, 2, 12}; Output: 5 (A Longest Inc
	 * Subsequence of length 4 is 1, 2, 10, 11)
	 */

	public static void main(String[] args) {
		int array[] = {1, 11, 2, 10, 4, 5, 2, 12};
		int longestIncLength = 0;
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int counter = 1;
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] > array[i]) {
					counter++;
				}
				if (temp > array[j] && array[j] > array[i]) {
					counter--;
					temp = array[j];
					continue;
				}
				if (array[j] > array[i])
					temp = array[j];

			}
			System.out.println(counter);
			if (longestIncLength < counter)
				longestIncLength = counter;
		}
		System.out.println("longest length is " + longestIncLength);
	}
}
