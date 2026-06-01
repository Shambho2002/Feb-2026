/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd

*/

import java.util.Scanner;
public class Q2Function{
	public static void evenOdd(int num){
		
		if(num%2 == 0){
			System.out.println("\nNumber is Even.");
		}
		else{
			System.out.println("\nNumber is Odd.");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		evenOdd(num);
	}
}