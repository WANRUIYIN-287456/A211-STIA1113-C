package MathClass;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a =3;
	int b =8;
	int c =4;
	int d =50;
	float e;
	e=(float)d/6;
	double formula;
	formula = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.print("Formula : ");	
	System.out.printf("%.2f%n", formula);
	System.out.print("e : ");
	System.out.printf("%.2f%n", e);
	
	}

}
