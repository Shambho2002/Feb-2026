/*
Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8


*/

import java.util.Scanner;
public class Q28Loop{
	public static boolean spyNumber(int num){
		
		if(num == 0){
			return true;
		}
		
		int sum = 0;
		int product = 1;
		
		while(num != 0){
			
			int digit = num%10;
			sum = sum + digit;
			product = product * digit;
			num = num/10;
			
		}
		
		return sum == product;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		System.out.println("\nOutput:"+spyNumber(num));
		
	}
}