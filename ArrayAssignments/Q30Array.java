/*
Q30. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Q30Array{
	public static void replaced(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]%3==0){
				arr[i] = -1;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
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
		
		replaced(arr);
	}
}