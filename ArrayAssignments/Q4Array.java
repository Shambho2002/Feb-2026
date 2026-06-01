/*
Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/

import java.util.Scanner;
public class Q4Array{
	public static void evenOdd(int[] arr){
		
		int[] even = new int[arr.length];
		int e = 0;
		int[] odd = new int[arr.length];
		int o = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(i%2==0){
				even[e++] = arr[i];
			}
			else{
				odd[o++] = arr[i];
			}
		}
		
		System.out.println("\nValues at Even Index: ");
		for(int i = 0; i<e; i++){
			System.out.print(even[i]+" ");
		}
		
		System.out.println("\nValues at Odd Index: ");
		for(int i = 0; i<o; i++){
			System.out.print(odd[i]+" ");
		}
		
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
		
		evenOdd(arr);
	}
}