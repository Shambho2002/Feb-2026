/*
	Selection Sort Algorithm
*/

import java.util.Scanner;
public class SelectionSort{
	public static void SelectionSortFunction(int[] arr){
		// Selection Sort Algorithm
		for(int i = 0; i < arr.length - 1; i++){
			
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++){
				
				if(arr[j] < arr[minIndex]){
					
					minIndex = j;
					
				}
				
			}
			
			if(minIndex != i){
				// Swap Only Once
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
				
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
		
		SelectionSortFunction(arr);
		PrintSortedArray(arr);
	}
}