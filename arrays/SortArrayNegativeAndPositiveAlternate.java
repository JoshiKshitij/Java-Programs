package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SortArrayNegativeAndPositiveAlternate {

	static Integer[] usingCollections(Integer[] array) {
		TreeSet<Integer> treeset = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return 1;
				else
					return -1;
			}
		});
		treeset.addAll(Arrays.asList(array));
		System.out.println(treeset);
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) treeset.pollFirst();
			i++;
			array[i] = (int) treeset.pollLast();
		}

		return array;
	}

	static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Integer array[] = { 1, -1, 3, 4, 5, -2, 4, 5, -4, 6 };
		long start = System.nanoTime();
		printArray(usingCollections(array));
		long stop = System.nanoTime();
		System.out.println(stop - start);
	}
}
