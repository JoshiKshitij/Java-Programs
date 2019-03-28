package arrays;

public class Sperate0sAnd1s {
	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1 };
		int right = array.length - 1, counter =0;
		for (int i = 0; i < array.length; i++) {
			while (array[i] == 0) {
				i++; counter++;
			}
			while (array[right] == 1) {
				right--;counter++;
			}
			if(i > right) break;
			// since we know only two char are there 0 and 1
			int temp = array[i];
			array[i]=array[right];
			array[right] = temp;
			counter++;
		}
		System.out.println("no of iterrations = " +counter +" and length of array =" +array.length);
		ArraysUtil.display(array);
	}
}
