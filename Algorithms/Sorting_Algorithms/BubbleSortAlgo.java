/*
	Bubble Sort Algorithm
*/
import java.util.Scanner;
public class BubbleSortAlgo{
	
	public static int[] bubbleSort(int[] arr){
		int n = arr.length;
		boolean swapped;
		// Bubble Sort Algorithm
		for(int i = 0; i<n-1; i++){
			
			swapped = false;
			
			for(int j = 0; j<n-i-1; j++){
				
				if(arr[j] > arr[j+1]){
					
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
		
		return arr;
		
	}
	
	public static void printArray(int[] arr){
		
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
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			
			arr[i] = input.nextInt();
			
		}
		
		bubbleSort(arr);
		printArray(arr);
		
	}
}