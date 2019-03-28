package arrays;

import java.util.Random;

public class RandomSuffleOfArray {
	
		public static void main(String[] args) {
			int array[] = {1,2,3,4,5,6,7};
			for (int i = 0; i < array.length; i++) {
				int rotataion = new Random().nextInt(array.length-1);
				int tmp= array[rotataion];
				array[rotataion] = array[i];
				array[i]= tmp;
			}
			ArraysUtil.display(array);
		}
}
