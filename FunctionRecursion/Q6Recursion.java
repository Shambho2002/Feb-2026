/*
Q6. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5

*/

import java.util.Scanner;
public class Q6Recursion{
	public static void print(int current, int num){
		
		if(current <= num){
			
			System.out.print(current+" ");
			print(current+1, num);
			
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		print(1,num);
	}
}