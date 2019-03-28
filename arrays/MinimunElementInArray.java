package arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class MinimunElementInArray {

	public static void main(String[] args) {
		Integer array[] = { 102, 34, 77, 7, 4, 8, 66, 99 };
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		System.out.println(min);
		
		//Integer is taken because it is Comparable type
		//Or we can use Collections to find it
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.addAll(Arrays.asList(array));
		System.out.println(treeSet.pollFirst());
	}

}
