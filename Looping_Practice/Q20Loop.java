/*
Q20. Write a java program to swap first and last digits of a number.
*/
import java.util.Scanner;
public class Q20Loop{
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
			
			firstNum = num;// 1234
			num = num/10;// 123
			count++;
		}
		
		System.out.println("First Number = "+firstNum);
		System.out.println("Last Number = "+lastNum);
	}
}