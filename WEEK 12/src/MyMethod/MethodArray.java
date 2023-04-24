package MyMethod;

import java.util.Scanner;

public class MethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double[] sales2 = new double[10];
		int index2;
		
		System.out.println("Please input sales.");
		for (index2 = 0; index2 < sales2.length;index2++)  
		sales2[index2] = scan.nextDouble();
		
		for (index2 = 0; index2 <sales2.length;index2++)  
		Print((index2+1),sales2[index2]);
		
		
		// SUM AND AVERAGE
       	 double sum, average;
		 sum = 0;
		 for (index2 = 0; index2 < sales2.length;index2++)  
		 sum = sum + sales2[index2];

		 if (sales2.length != 0)
		     average = sum / sales2.length;
		 else
		     average = 0.0;
	     Sum(sum,average);
	}

	
	public static void Print (int s, double t) {

	     System.out.println("Sales " + s + ": " + t);
	}
	
	public static void Sum (double p, double q) {
	
	 System.out.println("Sum : " + p + " and average : " + q);
	}
}
