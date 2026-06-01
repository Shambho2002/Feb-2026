/*
	Binary Search Algorithm
*/
import java.util.Scanner;
public class BinarySearchAlgo{
	public static int[] bubbleSort(int[] arr){
		
		boolean swapped;
		
		// Bubble Sort Algorithm
		for(int i = 0; i<arr.length-1; i++){
			
			swapped = false;
			
			for(int j = 0; j<arr.length-i-1; j++){
				
				if(arr[j] > arr[j+1]){
					
					// Swap
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
	
	public static int binarySearch(int[] arr, int Skey){
		
		// Binary Search Algorithm
		int Left = 0;
		int Right = arr.length-1;
		int index = -1;
		
		while(Left <= Right){
			
			int mid = Left + (Right - Left) / 2;
			
			if(arr[mid] == Skey){
				
				index = mid;
				break;
				
			}
			
			if(arr[mid] < Skey){
				
				Left = mid + 1;
				
			}
			else{
				
				Right = mid - 1;
				
			}
			
		}
		
		return index;
		
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
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		bubbleSort(arr);
		int result = binarySearch(arr,Skey);
		
		if(result != -1){
			System.out.println("\nElement "+Skey+" Found.");
		}
		else{
			System.out.println("\nElement Not Found..!");
		}
	}
}