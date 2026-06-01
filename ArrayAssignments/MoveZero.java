/*

Q9. You are given an integer array containing zero and non-zero values. Move all zero values to 
the end of the array while maintaining the original order of non-zero elements. 
Description: 
Use two pointers: 
• One pointer tracks the position for next non-zero element.  
• Another pointer scans the array. 
Place non-zero elements first and fill remaining positions with zeros.  
Input: 
arr = [0,1,0,3,12] 
Output: 
[1,3,12,0,0] 
Time Complexity: 
O(n)

*/

import java.util.Scanner;
public class MoveZero{
	public static void moveZero(int[] arr){
		
		int i = 0;
		for(int j = 0; j<arr.length; j++){
			
			if(arr[j] != 0){
				arr[i] = arr[j];
				i++;
			}
			
		}
		
		for(int k = i; k<arr.length; k++){
			arr[k] = 0;
		}
		
		System.out.println("\nOutput: ");
		for(int x = 0; x<arr.length; x++){
			System.out.print(arr[x]+" ");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Limit: ");
		int l = input.nextInt();
		int[] arr = new int[l];
		
		System.out.println("\nEnter elements...");
		for(int i = 0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		moveZero(arr);
		
	}
}