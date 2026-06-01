/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5

*/

public class Q3Function{
	public static void printNum(int num){
		
		for(int i = 1; i<=num; i++){
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args){
		int num = 5;
		printNum(num);
	}
}