package basic;

public class PrintDublicatesAndSinglesAndNUmbers {

	public static void methodOne(int array[]) {
		
		for(int i = 0; i <=100 ; i++) {
				int count = 0;
				for (int j = 0; j < array.length; j++) {
					if(i == array[j]) {
						count++;
					}
				}
				if(count == 0) {
					System.out.println(i);
				}
				else if(count == 1) {
					System.out.println("no appeared once");
				}
				else {
					System.out.println("no appeared multiple times");
				}
		}
	}
	

	
	public static void main(String[] args) {
		int array[] = {9,10,100,1,2,95,100,100,3,67,95,42,34,95,67};
		//int array1[] = null;
		methodOne(array);
	}
}
