package PastYear;
import java.util.Scanner;
public class MidTerm {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numOfStudents=4, numOfQuizzes=3;

		int [][] grade = new int [numOfStudents][numOfQuizzes];
		 
		for (int student = 1; student <= numOfStudents; student++)
		  for (int quiz = 1;  quiz <= numOfQuizzes; quiz++)
		  {
		    System.out.println("Enter score for student: " + student);                    
		    System.out.print("on quiz: " +quiz);
		    grade[student - 1][quiz - 1] =sc.nextInt();
		  }//

	}

}
