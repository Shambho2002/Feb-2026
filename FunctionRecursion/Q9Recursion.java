/*
Q9. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.


Example: Input: 4567	 Output: 4

*/


import java.util.Scanner;
public class Q9Recursion{
	static int count = 0;
	public static int coundDigit(int num){
		
		if(num != 0){
			count++;
			coundDigit(num/10);
		}
		
		return count;
		
	}
	public static void main(String[] args){
		int num = 4567;
		System.out.println(coundDigit(num));
	}
}