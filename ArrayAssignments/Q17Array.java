/*
Q17. Write a Java program to count the number of even and odd elements present in a given integer array.
Explanation
An even number is a number that is completely divisible by 2.
An odd number is a number that is not divisible by 2.
Traverse the array using a loop.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
    Odd count = 2
*/

import java.util.Scanner;
public class Q17Array{
	public static void countEvenOdd(int[] arr){
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
		}
		
		System.out.println("\nEven count = "+countEven);
		System.out.println("\nOdd count = "+countOdd);
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter elements: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		countEvenOdd(arr);
	}
}