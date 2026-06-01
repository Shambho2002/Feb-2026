/*
Q13. Write a java program to enter a number and print its reverse.
*/

import java.util.Scanner;
public class Q13Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();// 1234
		
		int rev = 0; // 4321
		while(num!=0){ // false
			int rem = num%10; // 1
			rev = rev * 10 + rem;// 432 * 10 + 1 ==> 4320+1==> 4321
			num = num/10; // 0
		}
		
		System.out.println(rev);
	}
}