/*
Q7. Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.


Example: Input: 5		Output: 120


*/

import java.util.Scanner;
public class Q7Recursion{
	public static int factorial(int num){
		
		if(num == 0 || num == 1){
			return 1;
		}
		
		return num * factorial(num - 1);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		System.out.println(factorial(num));
	}
}