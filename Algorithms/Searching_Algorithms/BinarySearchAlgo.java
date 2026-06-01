/*
	Binary Search Algorithm
*/

import java.util.Scanner;
public class BinarySearchAlgo{
	public static int binarySearch(int[] arr, int Skey){
		
		int Left = 0;
		int Right = arr.length - 1;
		
		while(Left <= Right){
			
			int mid = Left + (Right - Left) / 2;
			
			if(arr[mid] == Skey){
				
				return mid;
				
			}
			
			if(arr[mid] < Skey){
				
				Left = mid + 1;
				
			}
			else{
				
				Right = mid - 1;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter Elements In An Array...");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Element: ");
		int Skey = input.nextInt();
		
		System.out.println(binarySearch(arr,Skey));
		
	}
}