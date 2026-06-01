/*
Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/

import java.util.Scanner;
public class Q13Array{
	public static void nonZero(int[] arr){
		int[] arr2 = new int[arr.length];
		int k = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != 0){
				arr2[k++] = arr[i];
			}
		}
		
		System.out.print("\nNon-zero elements = ");
		for(int i = 0; i<k; i++){
			System.out.print(arr2[i]+" ");
		}
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
		
		nonZero(arr);
	}
}