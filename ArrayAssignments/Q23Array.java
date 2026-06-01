/*
Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. 
There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
       There are no Majority Elements in the given array
Explanation
Traverse the array using two loops.
For each element, count how many times it appears.
If the count of any element is greater than n/2, that element is the majority element.
If no such element is found after checking all elements, print that there is no majority element.
*/
import java.util.Scanner;
public class Q23Array{
	public static void majority(int[] nums){
		int n = nums.length;
		boolean found = false;
		
		for(int i = 0; i<n; i++){
			int count = 0;
			for(int j = 0; j<n; j++){
				if(nums[i] == nums[j]){
					count++;
				}
			}
			
			if(count > n/2){
				System.out.println(nums[i]+" Majority found.");
				found = true;
				break;
			}
			
		}
		
		if(!found){
			System.out.println("There are no Majority Elements in the given array.");
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int l = input.nextInt();
		int[] nums = new int[l];
		
		System.out.println("\nEnter Elemetns: ");
		for(int i = 0; i<l; i++){
			nums[i] = input.nextInt();
		}
		
		majority(nums);
	}
}