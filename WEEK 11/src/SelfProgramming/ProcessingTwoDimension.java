package SelfProgramming;

import java.util.Scanner;

public class ProcessingTwoDimension {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		// DECLARATION
		    int row;
  			int col;
			int matrix[][] = new int[7][6];

		// A) INITIALIZING AN ARRAY TO A SPECIFIC VALUE
			
			for (row = 0; row < matrix.length; row++)
			    for (col = 0; col < matrix[row].length; col++)
				matrix[row][col] = 10;	
				   			
		// B) PRINTING ARRAY	
					
			for (row = 0; row < matrix.length; row++)
				{
				 for ( col = 0; col < matrix[row].length; col++)
				  System.out.print(matrix[row][col] + " ");
				  System.out.println();
				}
					
		// C) INPUT DATA TO ARRAY
			int row2;
  			int col2;
			int matrix2[][] = new int[4][3];
			
					System.out.println("Please input matrix.");
					
					for (row2 = 0; row2 < matrix2.length; row2++)
						  for (col2 = 0; col2 < matrix2[row2].length; col2++)
						   matrix2[row2][col2] = scan.nextInt();

					for (row2 = 0; row2 < matrix2.length; row2++)
					{
					 for ( col2 = 0; col2 < matrix2[row2].length; col2++)
					  System.out.print(matrix2[row2][col2] + " ");
					  System.out.println();
					}
					
		// D) DETERMINE THE LARGEAT ELEMENT IN THE ARRAY 
					 int largest;
					 for (row2 = 0; row2 < matrix2.length; row2++)
					 {
					   largest = matrix2[row2][0];
					   for (col2 = 1; col2 < matrix2[row2].length; col2++)
					 	if (largest < matrix2[row2][col2])
					 	    largest = matrix2[row2][col2];
					   System.out.println("The largest element of row " + (row2+1)
					                      + " = " + largest);
					 }     	
				
		
			scan.close();

	}

}
