package SelfProgramming;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Is today raining? ");
		System.out.println("Please insert \'1\' for yes and \'2\' for no. ");
		int todayIsRaining = scan.nextInt();
		
		
		//analysis and printing
		//first if with condition
		if (todayIsRaining == 1) {
		System.out.println("Today is raining.");
		System.out.println("I should bring an umbrella.");
		}
		//second if with condition
		else if(todayIsRaining == 2) {
		System.out.println("Today is not raining.");
		System.out.println("Then, is today a sunny day? ");
		System.out.println("Please insert \'1\' for yes and \'2\' for no. ");
		int todayIsSunny = scan.nextInt();
		
		// nested if in second if
		if (todayIsSunny == 1) {
		System.out.println("Today is a sunny day.");
		System.out.println("Let's go for strolling.");
		}
		else if(todayIsSunny == 2) {
		System.out.println("Today is neither raining nor sunny.");
		System.out.println("I'd better stay at home. ");
		}
		else{
		System.out.println("An error has occured. Please try again.");
		System.out.println("Please input only integer 1 or 2. ");
		}
		// third if includes any condition except foe condition1 and condition2
		}
		else {
		System.out.println("An error has occured. Please try again.");
		System.out.println("Please input only integer 1 or 2. ");
		}
}

}
