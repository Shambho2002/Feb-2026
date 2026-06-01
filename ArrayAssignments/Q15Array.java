/*
Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/

import java.util.Scanner;
public class Q15Array{
	public static void commonElements(int[] arr, int[] arr2){
		int[] common = new int[arr.length+arr2.length];
		int k = 0;
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr2.length; j++){
				if(arr[i] == arr2[j]){
					common[k++] = arr2[j];
					break;
				}
			}
		}
		
		System.out.print("\nCommon elements = ");
		for(int i = 0; i<k; i++){
			System.out.print(common[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Array Limit: ");
		int n = input.nextInt();
		
		System.out.print("Enter Second Array Limit: ");
		int m = input.nextInt();
		
		int[] arr=new int[n];
		int[] arr2=new int[m];
		
		System.out.println("\nEnter First Array Elements: ");
		for(int i = 0; i<n; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.println("\nEnter Second Array Elements: ");
		for(int i = 0; i<m; i++){
			arr2[i] = input.nextInt();
		}
		
		commonElements(arr,arr2);
	}
}