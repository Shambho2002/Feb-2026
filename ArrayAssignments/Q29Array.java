/*
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.Scanner;
public class Q29Array{
	public static void evenOddEqual(int[] nums){
		
		int[] even = new int[nums.length];
		int e = 0;
		int[] odd = new int[nums.length];
		int o = 0;
		int[] result = new int[nums.length];
		
		for(int i = 0; i<nums.length; i++){
			if(nums[i]%2==0){
				even[e++] = nums[i];
			}
			else{
				odd[o++] = nums[i];
			}
		}
		
		// Merge them correctly
		int ei = 0, oi = 0;
		
		for(int i = 0; i<result.length; i++){
			if(i%2==0){
				result[i] = even[ei++];
			}
			else{
				result[i] = odd[oi++];
			}
		}
		
		System.out.print("\nOutput: ");
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i]+" ");
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
		
		evenOddEqual(nums);
		
	}
}