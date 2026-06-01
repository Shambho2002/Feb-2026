/*
Q51. Write a java program to display following series :
           	1  2  2  4  3  6  4  8  5  10  6  12
*/
import java.util.Scanner;
public class Q51Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=num; i++){
			System.out.print(i+" "+(i+i)+" ");
		}
	}
}