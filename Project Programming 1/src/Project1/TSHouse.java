package Project1;

import java.util.Scanner;

public class TSHouse {
	
	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	int service;
	
	System.out.println("************************************");
	System.out.println("              TS House");
	System.out.println("************************************");
	System.out.println("Lot 1A, Orchid IT Mall, ");
	System.out.println("Street 5, Casual Garden, ");
	System.out.println("10000 State.");
	System.out.println("CareLine : 1300-88-9876");
	System.out.println("H/P: 012-3789654   FAX: 04-3789675");
	System.out.println("************************************");
	
	System.out.println("Welcome to TS House");
	System.out.println("How can I help you?");
	System.out.println("Please enter 1 for updating pogram. Please enter 2 for other service.");
    service = scan.nextInt();
	while(service == 2) {
		System.out.println("TS is still trying hard to provide better service. See you next time");
		System.out.println("Please enter 1 for updating pogram. ");
	    service = scan.nextInt();
	}
	System.out.println("Updating .... Please wait");
	System.out.println();
	System.out.println("Update suceeded. You are directed to the trial now.");
	System.out.println();
	}

}
