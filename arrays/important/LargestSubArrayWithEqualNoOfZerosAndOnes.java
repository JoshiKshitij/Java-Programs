package arrays.important;

public class LargestSubArrayWithEqualNoOfZerosAndOnes {
	/*
	 * Input: arr[] = {1, 0, 1, 1, 1, 0, 0} Output: 1 to 6 (Starting and Ending
	 * indexes of output subarray)
	 * 
	 * Input: arr[] = {1, 1, 1, 1} Output: No such subarray
	 * 
	 * Input: arr[] = {0, 0, 1, 1, 0} Output: 0 to 3 Or 1 to 4
	 */
	//time complexity n(n+1)/2
	static void methodOne(int array[]) {
		int maxLength = 0; int start =0; int end = 0;
		for (int i = 0; i < array.length; i++) {
			int total = 0;
			int tempLength =0;
			for (int j = i; j < array.length; j++) {
					
					if(array[j] == 0) {
						total--;
					}
					else {
						total++;
					}
				if(total == 0) {
					tempLength = j - i + 1;
				}
			}
			if(tempLength > maxLength ) {
				start = i; 
				maxLength = tempLength;
			}
			
		}
		System.out.println(maxLength+" is the max length");
		System.out.println("starting index is " + start);
		System.out.println("ending index is" + (start + maxLength-1));
	}
	
	//time complexity n 
	static void methodTwo(int array []) {
		
	}

	public static void main(String[] args) {
		int[] array = { 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1 };
		int[] array1 = { 1, 0, 1, 1, 1, 0, 0, 1, 1,0,0, 1, 1 };
		int array2[] = {1,1,1,1,1,0};
		int array3 [] = {0,0,1,1,0};
		//methodOne(array);
		methodTwo(array);
	}
}
