/*
Q12. Find the power of a number using recursion
Explanation:
Multiply base with power(base, exponent-1)
Base condition: exponent becomes 0.
Example:
Input: 2^4
Output: 16

*/


import java.util.Scanner;
public class Q12Recursion{
	static int power = 1;
	public static int power(int base, int exponent){
		
		if(exponent != 0){
			
			power = power * base;
			power(base, exponent-1);
			
		}
		
		return power;
		
	}
	public static void main(String[] args){
		int exponent = 3;
		int base = 5;
		
		System.out.println(power(base, exponent));
	}
}