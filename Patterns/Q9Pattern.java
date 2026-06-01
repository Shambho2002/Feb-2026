/*

Q9. Write a java program to print this pattern.

            *
         *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *

*/


public class Q9Pattern{
	public static void main(String[] args){
		
		int row = 5;
		int column = 9;
		
		for(int i = 1; i<=row; i++){ // row
			for(int j = 1; j<=column; j++){ // column
				if(j >= 6-i && j <= 4+i){
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