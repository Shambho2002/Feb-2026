/*

1. Basic Search

Q1. Write a program to search an element in a sorted array using Ternary Search. Return the index if found, otherwise -1.

Example:
Input: [1, 3, 5, 7, 9, 11], Key = 7
Output: 3

*/


import java.util.Scanner;
public class TernarySearch{
	public static int search(int[] arr, int Skey){
		
		if(arr.length == 0){
			return -1;
		}
		
		// Ternary Search Algorithm
		int left = 0;
		int right = arr.length - 1;
		
		boolean asc = true;
		boolean des = true;
		
		for(int i = 0; i<arr.length-1; i++){
			
			if(arr[i] > arr[i+1]){
				
				asc = false;
				
			}
			if(arr[i] < arr[i+1]){
				
				des = false;
				
			}
			
		}
		
		if(!asc && !des){
			
			return -2;
			
		}
		
		while(left <= right){
			
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			
			if(arr[mid1] == Skey){
				
				return mid1;
				
			}
			if(arr[mid2] == Skey){
				
				return mid2;
				
			}
			
			if(asc){
				
				if(Skey < arr[mid1]){
					
					right = mid1 - 1;
					
				}
				else if(Skey > arr[mid2]){
					
					left = mid2 + 1;
					
				}
				else{
					
					left = mid1 + 1;
					right = mid2 - 1;
					
				}
				
			}
			else{
				
				if(Skey > arr[mid1]){
					
					right = mid1 - 1;
					
				}
				else if(Skey < arr[mid2]){
					
					left = mid2 + 1;
					
				}
				else{
					
					left = mid1 + 1;
					right = mid2 - 1;
				}
				
				
			}
			
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int limit = input.nextInt();
		
		if(limit < 0){
			System.out.println("\nInvalid limit!");
			return;
		}
		
		int[] arr = new int[limit];
		
		System.out.println("\nEnter elements...");
		for(int i = 0; i<limit; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search element: ");
		int Skey = input.nextInt();
		
		int result = search(arr, Skey);
		
		if(result >= 0){
			System.out.println("\nElement found at index "+result);
		}
		else if(result == -1){
			System.out.println("\nElement not found!");
		}
		else if(result == -2){
			System.out.println("\nArray must be sorted in ascending or descending order!");
		}
		
	}
}