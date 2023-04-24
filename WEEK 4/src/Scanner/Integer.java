package Scanner;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter an integer: ");
	    int number1= scan.nextInt();
	    System.out.println ("Enter a double value: ");
	    double number2= scan.nextDouble();
	    
	    System.out.println ("Integer: " + number1);
		System.out.println ("Double: " + number2);
		
		double average = (number2 + number1)/2;
		double average2 = (number2 + number1)/2;
		System.out.print("Average: " );
		System.out.printf("%.2f%n",average);
		System.out.println (average2 == 10);
		System.out.println (average2 > 10);
		System.out.println (average2 < 10);
		
		Average(average);
		Average2(average2);
		
	    
		
	}
	public static void Average(double average){
        if (average > 10){
        System.out.println("This is true. ");
        }else {System.out.println("This is false." );}
}
	public static void Average2(double average2){
		System.out.println (average2 == 10);
		System.out.println (average2 > 10);
		System.out.println (average2 < 10);}


	
}

