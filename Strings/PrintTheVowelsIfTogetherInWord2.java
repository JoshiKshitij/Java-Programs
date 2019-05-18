package progs;

import java.util.Arrays;
import java.util.List;

public class PrintTheVowelsIfTogetherInWord2 {

	public static void main(String[] args) {
		String input = "Success consists of incremental efforts without lossing enthusiasm and aeiou";
		List<Character> listOfVowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		System.out.println("progrm started");
		for (int i = 0; i < input.length(); i++) {
			String out = "";
			boolean flag = false;
			// this while will iterate the words
			while (i < input.length() && input.charAt(i) != ' ') {

				out = out + input.charAt(i);
				i++;
			}
			int count = 0; int k = 0;
			int index = 0; int decrementForIndex = 0;
			while (k < out.length()) {
				count = 0;
				while(k < out.length() && listOfVowels.contains(out.charAt(k))) {
					count++;
					k++;
				}
				if(count == 0) {
					k++;
				}
				if(count > 1) {
					index = k;
					if(decrementForIndex < count) {
						decrementForIndex = count;
					}
				//	System.out.println(index - decrementForIndex);
					flag = true;
				}
			}
			
			
			if(flag) {
				System.out.print(out + " - ");
				for (int j = 0; j < decrementForIndex; j++) {
					System.out.print((index - decrementForIndex + j) + " ");
				}
				System.out.print(" - ");
				for (int j = 0; j < decrementForIndex; j++) {
				  System.out.print(out.charAt((index - decrementForIndex + j) )+" ");
				  }	
				System.out.println();
				}
		}

	}

}
