/*
Q6. Write a java program to find the sum of all natural numbers between 1 to n.
*/
import java.util.Scanner;
public class Q6Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num; i++){
			sum = sum + i;
		}
		
		System.out.println("Sum = "+sum);
	}
}