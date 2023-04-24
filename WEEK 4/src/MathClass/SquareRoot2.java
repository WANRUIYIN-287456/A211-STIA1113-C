package MathClass;

public class SquareRoot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'a';
		char y = 'b';
		char z = 'c';
		double formula;
		formula = (-y + Math.sqrt(y * y - (-4) * x * z)) / (2 * x);
		//squareroot -ve is false or math error
	    double i = y*y;
	    double j = 4*x*z;
	    double k =  -(i - j);
	    double kk = Math.sqrt(k);
	    double l = -y + kk;
	    double m = 2*x;
	    double mm = l/m; 
	    int ascii = (int)y;
	    int asci = (int)x;
	    int asciii = (int)z;
	    double ascii4 = Math.pow(x, y);
        double ascii5 = Math.min(x, y);
        double ascii6 = Math.max(x, y);
        double ijk = 112.257;
        double ascii7 = Math.round(ijk);
        
        
	    System.out.println("y is : " + ascii);
	    System.out.println("x is : " + asci);
	    System.out.println("z is : " + asciii);
	    System.out.println("i is : " + i);
	    System.out.println("j is : " + j);
	    System.out.println("k is : " + k);
	    System.out.println("kk is : " + kk);
	    System.out.println("l is : " + l);
	    System.out.println("m is : " + m);
	    System.out.println("mm is : " + mm);
	    System.out.println("Formula of Power is: " + ascii4);
        System.out.println("The minimum number is: " + ascii5);
        System.out.println("The maximum number is: " + ascii6);
        System.out.println("The formula is: " + formula);
        System.out.println("The round number is: " + ascii7);
		
	}

}
