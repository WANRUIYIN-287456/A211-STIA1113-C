package SELFPROGRAMMING;

import java.util.Scanner;

public class MyGradeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program which calculates marks on basis of given grades in java using switch statement
		 * if Grade A then  marks >=90
		 * if Grade B then marks >=80 and less than 90
		 * if Grade C then marks >=70 and less than 80
		 * if Grade D then marks >=60 and less than 70
		 * if Grade E then marks >=50 and less than 60
		 * if Grade F then marks <=40
		 * if any other grade is passed then print invalid grade
		 */
		
		
		Scanner scan = new Scanner (System.in);		
		System.out.println("Please insert your grade. ");
		String str = scan.next();
        char grade = str.charAt(0);
        
        switch (grade) { 
        case'A' : 
			System.out.println("marks >=90") ;
			break;
        case'B' : 
			System.out.println("marks >=80 and less than 90");
			break;
        case'C' : 
			System.out.println("marks >=70 and less than 80");
			break;
        case'D' : 
			System.out.println("marks >=60 and less than 70");
			break;
        case'E' : 
			System.out.println("marks >=50 and less than 60");
			break;
        case'F' : 
			System.out.println("marks <=40");
			break;
		default :
			System.out.println("INVALID GRADE");		
	
        }
        scan.close();
        
     }

}
