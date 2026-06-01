/*
Q17. Write a java program to find all factors of a number.
*/
import java.util.Scanner;
public class Q17Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=num; i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}