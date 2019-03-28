package arrays;

import java.util.Scanner;

public class ArrayRotationTimeAndSpaceComplecity {

	public static void main(String[] args) {
		int array [] = {1,2,3,4,5,6};
		System.out.println("no of roataions");
		int rotataion = new Scanner(System.in).nextInt();
		
		rotataion = rotataion % array.length;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[(i+rotataion)%array.length] +" ");
		}
		
	}
}
