/*
Q10. Write a java program to count the number of digits in a number.
*/

import java.util.Scanner;
public class Q10Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int count = 0;
		while(num!=0){
			num = num/10;// 123.4
			count++;
		}
		
		System.out.println(count);
	}
}