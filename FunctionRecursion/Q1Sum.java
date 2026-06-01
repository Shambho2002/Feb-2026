/*
Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30

*/

import java.util.Scanner;
public class Q1Sum{
	public static int getSum(int x, int y){
		
		return x + y;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		System.out.println("\nSum = "+getSum(num1, num2));
		
	}
}