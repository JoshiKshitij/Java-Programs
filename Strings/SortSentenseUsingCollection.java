package Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class SortSentenseUsingCollection {

	public static void main(String[] args) {
		String sentense = "Sometimes questions are complicated and answers are simple";
		String[] splitArray = sentense.split(" ");
		TreeSet<String> treeset = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.toLowerCase().compareTo(s2.toLowerCase()) > 0) 
				return 1;
				else{
					return -1;
				}
			}
		});
		treeset.addAll(Arrays.asList(splitArray));
		
		for (String stringset : treeset) {
			System.out.println(stringset);
		}
	}
}
