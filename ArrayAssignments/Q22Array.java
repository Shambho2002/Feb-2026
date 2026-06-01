/*
Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}

Output :- Arrays are equal.
Explanation
First, check if the lengths of both arrays are equal
If lengths are different → arrays are not equal
If lengths are same, compare elements one by one using a loop
If any element mismatch is found → arrays are not equal
If all elements match → arrays are equal
*/
import java.util.Scanner;
public class Q22Array{
	public static void arraysEquals(int[] array1, int[] array2){
		
		if(array1.length != array2.length){
			System.out.println("\nArrays are not equal.");
		}
		else{
			
			int j = 0;
			int count = 0;
			
			for(int i = 0; i<array1.length; i++){
				if(array1[i] != array2[j]){
					count++;
				}
				j++;
			}
			
			if(count > 0){
				System.out.println("\nArrays are not equal.");
			}
			else{
				System.out.println("\nArrays are equal.");
			}
			
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Array Limit: ");
		int n = input.nextInt();
		System.out.print("Enter Second Array Limit: ");
		int m = input.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		
		System.out.println("\nEnter First Array Elements: ");
		for(int i = 0; i<n; i++){
			array1[i] = input.nextInt();
		}
		
		System.out.println("\nEnter Second Array Elements: ");
		for(int i = 0; i<m; i++){
			array2[i] = input.nextInt();
		}
		
		arraysEquals(array1, array2);
		
	}
}