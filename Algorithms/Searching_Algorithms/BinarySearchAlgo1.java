/*
	Binary Search Algorithm
*/

import java.util.Scanner;
public class BinarySearchAlgo1{
	public static void binarySearch(int[] arr, int Skey){
		
		int L = 0;
		int R = arr.length - 1;
		int INDEX = -1;
		
		while(L <= R){
			
			int MID = L + (R - L) / 2;
			
			if(arr[MID] == Skey){
				
				INDEX = MID;
				
				break;
				
			}
			
			if(arr[MID] < Skey){
				
				L = MID + 1;
				
			}
			else{
				
				R = MID - 1;
				
			}
			
		}
		
		if(INDEX != -1){
			
			System.out.println("\nElement Found At "+INDEX+" Index.");
			
		}
		else{
			
			System.out.println("\nElement Not Found.!!");
			
		}
		
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
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		binarySearch(arr,Skey);
		
	}
}