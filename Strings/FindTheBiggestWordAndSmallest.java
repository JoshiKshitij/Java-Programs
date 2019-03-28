package Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class FindTheBiggestWordAndSmallest {
		static void usingCollections(String input){
			long start1 = System.nanoTime();
			TreeSet<String> tree = new TreeSet<>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					if(o1.length() > o2.length()) 
					return 1;
					else return -1; 
				}
			});
			tree.addAll(Arrays.asList(input.split(" ")));
			long stop1 = System.nanoTime();
			System.out.println(stop1-start1);
			System.out.println("Smallest word is "+tree.pollFirst());
			System.out.println("Largest word is "+tree.pollLast());
			
		}
	
		static void findSmallestAndLargest(String input){
			String biggestWord ="", smallestWord = input;
			long start = System.nanoTime();
			for (int i = 0; i < input.length(); i++) {
				int counter = 0; String temp = "";
				while(i < input.length() && input.charAt(i) != ' '  ) 
				{
					temp += input.charAt(i);
					i++; counter++;
				}
				if(counter > biggestWord.length()) {
					biggestWord = temp;
				}
				if(counter < smallestWord.length()) {
					smallestWord = temp;
				}
			}
			long stop = System.nanoTime();
			System.out.println(stop-start);
			System.out.println("Bigest word is "+ "'"+biggestWord+"'");
			System.out.println("smallest word is "+"'"+ smallestWord+"'");
			
		}
		 public static void main(String[] args) {
			String input = "the stadium of bangalore is a huge";
			usingCollections(input);
			System.out.println("---------------------------------");
			findSmallestAndLargest(input);
			
		 }
}
