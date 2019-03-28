package Strings;

public class ReverseAStringWithCondition {
	public static void main(String[] args) {
		/*
					input = i am studying in bangalore and i love this city
					output =i ma studying ni bangalore dna i evol this ytic 
		*/
		String input = "i am studying in bangalore and i love this city";
		String output = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			String tempString = "";
			while (i < input.length() && input.charAt(i) != ' ') {
				if (count % 2 == 1)
					tempString = input.charAt(i) + tempString;
				else
					tempString = tempString + input.charAt(i);
				i++;
			}
			count++;
			output+=tempString + " ";
		}
		System.out.println(output);
	}
}
