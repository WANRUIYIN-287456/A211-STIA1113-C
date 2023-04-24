package SelfProgramming;
import java.util.Scanner;
public class IfElse {
//to execute a statement when a condition is true or false

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the input
		Scanner scan = new Scanner (System.in);
		System.out.println("Is today raining? ");
		System.out.println("Please insert \'1\' for yes and \'2\' for no. ");
		int todayIsRaining = scan.nextInt();
		
		
		//analysis and printing
		if (todayIsRaining == 1)
		System.out.println("I should bring an umbrella.");
		else		
		System.out.println("Let's go for a strolling!");
	}

}
