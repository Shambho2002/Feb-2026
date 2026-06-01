/*
Q52. Write a java program to display following series :
           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 
*/
import java.util.Scanner;
public class Q52Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		
		int even = 2;
		int cubeBase = num + 1;
		
		for(int i = 1; i<=num; i++){
			System.out.print(even+" ");
			System.out.print((cubeBase * cubeBase * cubeBase)+" ");
			
			even = even + 2;
			cubeBase--;
		}
	}
}