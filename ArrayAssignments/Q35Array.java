/*
Q35. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
import java.util.Scanner;
public class Q35Array{
	public static void square(int[] nums){
		int[] squareArr = new int[nums.length];
		
		for(int i = 0; i<nums.length; i++){
			squareArr[i] = nums[i] * nums[i];
		}
		
		System.out.println("\nOutput: ");
		for(int i = 0; i<squareArr.length; i++){
			System.out.print(squareArr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		int[] nums = new int[]{2, 4, 6, 8};
		
		square(nums);
	}
}