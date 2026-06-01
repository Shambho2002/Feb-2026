/*
Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}
 {\text{Number of elements}}Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30
*/

import java.util.Scanner;
public class Q16Array{
	public static int ave(int[] arr){
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		
		return sum/(arr.length);
		
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
		
		System.out.println("\nAverage of array elements = "+ave(arr));
	}
}