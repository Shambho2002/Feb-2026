/*
	Binary Search Algorithm
*/
import java.util.Scanner;
public class BinarySearch{
	public static int BinarySearchFunction(int[] arr, int Skey){
		// Binary Search Algorithm
		int index = -1;
		int L = 0;
		int R = (arr.length-1); // 10 - 1 = 9
		
		while(L <= R){
			int mid = L + (R - L) / 2;
			
			if(arr[mid] == Skey){
				
				return mid;
				
			}
			
			if(arr[mid] < Skey){
				
				L = mid + 1;
				
			}
			else{
				
				R = mid - 1;
				
			}
		}
		
		return index;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter Elements In An Array: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("Enter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println(BinarySearchFunction(arr,Skey));
	}
}