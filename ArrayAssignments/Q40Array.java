/*
Q40. Write a program in java to find the smallest missing element from a sorted array?
 Expected Output : The given array is : 0 1 3 4 5 6 7 9
		         The missing smallest element is: 2
*/
import java.util.Scanner;
public class Q40Array{
	public static int smallestMissing(int[] arr){
		
		// Binary Search Optimization
		int left = 0; 
		int right = arr.length-1;
		
		while(left <= right){
			
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == mid){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
			
		}
		
		return left;
		
	}
	
	public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		
		int[] arr = new int[]{0,1,3,4,5,6,7,9};
		
		//smallestMissing(arr);
		System.out.println("The missing smallest element is: "+smallestMissing(arr));
	}
}