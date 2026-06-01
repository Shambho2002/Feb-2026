/*
	Linear Search Algorithm
*/
import java.util.Scanner;
public class LinearSearchAlgo{
	public static int linearSearch(int[] arr, int Skey){
		
		// Linear Search Algorithm
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i] == Skey){
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] arr=new int[l];
		
		System.out.println("\nEnter Elements: ");
		for(int i = 0; i<l; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.print("\nEnter Search Key: ");
		int Skey = input.nextInt();
		
		System.out.println(linearSearch(arr,Skey));
		
	}
}