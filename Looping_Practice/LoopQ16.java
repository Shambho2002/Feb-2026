/*

Q16. Write a java program to find power of a number.

*/

import java.util.Scanner;
public class LoopQ16{
	public static int pow(int exp, int base){
		
		int power = 1;
		
		for(int i = 1; i<=exp; i++){
			power = power * base;
		}
		
		return power;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter exponent: ");
		int exp = input.nextInt();
		System.out.print("\nEnter base: ");
		int base = input.nextInt();
		
		System.out.println("\nPower = "+pow(exp, base));
	}
}