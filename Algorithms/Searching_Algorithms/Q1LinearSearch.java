/*
1. Linear Search (Easy)
Question:
Given an array of integers, find the index of a given target element using linear search. If the element is not found, return -1.

Input:
arr = [4, 2, 7, 1, 9], target = 7

Output:
2

Explanation:
7 is present at index 2.
*/
import java.util.Scanner;
public class Q1LinearSearch{
	public static int search(int[] arr, int Skey){
		
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
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println(search(arr,Skey));
	}
}