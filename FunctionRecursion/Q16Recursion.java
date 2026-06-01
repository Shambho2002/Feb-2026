/*
Q16. Print even numbers from 1 to N using recursion
Explanation:
Check if current number is even.
Print it and call recursion for next number.
Example:
Input: N = 10
Output: 2 4 6 8 10

*/


import java.util.Scanner;
public class Q16Recursion{
	public static void printEven(int current, int num){
		
		if(current <= num){
			
			if(current%2==0){
				System.out.print(current+" ");
				
			}
			
			printEven(current+1, num);
			
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		printEven(1, num);
		
	}
}