/*
	1. Linear Search Algorithm
*/

import java.util.Scanner;
public class LinearSearch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Array Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		for(int i = 0; i<l; i++){
			System.out.printf("Element of arr[%d] : ",i);
			arr[i] = input.nextInt();
		}
		
		System.out.println("\nDisplay Original Array...");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		// Logic of Linear Searching Algorithm
		System.out.print("Enter Search Key: ");
		int searchKey = input.nextInt();
		int index = -1;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == searchKey){
				index = i;
				break;
			}
		}
		
		if(index != -1){
			System.out.println("\nElement found at "+index+" Index.");
		}
		else{
			System.out.println("\nElement not found.");
		}
		
	}
}