package SELFPROGRAMMING;

import java.util.Scanner;

public class MyGrade2 {

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

		if (mark >= 90 && mark <=100) {
			     grade = 'A';
	    System.out.println("Excellent : Grade " + grade );	     
		}
		else if (mark >= 80 && mark <= 89) {
			     grade = 'B';
	    System.out.println("Very good : Grade " + grade);				     
		}
		else if (mark >= 70 && mark <= 79) {
			     grade = 'C';
	    System.out.println("Good : Grade " + grade);	
		}
		else if (mark >= 60 && mark <= 69) {
				 grade = 'D';
		System.out.println("Good : Grade " + grade);	
	    }
		else if (mark >= 50 && mark <= 59) {
				 grade = 'E';
		System.out.println("Good : Grade " + grade);	
		}
		else if (mark >= 40 && mark <= 49) {
			     grade = 'F';
	    System.out.println("Just passed : Grade " + grade);	
		}		     
		else 
        System.out.println("Failed. " );	
	
		 scan.close();
	}

}
