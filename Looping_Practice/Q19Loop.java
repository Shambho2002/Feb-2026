/*
Q19. Write a java program to find the sum of the first and last digit of a number.
*/
import java.util.Scanner;
public class Q19Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt(); // 12
		
		int firstNum = 0;
		int lastNum = 0;
		int count = 0;
		
		while(num>0){
			if(count==0){
				lastNum = num%10; // 2
			}
			
			firstNum = num; // 1
			num = num/10; // 0
			count++; // 2
		}
		
		System.out.println("Sum = "+(firstNum+lastNum));
	}
}