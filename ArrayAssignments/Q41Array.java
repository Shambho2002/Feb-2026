/*

Q41. Write a program in java to to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
	
Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1

*/

import java.util.Scanner;
public class Q41Array{
	
	public static void nextGreater(int[] arr){
		
		int[] result = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++){
			
			result[i] = -1; // set as default
			
			for(int j = i+1; j<arr.length; j++){
				
				if(arr[j] > arr[i]){
					result[i] = arr[j];
					break;
				}
				
			}
			
		}
		
		System.out.println("\nNext Bigger Elements Array: ");
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		
		int[] arr = new int[]{5, 3, 10, 9, 6, 13};
		
		nextGreater(arr);
	}
}