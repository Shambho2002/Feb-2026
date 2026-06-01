/*
Q55. Write a java program to display following series :
           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/

import java.util.Scanner;
public class Q55Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int n = input.nextInt();
		
		int a = 1, b = 1;
		
		for(int i = 1; i<=n; i++){
			
			if(i%2!=0){
				
				System.out.print(5 * a + " ");
				
				a++;
				
			}else{
				
				System.out.print(3 * b + " ");
				
				b++;
				
			}
			
		}
		
	}
}