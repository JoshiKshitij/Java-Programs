package arrays;

public class MinSwapRequiredToBringTheElementsTogetherWithK {
	public static void main(String[] args) {
		int array[] = { 1, 4, 2, 7, 0, 15, 25, 33 };
		display(array);
		int swapsRequired = minSwapForElements(array, 1);
		System.out.println(swapsRequired);
		display(array);
	}

	private static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static int minSwapForElements(int[] array, int n) {
		int nthElementIndex = 0;
		int ClossestElementIndex = 0;
		int diff = 100000;
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				nthElementIndex = i;
			}
			// maths.abs() will give a absoulte value
			if (diff > Math.abs(array[i] - n) && n != array[i]) {
				diff = Math.abs(array[i] - n);
				ClossestElementIndex = i;
			}
		}
		int temp = 0;
		if (nthElementIndex > ClossestElementIndex) {
			temp = array[nthElementIndex - 1];
			array[nthElementIndex - 1] = array[ClossestElementIndex];
			array[ClossestElementIndex] = temp;
		} else {
			temp = array[nthElementIndex + 1];
			array[nthElementIndex + 1] = array[ClossestElementIndex];
			array[ClossestElementIndex] = temp;
		}
		System.out.println(Math.abs(ClossestElementIndex - nthElementIndex));
		return Math.abs(ClossestElementIndex - nthElementIndex) - 1;
	}
}
