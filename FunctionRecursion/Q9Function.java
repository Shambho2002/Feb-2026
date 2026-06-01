/*
Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function


*/

import java.util.Scanner;
public class Q9Function{
	public static int factorial(int n){
		
		int fact = 1;
		
		for(int i = n; i>=1; i--){
			fact = fact * i;
			
		}
		
		return fact;
		
	}
	public static void strong(int num){
		
		if(num == 0){
			System.out.println("\nNot Strong Number.");
			return;
		}
		
		int original = num;
		int sum = 0;
		
		while(num > 0){
			
			int digit = num%10;
			sum = sum + factorial(digit);
			num = num/10;
			
		}
		
		if(sum == original){
			System.out.println("\nStrong Number.");
		}
		else{
			System.out.println("\nNot Strong Number.");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		strong(num);
		
	}
}