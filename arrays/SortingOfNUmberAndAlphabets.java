package arrays;


public class SortingOfNUmberAndAlphabets {
	public static void main(String[] args) {
		//char obj[] = { 'z', '1', '5', '7', '9', '2', 'a', '8', 'b', '5', };
		char obj[] = { '6', '7', '9', 'b',  'e', '5','8' };
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");
		} System.out.println();
		
		//main logic
		for (int i = 0; i < obj.length; i++) {

			for (int j = 0; j < obj.length; j++) {
				if (obj[j] < obj[i] && obj[i] <= 57 && obj[i] >= 48) {
					char temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");
		}
	}
}
