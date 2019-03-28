package arrays;
public class ReverseTheArrayWithoutDisturbingAplhabets {
	public static void main(String[] args) {
		 char obj[] = { 'z', '1', '5', '7', '9', '2', 'a', '8', 'b', '5', };
		//char obj[] = { '6', '7', '9', 'b', 'e', '5', '8' };
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");    	}
			System.out.println();
		// main logic
		int length = obj.length;
		for (int i = 0, j = length-1; i < length/2 && j > 0 ; )  {
			while(obj[i] > 57 || obj[i] < 48 ) {
				i++;
			}
			while(obj[j] > 57 || obj[j] < 48) {
				j--;                      }
			if ( obj[i] <= 57 && obj[i] >= 48 && obj[j] <= 57 && obj[j] >= 48 ) {
				char temp = obj[i];
				obj[i] = obj[j];
				obj[j] = temp;       }
			    i++;j--;
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");
		}
	}
}
