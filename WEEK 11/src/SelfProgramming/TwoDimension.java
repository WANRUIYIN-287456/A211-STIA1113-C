package SelfProgramming;

public class TwoDimension {

	public static void main(String[] args) {

		//1. DECLARE ARRAY
		       double[ ][ ] sales = new double[10][15];

				
		//2. ACCESSING AN ARRAY
				
		       sales [5][3] = 25.75;
		       sales [4][2] = 25.25;
			    System.out.print(sales [5][3] + " " + sales [4][2]);
		        System.out.println();
		        
		
		//3. ARRAY INITIALIZATION DURING DECLARATION
			    int[ ][ ] board = { {2,3,1},
	                                {15,25,13},
	                                {20,4,7},
	                                {11,18,14}};
			    /*  2  3  1
			       15 25 13
			       20  4  7
			       11 18 14
			     */
				System.out.print(board[2][2]);
				
	
				


	}

}
