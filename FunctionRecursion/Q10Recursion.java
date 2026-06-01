/*
Q10. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321

*/


import java.util.Scanner;
public class Q10Recursion{
	public static int rev = 0;
	public static int reverse(int num){
		
		if(num != 0){
			int digit = num%10;
			rev = rev * 10 + digit;
			reverse(num/10);
			
		}
		
		return rev;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.println(reverse(num));
	}
}