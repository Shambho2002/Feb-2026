/*
Q2. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd

*/

import java.util.Scanner;
public class Q2Even{
	public static boolean isEven(int num){
		
		return num%2 == 0;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		System.out.println("\nOutput: "+isEven(num));
	}
}