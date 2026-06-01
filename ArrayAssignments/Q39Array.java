/*
Q39. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.
*/
import java.util.Scanner;
public class Q39Array{
	public static void ascendingSort(int[] arr){
		
		//Selection Sort Algorithm
		for(int i = 0; i<arr.length-1; i++){
			int minIndex = i;
			for(int j = i+1; j<arr.length; j++){
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
		
		// Print Array
		System.out.println("\nDisplay Array in ascending order...");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void descendingSort(int[] arr){
		
		// Bubble Sort Algorithm
		for(int i = 0; i<arr.length-1; i++){
			boolean swapped = false;
			for(int j = 0; j<arr.length-1-i; j++){
				if(arr[j] < arr[j+1]){
					// Swap Multiple times
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
		System.out.println("\nDisplay Array in descending order...");
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
		
		ascendingSort(arr);
		descendingSort(arr);
	}
}