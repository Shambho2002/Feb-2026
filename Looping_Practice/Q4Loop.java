/*
Q4. Write a java program to print all even numbers between 1 to 100.- using while loop
*/

import java.util.Scanner;
public class Q4Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int i = 1;
		while(i<=num){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}
	}
}