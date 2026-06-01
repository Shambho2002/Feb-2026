/*
Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. 
If the element is not found, print -1.

Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30

Output :- Element found at index: 2
*/

import java.util.Scanner;
public class Q21Array{
	public static int linearSearch(int[] arr, int Skey){
		
		// Linear Search Algorithm
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i] == Skey){
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		int index = linearSearch(arr,Skey);
		
		if(index != -1){
			System.out.println("\nElement found at index: "+index);
		}
		else{
			System.out.println("\nElement not found!!!");
		}
	}
}