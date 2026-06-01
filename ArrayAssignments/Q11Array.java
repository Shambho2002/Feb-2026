/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/

import java.util.Scanner;
public class Q11Array{
	public static int secondLargest(int[] arr){
		int max = 0;
		int smax = 0;
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]>max){
				
				max = arr[i];
				
			}
			
		}
		
		smax = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++){
			
			if(smax < arr[i] && max > arr[i] && max != smax){
				
				smax = arr[i];
				
			}
			
		}
		
		return smax;
		
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
		
		System.out.println(secondLargest(arr));
	}
}