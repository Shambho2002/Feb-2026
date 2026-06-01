/*
Q36. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
*/

import java.util.Scanner;
public class Q36Array{
	
	public static void primeCount(int[] arr){
		int prime = 0;
		
		// Logic
		for(int i = 0; i<arr.length; i++){
			int num = arr[i];
			int count = 0;
			
			for(int j = 1; j<=num; j++){
				if(num%j==0){
					count++;
				}
			}
			
			if(count == 2){
				prime++;
			}
		}
		
		System.out.println("\nCount of prime numbers = "+prime);
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Element's: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		primeCount(arr);
	}
}