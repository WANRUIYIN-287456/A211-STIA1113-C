package NumericalData;

import java.util.Scanner;

public class RectangleComputation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double area, perimeter;
		
        System.out.println("Please input length. ");
       double length = input.nextDouble();        
        System.out.println("Please input width. ");
        double width = input.nextDouble();
        
        area = length * width;
        perimeter = 2*(length + width);
		
		
		System.out.println("The length is " + length); 
		System.out.println("The width is " + width); 
		System.out.print("The area is ");
		System.out.printf("%.2f%n", area);
		System.out.print("The perimeter is ");
		System.out.printf("%.2f%n", perimeter);
		}
		
	}


