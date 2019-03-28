package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SortAndFormTheLagestNumberOutOfArray {
		
	static void usingTreeSet(Integer[] array) {
		TreeSet<Integer> treeset = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String one = ""+o1+o2;
				String two = ""+o2+o1;
				if(two.compareTo(one) > 0) {
					return 1;
				}
				else{
					return -1;
				}
			}
		});
		treeset.addAll(Arrays.asList(array));
		for (Integer integer : treeset) {
			System.out.print(integer);
		}
	}
	
	public static void main(String[] args) {
		Integer [] array = {8,1,5,2,91,9};
		usingTreeSet(array);
		
		
	
	}
}
