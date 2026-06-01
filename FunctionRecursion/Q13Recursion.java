/*
Q13. Find the sum of digits of a number using recursion
Explanation:
Extract last digit using % 10
Add it with recursive call of remaining number.
Stop when number becomes 0.
Example:
Input: 1234
Output: 10

*/

import java.util.Scanner;
public class Q13Recursion{
	static int sum = 0;
	public static int digitSum(int num){
		
		if(num != 0){
			
			int digit = num%10;
			sum = sum + digit;
			digitSum(num/10);
			
		}
		
		return sum;
		
	}
	public static void main(String[] args){
		
		int num = 1234;
		System.out.println(digitSum(num));
		
	}
}