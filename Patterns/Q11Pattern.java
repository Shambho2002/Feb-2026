/*

Q11. Write a java program to print this pattern.

*
*	*
* 		*
*  			*
*	*	*	*	*


*/


public class Q11Pattern{
	public static void main(String[] args){
		
		int n = 5;
		
		for(int i = 1; i<=n; i++){ // row
			for(int j = 1; j<=n; j++){ // column
				if(i == 5 || j == 1 || i-j == 0){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}