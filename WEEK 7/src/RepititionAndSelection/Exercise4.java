package RepititionAndSelection;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int password, password1;
		int i=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please set your numerical password. ");
		password = scan.nextInt();
		System.out.println("Please enter your password.");
		password1 = scan.nextInt();
		
		
		for (i=3; i>=0; i--) {
			if(i==0) {
				System.out.println("LOGIN FAILED. Please try again after 30s.");
		        }
			if (password == password1) { 
				System.out.println("Correct password. ");
			break;
			}
			else if(password != password1) {
				System.out.println("Wrong password. ");
				System.out.println("You have "+i+" chance(s). Please re-enter your password.");
				password1 = scan.nextInt();				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
