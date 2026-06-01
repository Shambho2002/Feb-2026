/*
Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type


*/

import java.util.Scanner;
public class Q10Function{
	public static void fibo(int num){
		
		int[] dp = new int[num+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i<dp.length; i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		for(int i = 0; i<dp.length; i++){
			System.out.print(dp[i]+" ");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		fibo(num);
	}
}