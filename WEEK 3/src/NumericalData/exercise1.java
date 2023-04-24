package NumericalData;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number1 = 11;
    int number2 = 22;
    int number3 = 33;
    int number4 = 44;
    int number5 = 55;
    int number6 = 66;
    float number7 = 77;
    float number8 = 100;
    double number9 = 88;
    double number10 = 99;
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
    //sum6 is defined because it is double. Double is shorter than float so if sum6 is double it can be defined but not float.
    
    
	}

}
