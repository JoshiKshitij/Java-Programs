package patterns;

public class starPatterns {
/*	
*
**
***
****
*****
******	
*/	
	static void accendingStars(int n){
		String output = "";
		// time complexity O(n)
		for (int i = 0; i < n; i++) {
			output += "* ";
			System.out.println(output);
		}
	}
	
	static void decendingStars(String in){
		for (int i = 0; i < in.length(); i++) {
			String out = in.substring(i, in.length()-1);
			System.out.println(out);
		}
		
	}
	
	public static void main(String[] args) {
		int input = 6;
		String in = "*******";
		accendingStars(input);
		//decendingStars(in);
	}
}
