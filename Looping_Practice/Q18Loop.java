/*
Q18. Write a java program to find the first and last digit of a number.
*/

import java.util.Scanner;
public class Q18Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt(); // 1234
		int firstNum = 0;
		int lastNum = 0;
		int count = 0;
		
		while(num>0){
			if(count==0){
				lastNum = num%10; // 4
			}
			firstNum = num; // 1
			num = num/10; // 0
			count++; // 4
		}
		
		System.out.println("Frist Number = "+firstNum);
		System.out.println("Last Number = "+lastNum);
	}
}