/*
Q53. Write a java program to display following series :
           	1  4  9  16  25  36  49  64  81  100
*/
import java.util.Scanner;
public class Q53Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int n = input.nextInt();
		
		for(int i = 1; i<=n; i++){
			System.out.print((i*i)+" ");
		}
	}
}