/*
Q4. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20

*/


import java.util.Scanner;
public class Q4Max{
	public static int findMax(int x, int y){
		
		int max = 0;
		
		if(x > y){
			max = x;
		}
		else{
			max = y;
		}
		
		return max;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		System.out.println("\nMaximum = "+findMax(num1, num2));
		
	}
}