package NumericalData;
import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in); 
		   System.out.println("Hello, what is your name. ");
	       String name = input.nextLine();
	       System.out.println("Hello, " + name);
	       System.out.println("What is your gred for Mathematics in SPM? ");
	       char gred = input.next().charAt(0);
	       System.out.println("Wow, " + gred + ",keep going. ");
	       System.out.println("What is your CGPA for your STPM? ");
	       double number11 = input.nextDouble();
	       System.out.println(number11 + ",nice.");
		   System.out.println("Please input integer 1. ");
	       int number1 = input.nextInt();
	       System.out.println("Please input integer 2. ");
	       int number2 = input.nextInt();  
	       System.out.println("Please input integer 3. ");
	       int number3 = input.nextInt();  
	       System.out.println("Please input integer 4. ");
	       int number4 = input.nextInt();
	       System.out.println("Please input integer 5. ");
	       int number5 = input.nextInt();  
	       System.out.println("Please input integer 6. ");
	       int number6 = input.nextInt();  
	       System.out.println("Please input float 1. ");
	       float number7 = input.nextFloat();  
	       System.out.println("Please input float 2. ");
	       float number8 = input.nextFloat();  
	       System.out.println("Please input double 1. ");
	       double number9 = input.nextDouble();    
	       System.out.println("Please input double 2. ");
	       double number10 = input.nextDouble();     
		  
		    int sum;
		    int sum2;
		    int sum3;
		    float sum4;
		    double sum5;
		    int average;
		    double sum6;
		    
		    sum = number1 + number2 + number3 + number4 + number5 + number6;
		    System.out.println("The sum of 6 intergers is " + sum + ".");
		    sum2 = number6 -number1;
		    System.out.println("The sum2 is " + sum2 + "." );
		    sum3 = number1 * number2 * number3 * number4 * number5 * number6;
		    System.out.println("The sum3 is " + sum3 + ".");
		    sum4 = number8/number7;
		    System.out.print("The sum4 is ");
		    System.out.printf("%.2f", sum4);
		    System.out.println(".");
		    sum5 = number10/number9;
		    System.out.print("The sum5 is " );
		    System.out.printf("%.2f%n", sum5);
		    average = sum/6;
		    System.out.println("The average of first six numbers is " + average +  ".");
		    sum6 = sum4 + sum5;
		    System.out.print("The sum6 is " );
		    System.out.printf("%.2f%n", sum6);
	}

}
