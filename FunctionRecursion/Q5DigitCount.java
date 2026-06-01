/*
Q5. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4

*/


import java.util.Scanner;
public class Q5DigitCount{
	public static int countDigits(int num){
		
		int count = 0;
		
		while(num != 0){
			
			num = num/10;
			count++;
			
		}
		
		return count;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		System.out.println("\nDigits = "+countDigits(num));
		
	}
}