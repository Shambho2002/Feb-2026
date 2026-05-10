/*
	2. Binary Search Algorithm
*/
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Array Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		for(int i = 0; i<l; i++){
			System.out.printf("Element of arr[%d] : ",i);
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		// Logic for Binary Search Algorithm
		int index = -1;
		int L = 0, R = arr.length-1;
		while(L <= R){
			int mid = L + (R - L)/2;
			if(arr[mid] == Skey){
				index = mid;
				break;
			}
			if(arr[mid] < Skey){
				L = mid + 1;
			}
			else{
				R = mid - 1;
			}
		}
		
		if(index!=-1){
			System.out.println("Element Found At "+index+" Index.");
		}
		else{
			System.out.println("Element Not Found.");
		}
		
	}
}