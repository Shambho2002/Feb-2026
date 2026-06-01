/*

Q10. Write a java program to print this pattern.
		
*  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *
      *  *  *  *  *
         *  *  *
            *

*/


public class Q10Pattern{
	public static void main(String[] args){
		
		int row = 5;
		int column = 9;
		
		for(int i = 1; i<=row; i++){ // row
			for(int j = 1; j<=column; j++){ // column
				if(j <= 10-i && j >= 0+i){
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