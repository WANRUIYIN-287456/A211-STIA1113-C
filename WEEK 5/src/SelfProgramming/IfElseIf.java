package SelfProgramming;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Is today raining? ");
		System.out.println("Please insert \'1\' for yes and \'2\' for no. ");
		int todayIsRaining = scan.nextInt();
		
		
		//analysis and printing
		if (todayIsRaining == 1) {
		System.out.println("Today is raining.");
		System.out.println("I should bring an umbrella.");
		}
		else if(todayIsRaining == 2) {
		System.out.println("Today is a sunny day.");
		System.out.println("Let's go for a strolling!");	
		}
		
	}

}
