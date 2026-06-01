/*
Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function


*/

import java.util.Scanner;
public class Q8Function{
	public static void pow(int exponent, int base){
		
		int power = 1;
		
		for(int i = 1; i<=exponent; i++){
			power = power * base;
		}
		
		System.out.println("\nOutput: "+power);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter exponent: ");
		int exponent = input.nextInt();
		
		System.out.print("Enter base: ");
		int base = input.nextInt();
		pow(exponent, base);
	}
}