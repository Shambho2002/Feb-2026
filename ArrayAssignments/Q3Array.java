/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.
*/

import java.util.Scanner;
public class Q3Array{
	public static void evenOdd(int[] arr){
		int[] even = new int[arr.length];
		int e = 0;
		int[] odd = new int[arr.length];
		int o = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%2==0){
				even[e++] = arr[i];
			}
			else{
				odd[o++] = arr[i];
			}
		}
		
		System.out.println("\nEven Values: ");
		for(int i = 0; i<e; i++){
			System.out.print(even[i]+" ");
		}
		
		System.out.println("\nOdd Values: ");
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