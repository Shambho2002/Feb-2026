/*
Q9. Write a java program to print a multiplication table of any number.
*/

import java.util.Scanner;
public class Q9Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=10; i++){
			System.out.printf("\n%d X %d = %d",num,i,num*i);
		}
	}
}