/*

Basic Search

Problem Statement:
Write a Java program to search for an element in a sorted array using the Binary Search algorithm.
Return the index of the element if found, otherwise return -1.

Example:
Input: [1, 3, 5, 7, 9, 11], Key = 7
Output: 3

*/


import java.util.Scanner;
public class BinarySearch2{
	public static int search(int[] arr, int Skey){
		
		if(arr.length == 0){
			return -1;
		}
		
		// Binary Search Algorithm
		int left = 0;
		int right = arr.length - 1;
		
		boolean asc = arr[left] < arr[right];
		
		while(left <= right){
			
			int mid = left + (right - left) / 2; // For finding the mid
			
			if(arr[mid] == Skey){
				return mid;
			}
			
			if(asc){
				if(Skey < arr[mid]){
					right = mid - 1;
				}
				else{
					left = mid + 1;
				}
			}
			else{
				if(Skey > arr[mid]){
					right = mid - 1;
				}
				else{
					left = mid + 1;
				}
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		
		if(l <= 0){
			System.out.println("\nInvalid Limit!");
			return;
		}
		
		int[] arr = new int[l];
		
		System.out.println("\nEnter elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println("\nOutput: "+search(arr, Skey));
	}
}