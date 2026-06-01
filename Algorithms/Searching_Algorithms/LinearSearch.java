/*
	Linear Search Algorithm
*/
import java.util.Scanner;
public class LinearSearch{
	public static int LinearSearchFunction(int[] arr, int Skey){
		// Linear Search Algorithm
		int index = -1;
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]==Skey){
				
				return i;
				
			}
			
		}
		
		return index;
		
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
		
		System.out.println(LinearSearchFunction(arr, Skey));
	}
}