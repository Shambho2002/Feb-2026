/*
Q35. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.
*/
import java.util.Scanner;
public class Q35sArray{
	public static void factorial(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			int fact = 1;
			for(int j = arr[i]; j>=1; j--){
				fact = fact * j;
			}
			arr[i] = fact;
		}
		
		System.out.println("\nOutput: ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		factorial(arr);
	}
}