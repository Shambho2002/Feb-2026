/*
Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/

import java.util.Scanner;
public class Q12Array{
	public static void insertElement(int[] arr, int pos, int value){
		
		for(int i = arr.length-2; i>=pos; i--){
			
			arr[i+1] = arr[i];
			
		}
		
		arr[pos] = value;
		
		System.out.println("\nThe new list: ");
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
		for(int i = 0; i<l-1; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nInput the position where to insert: ");
		int pos = input.nextInt();
		
		System.out.print("\nValue: ");
		int value = input.nextInt();
		
		insertElement(arr, pos, value);
	}
}