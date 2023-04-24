package MyMethod;
import java.util.Scanner;
public class MethodArrayHaikal {

	public static void main(String[] args) {
		
				int[][] x = new int [3][3];
				scannerInput(x);
				System.out.println();
				resultArray(x);
				System.out.println();
				
				int sum = sumArray(x);
				System.out.println();
				System.out.println(sum);

			}

			public static int[][] scannerInput(int[][] x) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter 9 numbers : ");
				
				for(int a=0; a < x.length; a++ )
				{
					for(int j = 0; j < x.length; j++) {
						System.out.println("Insert row " + (a + 1) + " and column " + (j + 1));
						x[a][j] = sc.nextInt();
					}
					
				}
				return x;
				
			}
			
			public static void resultArray(int[][] x) {
				for (int a=0; a < x.length; a++)
				{
					for (int b=0; b < x.length; b++){
						{
							System.out.print(x[a][b] + " ");
						}
					}
				}
			}
			
			public static int sumArray(int[][] x)
			{
				for (int a=0; a < x.length; a++)
				{
					int sum = 0;
					for (int b=0; b < x.length; b++){
						sum = sum + x[a][b];
					System.out.print(sum + " ");
					}
					return sum;
				}
				return 0;
			}
		}