/*
Q18. Write a Java program to check whether a given array is empty or not.

Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.

Input :- Array elements: { }
Output :- Array is empty
*/

import java.util.Scanner;
public class Q18Array{
	public static void checkArray(int[] arr){
		
		if(arr.length == 0){
			System.out.println("\nArray is empty!!!");
		}
		else{
			System.out.println("\nThe array contains elements.");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter elements: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		checkArray(arr);
	}
}