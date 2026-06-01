/*
Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/
import java.util.Scanner;
public class Q27Array{
	public static void frequency(int[] arr){
		
		// Logic for count frequency
		for(int i = 0; i<arr.length; i++){
			
			int count = 0;
			boolean visited = false;
			
			for(int k = 0; k<i; k++){
				
				if(arr[i] == arr[k]){
					
					visited = true;
					
					break;
					
				}
				
			}
			
			if(visited) continue;
			
			for(int j = 0; j<arr.length; j++){
				
				if(arr[i] == arr[j]){
					
					count++;
					
				}
				
			}
			
			System.out.println(arr[i]+" -> "+count+" times.");
			
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
		
		frequency(arr);
	}
}