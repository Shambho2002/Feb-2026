/*
Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

import java.util.Scanner;
public class Q7Array{
	public static void reverse(int[] arr){
		
		for(int i = 0, j=arr.length-1; i<arr.length/2; i++,j--){
			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println("\nDisplay Reverse Array...");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("Enter Elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		reverse(arr);
	}
}