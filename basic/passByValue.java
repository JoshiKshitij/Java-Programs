package basic;

public class passByValue {

	public static void meth(int a) {
		a = 100;
	}
	
	public static void random(int a []) {
		a[0] = 100;
		a[1] = 100;
		a[2] = 100;
	}
	
	public static void passToNewArray(int a []) {
		a = new int[] {1,2};
	}
	public static void main(String[] args) {
		int num = 20;
		meth(num);
		System.out.println(num);
		int array[] = {11,21,3};
		//random(array);
		passToNewArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
	}
}
