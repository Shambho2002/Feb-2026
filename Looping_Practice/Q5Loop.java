/*
Q5. Write a java program to print all odd numbers between 1 to 100.
*/

import java.util.Scanner;
public class Q5Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int i = 1;
		while(i<=num){
			if(i%2==1){
				System.out.print(i+" ");
			}
			i++;
		}
	}
}