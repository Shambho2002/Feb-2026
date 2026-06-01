/*
Q11. Write a java program to calculate the sum of digits in a number.
*/
import java.util.Scanner;
public class Q11Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		int sum = 0; // 6
		
		while(num!=0){// false
			int rem = num%10; // 1
			sum = sum + rem; // 5 + 1 ==> 6
			num = num/10;// 0
		}
		
		System.out.println("Sum = "+sum);
	}
}