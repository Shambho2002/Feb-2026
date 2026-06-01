/*
Q20. Write a Java program to print all elements from an integer array that are greater than a given number.

Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20

Output :- Elements greater than 20 :
    25 40
*/

import java.util.Scanner;
public class Q20Array{
	public static void greaterElements(int[] arr, int num){
		int[] arr2 = new int[arr.length];
		int k = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > num){
				arr2[k++] = arr[i];
			}
		}
		
		System.out.print("\nElements greater than "+num+" : ");
		for(int i = 0; i<k; i++){
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Number: ");
		int num = input.nextInt();
		
		greaterElements(arr,num);
	}
}