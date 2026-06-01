/*
Q14. Write a java program to check whether a number is palindrome or not.
*/
import java.util.Scanner;
public class Q14Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int original = num;
		int rev = 0;
		
		while(num!=0){
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		
		if(original==rev){
			System.out.println("Palindrome.");
		}
		else{
			System.out.println("Not Palindrome.");
		}
	}
}