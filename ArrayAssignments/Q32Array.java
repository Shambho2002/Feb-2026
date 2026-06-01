/*
Q32. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]


Explanation:


10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/

import java.util.Scanner;
public class Q32Array{
	
	public static int[] replaced(int[] nums){
		int n = nums.length;
		
		for(int i = 0; i<n; i++){
			if(nums[i]%5==0){
				nums[i] = 5;
			}
		}
		
		return nums;
		
	}
	
	public static void print(int[] nums){
		
		System.out.print("\nOutput: ");
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
		
		replaced(nums);
		print(nums);
	}
}