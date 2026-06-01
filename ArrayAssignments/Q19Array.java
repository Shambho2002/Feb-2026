/*
Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.

Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]

Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]
*/

import java.util.Scanner;
public class Q19Array{
	public static int[] negativeReplace(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i] < 0){
				
				arr[i] = 0;
				
			}
			
		}
		
		return arr;
		
	}
	
	public static void printArray(int[] arr){
		
		System.out.print("\nUpdated Array = ");
		for(int i = 0; i<arr.length; i++){
			
			System.out.print(arr[i]+" ");
			
		}
		
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
		
		negativeReplace(arr);
		printArray(arr);
	}
}