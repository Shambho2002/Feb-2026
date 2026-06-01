/*
	Bubble Sort Algorithm
*/

import java.util.Scanner;
public class BubbleSort{
	public static void BubbleSortFunction(int[] arr){
		
		// Bubble Sort Algorithm
		for(int i = 0; i < (arr.length-1); i++){
			
			boolean swapped = false;
			
			for(int j = 0; j < (arr.length-i-1); j++){
				
				if(arr[j] > arr[j+1]){
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
					
				}
				
			}
			// If no swaps -> already sorted
			if(!swapped){
				
				break;
				
			}
		}
		
	}
	
	public static void PrintSortedArray(int[] arr){
		
		System.out.println("\nDisplay Sorted Array...");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter Elements In An Array...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		BubbleSortFunction(arr);
		PrintSortedArray(arr);
	}
}