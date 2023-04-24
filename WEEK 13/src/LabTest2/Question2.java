package LabTest2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] mark = new int[3];
		int i;
		
		for (i = 0; i<3;i++) {
		System.out.println("Enter the mark (0-100) for student " + (i+1)+ " :");  
		mark[i] = scan.nextInt();
		
		while (mark[i] <0 ||mark[i] >100) {
		System.out.println("NOT VALID! Please try again!"); 
			System.out.println("Enter the mark (0-100) for student " + (i+1) + " :");  
			mark[i] = scan.nextInt();
		}
		}
		
		 double sum, average;

		 sum = 0;
		 for(i = 0; i < mark.length;i++) 
		 	sum = sum + mark[i];

		 if (mark.length != 0)
		     average = sum / mark.length;
		 else
		     average = 0.0;
         
		 System.out.printf("The average : " + "%.2f",average);
		
		
		
		
	}

}
