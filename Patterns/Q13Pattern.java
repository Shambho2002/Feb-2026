/*

Q13. Write a java program to print this pattern.

*	*	*	*	*
*	*	*	*	#
*	*	*	#	#
*	*	#	#	#
*	#	#	#	#


*/


public class Q13Pattern{
	public static void main(String[] args){
		
		int n = 5;
		
		for(int i = 1; i<=n; i++){ // row
			for(int j = n; j>=i; j--){ // column
				if(true){
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