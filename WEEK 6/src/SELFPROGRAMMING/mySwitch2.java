package SELFPROGRAMMING;
import java.util.Scanner;
public class mySwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x;
		
	Scanner scan = new Scanner (System.in);
		
	System.out.println("Enter a integer. ");
	x = scan.nextInt();
	
	// IF NO BREAK, THE CODING WILL RUN UNTIL THE END STARTING FROM THE TRUE STATEMENT
	switch(x) {
	case 10 :
		System.out.println("x is 10.");
		break;
	case 20 :
		System.out.println("x is 20.");
		break;
	case 30 :
		System.out.println("x is 30.");
		break;
	default :
		System.out.println("x is not 10, 20 nor 30.");
	// DEFAULT DO NOT NEED TO BREAK
	
	}
	// TO CLOSE THE INPUT 
	scan.close();
	}

}
