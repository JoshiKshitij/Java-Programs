package Strings;

public class LongestSubSequesnceInTwoStrings {

	public static void main(String[] args) {
		// in abcedad and eda ---> ans should be 'eda'
		// in abcedad and ceda ---> ans should be 'ceda'
		// longestSubsequece("i am Kshitij", "am K");
		anotherWayIs("KshitijkshS", "kshitijhbash");
	}

	static void anotherWayIs(String one, String two) {
		if(one.length() < two.length()) {
			anotherWayIs(two, one);
			return;
		}
		
		String result = "";

		for (int i = 0; i < two.length(); i++) {
			for (int j = 0; j < one.length(); j++) {
				int index = i;
				String temp = "";
				while (two.charAt(index) == one.charAt(j)) {
					temp = temp + two.charAt(index);
					if (result.length() < temp.length()) {
						result = temp;
					}
					index++;
					if (index == two.length()) {
						break;
					}
					j++;
				}
			}
		}
		System.out.println(result);

	}

	// not a good code
	private static String longestSubsequece(String one, String two) {
		String resut = "";
		for (int i = 0; i < one.length(); i++) {
			String out = "";
			for (int j = i; j < one.length(); j++) {
				out = out + one.charAt(j);
				for (int k = 0; k < two.length(); k++) {
					String out2 = "";
					for (int l = k; l < two.length(); l++) {
						out2 = out2 + two.charAt(l);
						if (out.equals(out2) && out.length() > resut.length()) {
							resut = out;
						}
					}
				}
			}
		}
		System.out.println("result -->" + resut);
		return resut;
	}
}
