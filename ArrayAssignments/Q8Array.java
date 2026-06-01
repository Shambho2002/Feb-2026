/*
Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.Scanner;
public class Q8Array{
	public static void findMissing(int[] arr){
		int max = arr[0];
		
		// find max
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		// check each number from 1 to max
		for(int j = 1; j<=max; j++){
			boolean found = false;
			for(int i = 0; i<arr.length; i++){
				if(arr[i] == j){
					found = true;
					break;
				}
			}
			
			// if not found -> missing
			if(!found){
				System.out.print(j+" ");
			}
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
		
		findMissing(arr);
	}
}