/*
Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.
*/

import java.util.Scanner;
public class Q2Array{
	public static int sumArray(int[] arr){
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		
		return sum;
		
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
		
		System.out.println("Sum of array elements = "+sumArray(arr));
	}
}