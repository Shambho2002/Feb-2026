/*

Q3. Write a java program to print this pattern.

	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*


*/

public class Q3Pattern{
	public static void main(String[] args){
		
		int n = 5;
		
		for(int i = 1; i<=n; i++){ // row
			for(int j = 1; j<=n; j++){ // column
				if(j%2 == 0){
					System.out.print("#");
				}
				else{
					System.out.print("*");
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}