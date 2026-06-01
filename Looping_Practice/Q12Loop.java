/*
Q12. Write a java program to calculate the product of digits in a number.
*/
import java.util.Scanner;
public class Q12Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt(); // 1234
		int product = 1; // 24
		
		if(num==0){
			product = 0;
		}
		else{
			while(num!=0){ // true
				int rem = num%10; // 1
				product = product * rem; // 24 * 1 == 24
				num = num/10; // 0
			}
		}
		
		System.out.println("Product = "+product);
	}
}