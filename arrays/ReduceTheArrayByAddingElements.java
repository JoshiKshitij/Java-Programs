package arrays;
//Question no 2
// the array size should b 1 , 3 ,6 10, 15 
public class ReduceTheArrayByAddingElements {
		public static void main(String[] args) {
			//int array[] = {1,2,3,};
			//int array[] = {4,5,6,7,8,9};
			int array[] = {1,2,3,4,5,6,7,8,9,10};
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			/*
			 * to find the length of output array square root of the equaltion has to done
			 * n(n+1)/2 = length of array . n will give u the length of the new array
			 *  n*n + n - 2*length =0
			 *  n = -1 + Math.sqrt( )
			*/
			double root = (-1 + Math.sqrt(1 - 4*(2*(-array.length))))/2;
		    int newlength = (int) Math.ceil(root);
			System.out.println();
			int [] output = new int[newlength];
			int rotation = 1; int j = 0;
			for (int i = 0; i < output.length; i++) {
					int stop = 0; int sum=0;
					while(stop < rotation) {
					    sum += array[j];
						j++; stop++;
					}
					rotation ++;
					output[i] = sum;
			}
			for (int i = 0; i < output.length; i++) {
				System.out.print(output[i]+" ");
			}
			System.out.println();
		}
}
