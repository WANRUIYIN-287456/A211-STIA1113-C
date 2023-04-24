package SelfProgramming;
import java.util.Scanner;
public class SampleNestedIf {

	public static void main(String[] args) {
	/*Example
The grading scheme for a course is given as below:
		Mark			Grade
		90 - 100		A
		80 – 89		    B
		70 – 79		    C
		60 – 69		    D
		0  -   59	    F
Read a mark & determine the grade.*/
		
char grade = 0;	
//ANS
		
Scanner scan = new Scanner (System.in);		
System.out.println("Please insert your mark. ");
int mark = scan.nextInt();

if (mark >= 90 && mark <100)
	     grade = 'A';
else if (mark >= 80 && mark <= 89)
	     grade = 'B';
else if (mark >= 70 && mark <= 79)
	     grade = 'C';
else if (mark >= 60 && mark <= 69)
		 grade = 'D';
else if (mark >= 0 && mark <= 59)
		 grade = 'F';

System.out.println("Your grade is " + grade + ".");
		     
scan.close();
	
	}

}
