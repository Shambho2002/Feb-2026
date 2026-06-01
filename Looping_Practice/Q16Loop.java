/*
Q16. Write a java program to find power of a number.
*/

import java.util.Scanner;
public class Q16Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Exponent: ");
		int exponent = input.nextInt(); // 3
		System.out.print("Enter Base: ");
		int base = input.nextInt(); // 5
		int power = 1; // 25
		
		for(int i = 1; i<=exponent; i++){ // 3
			power = power * base; //25 * 5 => 125 
		}
		
		System.out.println("Power = "+power);
		
	}
}