package LabTest;

import java.util.Scanner;

public class LabTest1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double basicWages = 5.00;
		double salesVolume = 0;
		int hour;
		double sales = 0;
		double commission = 0;
		double dailyWages = 0;
		System.out.println("DAILY WAGES FOR STAFF");
		System.out.print("Please enter your working hour : ");
		hour = scan.nextInt();
		System.out.print("Basic hourly wages             : RM " );
		System.out.printf("%.2f%n", basicWages);
		System.out.print("Please enter your sales        : RM ");
		sales = scan.nextDouble();
		
		if(sales>=150 && sales<=300) {
			commission = sales * 0.05;
		}
		else if(sales>=301 && sales<=500) {
			commission = sales * 0.10;
		}
		else if(sales>500 ) {
			commission = sales * 0.15;
		}
		
		dailyWages = basicWages * hour + commission;
		System.out.println();
		System.out.print("Commission     : RM ");
		System.out.printf("%.2f%n", commission);
		System.out.print("Daily wages    : RM ");
		System.out.printf("%.2f%n", dailyWages);
		
	}

}
