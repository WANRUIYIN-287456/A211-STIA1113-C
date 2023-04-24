package NumericalData;
import java.util.Scanner;

public class CylinderComputation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double baseArea, surfaceArea, volume;
		final double PI = 3.14159265;
		
        System.out.println("Please input radius. ");
       double radius = input.nextDouble();        
        System.out.println("Please input height. ");
        double height = input.nextDouble();
        
        baseArea = radius * radius * PI;
		surfaceArea = 2 * PI * radius * radius + 2 * PI * radius * height;
		volume = baseArea * height;
		System.out.print("The radius is "); 
		System.out.println(radius);
		System.out.print("The height is "); 
		System.out.println(height);
		System.out.print("The surface area is ");
		System.out.printf("%.2f%n", surfaceArea);
		System.out.print("The base area is ");
		System.out.printf("%.2f%n", baseArea);
		System.out.print("The volume is ");
		System.out.printf("%.2f%n", volume );
		
	}

}
