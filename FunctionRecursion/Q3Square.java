/*
Q3. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25

*/

import java.util.Scanner;
public class Q3Square{
	public static int square(int n){
		
		return n * n;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		System.out.println("\nSquare = "+square(num));
	}
}