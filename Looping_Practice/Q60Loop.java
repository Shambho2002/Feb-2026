/*
Q60. Write a Java program to display the following series: 
3   6   12   24   48   96  192 
(Each term doubles from the previous term starting at 3)
*/

import java.util.Scanner;
public class Q60Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		for(int i = 3; i<=num; i*=2){
			System.out.print(i+" ");
		}
	}
}