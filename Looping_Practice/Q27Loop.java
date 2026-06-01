/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step 
number is replaced by the sum of squares of its digit, 
that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.

    Input: n = 19
    Output: True
    19 is Happy Number,
    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1
    As we reached 1, 19 is a Happy Number.

*/

import java.util.Scanner;
public class Q27Loop{
	public static boolean checkHappyNumber(int num){
		
		while(num != 1 && num != 4){
			
			int sum = 0;
			
			while(num != 0){
				
				int digit = num%10;
				sum = sum + digit * digit;
				num = num/10;
				
			}
			
			num = sum;
			
		}
		
		return num == 1;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int n = input.nextInt();
		
		System.out.println(checkHappyNumber(n));
		
	}
}