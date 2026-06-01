/*
Q11. Print numbers from N to 1 using recursion
Explanation:
Print current number.
Call function with N-1.
Stop when number becomes 0.
Example:
Input: N = 5
Output: 5 4 3 2 1

*/


import java.util.Scanner;
public class Q11PrintNum{
	public static void printRev(int num){
		
		if(num != 0){
			System.out.print(num+" ");
			printRev(num-1);
			
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		printRev(num);
	}
}