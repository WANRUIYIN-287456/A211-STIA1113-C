package SelfProgramming;

import java.util.Scanner;

public class SampleIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Please insert an integer. ");
		int a = scan.nextInt();
		
		if (a>=1)
		{
			  System.out.println ("The number you enter is :" + a);
			  System.out.println ("You enter the positive number");	
	  }		
		else if (a<0)
		{	
			  System.out.println ("The number you enter is :" + a);
			  System.out.println ("You enter the negative number");	
	  }
		else 
		{	
			  System.out.println ("The number you enter is :" + a);
			  System.out.println ("You enter the zero number");	
		}


	}

}
