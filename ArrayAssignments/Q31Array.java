/*
Q31. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/
import java.util.Scanner;
public class Q31Array{
	
	public static int[] replacedFirstLast(int[] nums){
		int n = nums.length;
		
		if(n == 0) return nums;
		
		nums[0] = 0;
		
		if(n > 1){
			nums[n-1] = 0;
		}
		
		return nums;
	}
	
	public static void print(int[] nums){
		
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
		
		replacedFirstLast(nums);
		print(nums);
	}
}