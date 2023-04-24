package MyArray;
import java.util.Scanner;
public class TestArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum;
int totalsum;
totalsum=0;
sum=0;
int p,q;
int[][] t = new int[3][3];
t[0][0] = 1;
t[0][1] = 4;
t[0][2] = 7;
t[1][0] = 2;
t[1][1] = 5;
t[1][2] = 8;
t[2][0] = 3;
t[2][1] = 6;
t[2][2] = 9;

for (p = 0; p<3; p++){
 for ( q = 0; q<3; q++)
  System.out.print(t[p][q] + " ");
  System.out.println();
}

for (p = 0; p<3; p++){
 for ( q = 0; q<3; q++)
	 sum = sum + t[p][q];
totalsum = totalsum + sum;
}


	System.out.println("Sum : " + sum);
	System.out.println("Totalsum : " + totalsum);
		

Scanner scan = new Scanner (System.in);
int sum2;
int totalsum2;

int row2;
int col2 = 0;
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

totalsum2=0;
sum2=0;
int r,s;
for(r=0; r <row2; r++) {
	     for(s=0;s<col2;s++) 
    	 sum2 = sum2 + matrix2[r][s];
		totalsum2 = totalsum2 + sum2;
}	
	System.out.println("Sum2 : " + sum2);
	System.out.println("Totalsum2 : " + totalsum2);
			
		
		
		
		







}	
	}


