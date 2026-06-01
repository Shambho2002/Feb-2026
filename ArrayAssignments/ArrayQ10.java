/*

Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5


*/

import java.util.Scanner;
public class ArrayQ10{
	public static void delete(int[] arr, int pos){
		
		int size = arr.length;
		
		if(pos < 0 || pos>=size){
			System.out.println("Invalid position!");
			return;
		}
		
		for(int i = pos; i<size-1; i++){
			arr[i] = arr[i+1];
		}
		
		size--;
		
		for(int i = 0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter elements...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter position: ");
		int pos = input.nextInt();
		
		delete(arr, pos);
		
	}
}