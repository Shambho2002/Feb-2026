/*
Q5. Write a function that accepts a number and prints its multiplication table up to 10.
Explanation
Use a loop from 1 to 10
Multiply number with loop variable
Print result inside function
Example
Input: 3
Output:
3 x 1 = 3  
3 x 2 = 6  
3 x 3 = 9  
...
3 x 10 = 30


*/

import java.util.Scanner;
public class Q5Function{
	public static void table(int num){
		
		for(int i = 1; i<=10; i++){
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		table(num);
	}
}