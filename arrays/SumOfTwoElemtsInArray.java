package arrays;

public class SumOfTwoElemtsInArray {

	public static void main(String[] args) {
		int array[]= { 2,5,12,6,45,2,78}; int value = 12;
		boolean flag = sumOfElements(array,value);
		if(flag) 
		{
			System.out.println("there are elemts whose sum is :" + value );
		}
		else { System.out.println("Result is negative");}
	}

	private static boolean sumOfElements(int[] array,int value) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int sum = 0;
				sum = array[i]+array[j];
				System.out.println( " " +array[i]+ "  " +array[j]+" = "+sum);
				if(value == sum && i !=j) {
					return true;
				}
			}
		}
		return false;
	}
}
