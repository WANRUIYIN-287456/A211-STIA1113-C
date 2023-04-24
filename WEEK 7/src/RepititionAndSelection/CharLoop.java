package RepititionAndSelection;
import java.util.Scanner;
public class CharLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		char yes = 'y';
		char no  = 'n';
		char choice;
		
		System.out.print("Enter y for yes or n for no: ");
        choice = scan.next().charAt(0);
		while (choice != 'n'){
	        System.out.println("INSIDE LOOPING");
	        System.out.print("Enter y for yes or n for no: ");
	        choice = scan.next().charAt(0);
	    }
	        
	    System.out.println("Sentinel value detected. Good Bye. ");
	}

}
