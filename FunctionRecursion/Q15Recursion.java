/*
Q15. Find the product of first N natural numbers using recursion
Explanation:
Multiply current number with previous product.
Stop when N becomes 1.
Example:
Input: N = 4
Output: 24

*/


import java.util.Scanner;
public class Q15Recursion{
	static int product = 1;
	public static int naturalMul(int num){
		
		if(num != 0){
			product = product * num;
			naturalMul(num-1);
			
		}
		
		return product;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.println(naturalMul(num));
	}
}