/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value


*/


import java.util.Scanner;
public class Q7Function{
	public static void factor(int num){
		
		for(int i = 1; i<=num; i++){
			if(num%i == 0){
				System.out.print(i+" ");
			}
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		factor(num);
		
	}
}