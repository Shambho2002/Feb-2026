/*
Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
import java.util.Scanner;
public class Q26Array{
	public static int count(int[] arr, int sum){
		int n = arr.length;
		int count = 0;
		
		for(int i = 0; i<n-1; i++){
			for(int j = i+1; j<n; j++){
				if(arr[i] + arr[j] == sum){
					count++;
				}
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Target: ");
		int sum = input.nextInt();
		
		System.out.println("\nTotal pairs = "+count(arr, sum));
	}
}