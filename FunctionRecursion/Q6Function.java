/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function


*/

import java.util.Scanner;
public class Q6Function{
	public static void special(int num){
		
		int original = num;
		int sum = 0;
		int product = 1;
		
		while(num > 0){
			
			int digit = num%10;
			sum = sum + digit;
			product = product * digit;
			num = num/10;
			
		}
		
		String str = (sum + product) == original?(original+" is a Special Number."):(original+" is not a Special Number.");
		
		System.out.println(str);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		special(num);
		
	}
}