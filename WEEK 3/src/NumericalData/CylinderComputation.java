package NumericalData;

public class CylinderComputation {

	public static void main(String[] args) {
		
		double radius, height, surfaceArea, baseArea, volume;
	
		final double PI = 3.14159265;
		
		radius = 1.2;
		height = 5.0;
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
