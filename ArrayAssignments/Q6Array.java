/*
Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.Scanner;
import java.util.Arrays;
public class Q6Array{
	public static int binarySearch(int[] arr, int Skey){
		
		// Binary Search Algorithm
		int LOW = 0;
		int HIGH = arr.length - 1;
		
		while(LOW <= HIGH){
			
			int MID = LOW + (HIGH - LOW) / 2;
			
			if(arr[MID] == Skey){
				return MID;
			}
			
			if(arr[MID] < Skey){
				
				LOW = MID + 1;
				
			}
			else{
				
				HIGH = MID - 1;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		Arrays.sort(arr);
		
		int result = binarySearch(arr,Skey);
		
		if(result != -1){
			System.out.println("Element "+Skey+" found.");
		}
		else{
			System.out.println("Element Not Found!!!");
		}
	}
}