/*
Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique
*/
import java.util.Scanner;
public class Q28Array{
	public static void union(int[] arr1, int[] arr2){
		int[] unique = new int[arr1.length+arr2.length];
		int k = 0;
		
		for(int i = 0; i<arr1.length; i++){
			
			unique[k++] = arr1[i];
			
		}
		
		for(int i = 0; i<arr2.length; i++){
			
			boolean found = false;
			
			for(int j = 0; j<k; j++){
				
				if(arr2[i] == unique[j]){
					
					found = true;
					
					break;
					
				}
				
			}
			
			if(!found){
				
				unique[k++] = arr2[i];
				
			}
			
		}
		
		System.out.print("\nOutput = ");
		for(int i = 0; i<k; i++){
			System.out.print(unique[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Array Limit: ");
		int m = input.nextInt();
		
		System.out.print("Enter Second Array Limit: ");
		int n = input.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		
		System.out.println("\nEnter Elements in First Array...");
		for(int i = 0; i<m; i++){
			arr1[i] = input.nextInt();
		}
		
		System.out.println("\nEnter Elements in Second Array...");
		for(int i = 0; i<n; i++){
			arr2[i] = input.nextInt();
		}
		
		union(arr1, arr2);
	}
}