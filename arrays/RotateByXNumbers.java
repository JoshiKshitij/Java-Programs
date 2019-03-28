package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateByXNumbers {
	public static void main(String[] args) {
		Integer array[] = { 3, 1, 4, 1, 5, 6 };
		System.out.println("Enter the no of rotations");
		int rotations = new Scanner(System.in).nextInt();
		if (rotations > array.length) {
			rotations %= array.length;
		}

		System.out.println("over all rotations " + rotations);
		Integer newarray[] = new Integer[array.length];
		
		for (int i = 0; i < rotations; i++) {
			newarray[newarray.length + i - rotations] = array[i];
		}
		for (int i = rotations; i < newarray.length; i++) {
			newarray[i - rotations] = array[i];
		}
		System.out.println(Arrays.asList(array));
		System.out.println(Arrays.asList(newarray));
	}
}
