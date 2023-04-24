package SelfProgramming;
import java.util.Scanner;
public class OneDimension {

	public static void main(String[] args) {
		
//1. DECLARE ARRAY
		int[] num = new int[10]; // OR  int num[] = new int[5];
		
//2. ASSIGN VALUE
		
		num[3] = 10;
        num[6] = 35;
	    num[5] = num[3] + num[6];
	    System.out.print(num[3] + " " + num[6] + " " + num[5]);
        System.out.println();
        
//3. SPECIFYING ARRAY SIZE
	    Scanner scan = new Scanner (System.in);	
	    int arraySize;
	    System.out.print("Enter the size of the array: "); 
	    arraySize = scan.nextInt();
	    int[] list = new int[arraySize];
	    
//4. ARRAY INITIALIZATION DURING DECLARATION
	    int[] num2 = {1, 7, 9, 11, 98};
		System.out.println("Size of num2 :" + num2.length);
		
		
		
		
	}

}
