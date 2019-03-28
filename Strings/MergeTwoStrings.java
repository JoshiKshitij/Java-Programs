package Strings;

public class MergeTwoStrings {
	public static void main(String[] args) {
		String two = "sanju";
		String one = "rahul";
		int counter = 0;
		String output ="";
		while(true ) {
			if(counter < one.length()) {
				output += one.charAt(counter);
			}
			if(counter < two.length()) {
				output += two.charAt(counter);
			}
			counter++;
			if(counter == one.length()+two.length()) {
				break;
			}
		}
		
		System.out.println(output);
	}
}
