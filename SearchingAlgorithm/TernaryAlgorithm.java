/*

1. Basic Search

Q1. Write a program to search an element in a sorted array using Ternary Search. Return the index if found, otherwise -1.

Example:
Input: [1, 3, 5, 7, 9, 11], Key = 7
Output: 3


*/

import java.util.Scanner;
public class TernaryAlgorithm{
	public static int search(int[] arr, int Skey){
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			
			if(arr[mid1] == Skey){
				return mid1;
			}
			if(arr[mid2] == Skey){
				return mid2;
			}
			
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
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("Enter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println("\nOutput: "+search(arr, Skey));
	}
}