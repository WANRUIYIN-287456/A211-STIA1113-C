package SelfProgramming;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
// QUESTION : New withdrawal condition:Withdrawal amount of more than RM1000.00 is not allowed.
	//TO GET INPUT
	Scanner scan = new Scanner (System.in);	
	System.out.println("Please insert the amount of money you need to withdraw.");
	double amount = scan.nextDouble();
	System.out.println("Please insert the balance in your account.");
	double balance = scan.nextDouble();
	
	//AND
	if  (amount <= 1000.0 && amount <= balance)
	{balance = balance - amount;  
	System.out.print("Acct new balance1 = ");
	System.out.printf("%.2f%n", balance);
		}
	//OR - DO NOT FUFILL THIS QUETION
	else if  (amount <= 1000.0 || amount <= balance)
	{balance = balance - amount;  
	System.out.print("Acct new balance2 = ");
	System.out.printf("%.2f%n", balance);
		}
	//NOT - DOES NOT WORK HERE
	else if  (amount <= 1000.0 != amount <= balance)
	{balance = balance - amount;  
	System.out.print("Acct new balance3 = ");
	System.out.printf("%.2f%n", balance);
		}
	else
	System.out.println("ERROR!");
	
	
	
	
	
	}

}
