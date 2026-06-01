/*
Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.Scanner;
public class Q14Array{
	public static void removeDuplicate(int[] arr){
		int i = 0;
		
		for(int j = 1; j<arr.length; j++){
			
			if(arr[i] != arr[j]){
				
				i++;
				arr[i] = arr[j];
				
			}
			
		}
		
		System.out.print("\nUnique elements = ");
		for(int k = 0; k<=i; k++){
			
			System.out.print(arr[k]+" ");
			
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
		
		removeDuplicate(arr);
	}
}