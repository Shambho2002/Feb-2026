/*
Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30

*/


public class Q1Function{
	public static int sum(int num1, int num2){
		
		return num1 + num2;
		
	}
	public static void main(String[] args){
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("\nSum = "+sum(num1, num2));
		
	}
}