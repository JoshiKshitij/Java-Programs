package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LIstToString {

	public static void main(String[] args) {
		String input = "10th mains ,shiv durga pg ,btm 1 stage ,banaglore ,karnataaka";
		String[] splitInput = input.split(",");
		ArrayList<Object>  arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList(splitInput));
		String output="";
		
		for (Object object : arrayList) {
		output+= (String)object + "\n";	
		}
		System.out.println(output);
	}
}
