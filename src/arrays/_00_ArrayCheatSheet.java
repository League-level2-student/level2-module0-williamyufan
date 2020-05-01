package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		//1. make an array of 5 Strings
		String[] array= {"Jake", "Na", "Hak", "Mike", "Tyler"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2]="yeah";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] age=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random y=new Random();
		for (int i = 0; i < age.length; i++) {
			age[i]=y.nextInt(38);
			System.out.println(age[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int n=age[0];
		for (int i = 0; i < age.length; i++) {
			if(age[i]<n) {
				n=age[i];
			}
		}
		System.out.println(n);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int u=age[0];
		for (int i = 0; i < age.length; i++) {
			if(age[i]>u) {
				u=age[i];
			}
		}
		System.out.println(u);
	}
}
