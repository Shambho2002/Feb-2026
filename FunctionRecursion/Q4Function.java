/*
Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25

*/

import java.util.Scanner;
public class Q4Function{
	public static void max(int num1, int num2){
		
		if(num1 > num2){
			System.out.println("\nMaximum number is "+num1);
		}
		else{
			System.out.println("\nMaximum number is "+num2);
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Number: ");
		int num1 = input.nextInt();
		
		System.out.print("\nSecond Number: ");
		int num2 = input.nextInt();
		
		max(num1, num2);
	}
}