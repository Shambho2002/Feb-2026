/*
Q24. Write a program in java to rotate an array by N positions ?
	
Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.Scanner;
public class Q24Array{
	public static void rotate(int[] nums, int k){
		int n = nums.length;
		
		k = k % n; // 7 % 11 = 4
		
		int[] rotatenums = new int[n];
		int index = 0;
		
		for(int i = n-k; i<nums.length; i++){
			rotatenums[index++] = nums[i];
		}
		
		for(int i = 0; i<n-k; i++){
			rotatenums[index++] = nums[i];
		}
		
		for(int i = 0; i<n; i++){
			nums[i] = rotatenums[i];
		}
		
	}
	
	public static void printArr(int[] nums){
		
		System.out.println("\nOutput: ");
		for(int i = 0; i<nums.length; i++){
			
			System.out.print(nums[i]+" ");
			
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] nums = new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			nums[i] = input.nextInt();
		}
		
		System.out.print("\nEnter positions: ");
		int k = input.nextInt();
		
		rotate(nums, k);
		printArr(nums);
	}
}