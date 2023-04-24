package RepititionAndSelection;

import java.util.Scanner;

public class Exercise4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		 for(int i=2;i>=0;i--) {
	            System.out.print("Enter your account password: ");
	            int a =x.nextInt();
	            int pass = 12345;
	            if(a==pass) {
	            System.out.println("Your password is correct.");
	            break;
	            }else
	            System.out.print("Your password is wrong! You have "+i+" chance(s). Please enter again: ");
	            System.out.println();
	            if(i==0) {
	            System.out.print("Sorry, you need to wait 5 minutes to key in your password again!");
	            
	    }
	        }
	}

}
