/*
4. Bubble Sort (Easy)
Question:
Sort the given array in ascending order using bubble sort.

Input:
arr = [5, 1, 4, 2, 8]

Output:
[1, 2, 4, 5, 8]

Explanation:
Swap adjacent elements if they are in the wrong order.
*/

import java.util.Scanner;
public class Q4BubbleSort{
	public static void sort(int[] arr){
		
		//Bubble Sort Algorithm
		for(int i = 0; i<arr.length-1; i++){
			boolean swapped = false;
			for(int j = 0; j<arr.length-1-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped){
				break;
			}
		}
		
		// Print Array
		System.out.println("\nSwapped Array...");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter Elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		sort(arr);
	}
}