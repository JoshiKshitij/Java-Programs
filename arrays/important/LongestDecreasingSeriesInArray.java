package arrays.important;

public class LongestDecreasingSeriesInArray {

	public static void main(String[] args) {
		//int array[] = {14, 11, 12, 5, 3, 1};
		int array[] = {14, 11, 12, 25, 23,21,20,19,17,16,15};
		int longestDecLength = 0;
		for (int i = 0; i < array.length; i++) {
			int counter = 1; int temp = array[i];
			for (int j = i+1; j < array.length; j++) {
				if(array[j] <array[i])
				counter++;
				
				if(temp < array[j] && array[j] <array[i]) {
					counter--;
					temp = array[j];
					continue;
				}
			
				if(array[j] < array[i])
					temp = array[j];
				
			}
			if(counter > longestDecLength)
				longestDecLength = counter;
		}
		System.out.println("longest dec length is "+longestDecLength);
	}
}
