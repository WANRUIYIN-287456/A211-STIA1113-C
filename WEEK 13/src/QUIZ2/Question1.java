package QUIZ2;

import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1.    A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. 
		a.    Ask user for their salary and year of service and print the net bonus amount.
		b.    Take monthly salary from one employee and print the highest and the lowest salary.
		c.    Take input of age of 3 employees and determine oldest and youngest among them.
*/
		
		 Scanner scan = new Scanner (System.in);

	
			int age=0;
			System.out.println("Please input year of service."); 
			double year = scan.nextDouble();
			
            System.out.println("Please input your salary.");
			double salary = scan.nextDouble();
		
			if (year>5) {
			double bonus = salary*0.05;
			System.out.println("Bouns : " + bonus);
			}
			else
				System.out.println("no bouns");
			double highestsalary = salary *1.05;
			double lowestsalary = salary *1.00;
			System.out.println("Highest salary : " + highestsalary);
			System.out.println("Lowest salary : " + lowestsalary);
			
			int [] age1 = new int[4];
			for(int i=0;i<3;i++){
			 System.out.println("Please input your age.");
			 age1[i] = scan.nextInt();
			}
			
			for(int i=0;i<3;i++){
			int maxage =0;
			if (age1[maxage] < age1[i]) { 
				maxage= i;
				
			    	System.out.println("Oldest : " + age1[maxage]);
			}
			}
			for(int i=0;i<3;i++){
			int minage =0;
		    if (age1[minage]  > age1[i]) {
			        minage = i;
			 System.out.println("Youngest : " + age1[minage]);
			}
			
			}
	}

}
