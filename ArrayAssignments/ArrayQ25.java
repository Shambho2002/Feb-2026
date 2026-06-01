/*

Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.


*/

import java.util.Scanner;
public class ArrayQ25{
	public static void moveZero(int[] arr){
		
		int j = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != 0){
				// swap multiple times
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.print("\nOutput: ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		
		int[] arr = new int[]{0, 1, 0, 3, 12};
		
		moveZero(arr);
		
	}
}