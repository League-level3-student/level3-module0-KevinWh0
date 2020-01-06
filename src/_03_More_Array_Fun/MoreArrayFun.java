package _03_More_Array_Fun;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MoreArrayFun {
	 //1. Create a main method to test the other methods you write.
	

	
	static void print(String[] e) {
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
	static void printRev(String[] e) {
		
		for (int i = e.length-1; i > 0; i--) {
			System.out.println(e[i]);
		}
	}
	
	static void printEO(String[] e) {
		
		for (int i = 0; i < e.length/2; i+=2) {
			System.out.println(e[i]);
		}
	}
	static void printRand(String[] intArray) {
		
		List<String> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void main(String[] args) {
		String[] e = {"lol","ooo","hhh","dsasd"};
		printRand(e);
		
		print(e);
		
		printRev(e);
		
		printEO(e);


		
	}
	
}
