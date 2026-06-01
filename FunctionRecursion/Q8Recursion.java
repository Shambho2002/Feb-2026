/*
Q8. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.


Example: Input: N = 4	Output: 10

*/


import java.util.Scanner;
public class Q8Recursion{
	public static int naturalSum(int num){
		
		int sum = 0;
		
		if(num != 0){
			
			sum = num + naturalSum(num-1);
			
		}
		
		return sum;
		
	}
	public static void main(String[] args){
		int num = 5;
		System.out.println(naturalSum(num));
	}
}