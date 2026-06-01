/*
Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
import java.util.Scanner;
public class Q33Array{
	public static boolean isPalindrome(int[] nums){
		
		int count = 0;
		
		//if(nums.length == 1) return true;
		
		for(int i = 0, j = (nums.length-1); i<nums.length/2; i++,j--){
			if(nums[i] == nums[j]){
				count++;
			}
		}
		
		return count == nums.length/2;
		
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
		
		System.out.println(isPalindrome(nums));
	}
}