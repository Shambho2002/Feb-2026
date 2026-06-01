/*
	Bubble Sort Algorithm
*/
import java.util.Scanner;
public class BubbleSortAlgo1{
	public static int[] bubbleSort(int[] arr){
		boolean swap;
		// Bubble Sort Algorithm
		for(int i = 0; i<arr.length-1; i++){
			
			swap = false;
			
			for(int j = 0; j<arr.length-i-1; j++){
				
				if(arr[j] > arr[j+1]){
					
					//Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
					
				}
				
			}
			
			if(!swap){
				
				break;
				
			}
			
		}
		
		return arr;
		
	}
	
	public static void printArray(int[] arr){
		
		System.out.println("\nSorted Array...");
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