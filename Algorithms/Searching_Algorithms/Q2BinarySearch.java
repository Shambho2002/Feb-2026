/*
2. Binary Search (Easy)
Question:
Given a sorted array, find the index of a target element using binary search. If not found, return -1.

Input:
arr = [1, 3, 5, 7, 9], target = 5

Output:
2

Explanation:
Binary search works only on sorted arrays.
*/

import java.util.Scanner;
public class Q2BinarySearch{
	public static int search(int[] arr, int Skey){
		
		// Binary Search Algorithm
		int Left = 0;
		int Right = arr.length - 1;
		
		while(Left <= Right){
			
			int mid = Left + (Right - Left) / 2;
			
			if(arr[mid] == Skey){
				
				return mid;
				
			}
			
			if(arr[mid] < Skey){
				
				Left = mid + 1;
				
			}
			
			else{
				
				Right = mid - 1;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println(search(arr, Skey));
	}
}