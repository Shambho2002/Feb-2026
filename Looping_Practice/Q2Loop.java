/*
Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
*/
import java.util.Scanner;
public class Q2Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int i = 1;
		while(i<=num){
			System.out.print(num+" ");
			--num;
		}
	}
}