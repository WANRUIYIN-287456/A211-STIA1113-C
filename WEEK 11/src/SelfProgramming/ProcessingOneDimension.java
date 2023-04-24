package SelfProgramming;

import java.util.Scanner;

public class ProcessingOneDimension {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

// A) INITIALIZING AN ARRAY TO A SPECIFIC VALUE
		double[] sales = new double[10];
		int index;

		for (index = 0; index < sales.length;index++) {
		    sales[index] = 10.00;
		System.out.println("Sales " + (index+1) + " : " + sales[index]);
		}
		
// B) INPUT DATA TO ARRAY
	
			double[] sales2 = new double[10];
			int index2;
			
			System.out.println("Please input sales.");
			
			for (index2 = 0; index2 < sales2.length;index2++)   
			sales2[index2] = scan.nextDouble();
		   			
// C) PRINTING ARRAY	
			
			 for (index2 = 0; index2 < sales2.length;index2++)
		     System.out.println("Sales " + (index2+1) + ": " + sales2[index2]);
			
// D) FIND THE SUM AND AVERAGE OF AN ARRAY
			 double sum, average;

			 sum = 0;
			 for(index2 = 0; index2 < sales2.length;index2++) 
			 	sum = sum + sales2[index2];

			 if (sales2.length != 0)
			     average = sum / sales2.length;
			 else
			     average = 0.0;
             
			 System.out.println("Sum : " + sum + " and average : " + average);
			
// E) DETERMINE THE LARGEAT ELEMENT IN THE ARRAY 
			 int maxIndex;
			 double largestSale;

			 maxIndex = 0;

			 for(index2 = 1; index2<sales2.length;index2++) 
			    if (sales2[maxIndex] < sales2[index2]) 
			        maxIndex = index2;
			 largestSale = sales2[maxIndex];
		
			System.out.println("Largest Sale          : " + largestSale);
			System.out.println("Largest Sale location : sales2( " + maxIndex + " )");
			
// F) DETERMINE THE LARGEAT ELEMENT IN THE ARRAY 
			 int minIndex;
			 double smallestSale;

			 minIndex = 0;

			 for(index2 = 1; index2<sales2.length;index2++) 
			    if (sales2[minIndex] > sales2[index2]) 
			        minIndex = index2;
			 smallestSale = sales2[minIndex];
		
			System.out.println("Smallest Sale          : " + smallestSale);		
			System.out.println("Smallest Sale location : sales2( " + minIndex + " )");
			
			
			
			
			    
	scan.close();
	}

}
