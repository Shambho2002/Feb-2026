/*
Q14. Find whether a number is palindrome using recursion
Explanation:
Reverse the number recursively.
Compare reversed number with original number.
Example:
Input: 121
Output: Palindrome

*/

import java.util.Scanner;
public class Q14Recursion{
	static int rev = 0;
	public static int isPalindrome(int num){
		
		if(num != 0){
			int digit = num%10;
			rev = rev * 10 + digit;
			isPalindrome(num/10);
			
		}
		
		return rev;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int original = num;
		
		int result = isPalindrome(num);
		
		if(result == original){
			System.out.println("\nPalindrome.");
		}
		else{
			System.out.println("\nNot palindrome.");
		}
	}
}