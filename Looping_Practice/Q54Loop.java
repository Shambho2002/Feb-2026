/*
Q54. Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.
*/

import java.util.Scanner;
public class Q54Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int n = input.nextInt();
		
		int num = 1;
		int diff = 1;
		
		for(int i = 1; i<=n; i++){
			System.out.print(num+" ");
			num = num + diff;
			diff++;
		}
	}
}