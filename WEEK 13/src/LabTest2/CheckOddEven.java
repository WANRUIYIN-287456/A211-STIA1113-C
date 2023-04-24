package LabTest2;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int proceed;
		
		System.out.print("Please integer 1 to proceed. ");
		 proceed = scan.nextInt();
		while (proceed == 1) {
		System.out.print("Please input an integer. ");
		int num = scan.nextInt();
		int even = num % 2;
		if (even == 0)
		System.out.println(num + " is an even number.");
		else
	    System.out.println(num + " is an odd number.");
		System.out.print("Do you still have number to check ? Please integer 1 to continue or any other integer to stop. ");
		proceed = scan.nextInt();
		}
		
		System.out.println("BYE!");
	}

}
