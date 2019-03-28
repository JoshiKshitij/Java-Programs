package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReaarangeAArrayAccodingToIndexEqualsToValue {
	public static void main(String[] args) {
		//Integer array[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		Integer array[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			if( arrayList.contains(i)  ) 
			{
				System.out.print(i+" ");
			}
			else { System.out.print("-1 ");}
		}
		
	}
}
