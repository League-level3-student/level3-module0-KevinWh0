package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] array = {"a","b","c","d","e"};
		//2. print the third element in the array
			System.out.println(array[2]);
		//3. set the third element to a different value
			array[2] = "aaa";
		//4. print the third element again
			System.out.println(array[2]);

		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < array.length; i++) {
			array[i] = "join us";
			
			
		
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
			
		
		}
		//7. make an array of 50 integers
			int[] array2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			Random rand = new Random();
			for(int i = 0; i < array2.length; i++) {
				array2[i] = rand.nextInt();
				
			}
		//9. without printing the entire array, print only the smallest number on the array
			int sml = 10000000;
			for(int i = 0; i < array2.length; i++) {
				if(array2[i] < sml){
					sml = array2[i];
					
				}
				
			}
			System.out.println(sml);
		//10 print the entire array to see if step 8 was correct
			for(int i = 0; i < array2.length; i++) {
				System.out.println(array2[i]);
				
			}
		//11. print the largest number in the array.
		
			sml = 0;
			for(int i = 0; i < array2.length; i++) {
				if(array2[i] > sml){
					sml = array2[i];
					
				}
				
			}
			System.out.println(sml);

		//12. print only the last element in the array
			System.out.println(array2[array2.length-1]);
		
	}
}
