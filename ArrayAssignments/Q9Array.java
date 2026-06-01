/*
Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/

import java.util.Scanner;
public class Q9Array{
	public static int[] copyArray(int[] arr1, int[] arr2){
		int k = 0;
		
		for(int i = 0; i<arr1.length; i++){
			arr2[k++] = arr1[i];
		}
		
		return arr2;
		
	}
	
	public static void printArray(int[] arr2){
		
		System.out.println("\nCopied Array...");
		for(int i = 0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr1 = new int[l];
		int[] arr2 = new int[arr1.length];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			arr1[i] = input.nextInt();
		}
		
		copyArray(arr1,arr2);
		printArray(arr2);
	}
}