/*
3. Selection Sort (Easy)
Question:
Sort the given array in ascending order using selection sort.

Input:
arr = [64, 25, 12, 22, 11]

Output:
[11, 12, 22, 25, 64]

Explanation:
Repeatedly select the smallest element and place it at the correct position.
*/
import java.util.Scanner;
public class Q3SelectionSort{
	public static void sort(int[] arr){
		
		// Selection Sort Algorithms
		for(int i = 0; i<arr.length; i++){
			int minIndex = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			
			if(minIndex != i){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
		System.out.println("\nOutput: ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("Enter Elements...");
		for(int i = 0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		sort(arr);
	}
}