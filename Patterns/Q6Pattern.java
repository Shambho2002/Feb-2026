/*

Q6. Write a java program to print this pattern.

		 *
       * *
     * * *
   * * * *

*/


public class Q6Pattern{
	public static void main(String[] args){
		
		int n = 4;
		
		for(int i = 1; i<=n; i++){ // row
			for(int j = 1; j<=n; j++){ // column
				if(i+j >= 5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}