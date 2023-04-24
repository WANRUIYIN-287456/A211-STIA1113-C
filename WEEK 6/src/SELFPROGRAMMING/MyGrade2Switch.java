package SELFPROGRAMMING;

import java.util.Scanner;

public class MyGrade2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program which calculates marks on basis of given grades in java using switch statement
		 * if marks >=90 then Excellent: Grade A
		 * if marks >=90 and less than 80  then Very Good: Grade B  
		 * if marks >=80 and less than 70 then Good: Grade C 
		 * if marks >=70 and less than 60 then Good: Grade D
		 * if marks >=60 and less than 50 then Good: Grade E
		 * if marks <=50 and less than 40 then Just Passed: Grade F
		 * if any other marks then print Failed!
		 */
		
		char grade = 0;	
		//ANS
				
		Scanner scan = new Scanner (System.in);		
		System.out.println("Please insert your mark. ");
		int mark = scan.nextInt();
        
		mark = mark/10;
		// MUST MARK/10 SO THAT THE TENS FULFILL THE CASE
		// IF NOT ONLY 100, 90, 80 ... CAN FULFILL THE CASE
		//SWITCH CANNOT USE DOUBLE. ONLY INTEGER OR CHARACTER!!!***
		switch(mark) {
		case 10 :
		case 9 :
			     grade = 'A';
	    System.out.println("Excellent : Grade " + grade );	     
		break;
		case 8 :
			     grade = 'B';
	    System.out.println("Very good : Grade " + grade);	     
	    break;
		case 7 :
			     grade = 'C';
	    System.out.println("Good : Grade " + grade);		     
	    break;
	    case 6 :
	    	     grade = 'D';
	 	System.out.println("Good : Grade " + grade);	
        break;
	    case 5 :
				 grade = 'E';
		System.out.println("Good : Grade " + grade);	
		break;
	    case 4 :
			     grade = 'F';
	    System.out.println("Just passed : Grade " + grade);	
	    break;	     
	    case 3 :
	    case 2 :
	    case 1 :
        System.out.println("Failed. " );
        break;
        default :
        System.out.println("Invalid Grade. ");
	
		scan.close();
		}
	}

}
