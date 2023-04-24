package SelfProgramming;
import java.util.Scanner;
public class SampleBooleanExpressions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x, y, z;
        
        Scanner scanMe = new Scanner (System.in);
        
        System.out.println("Enter value of x= ");
        x = scanMe.nextDouble();
        
        
        System.out.println("Enter value of y= ");
        y = scanMe.nextDouble();
        
        System.out.println("Enter value of z= ");
        z = scanMe.nextDouble();
        if (y!=x) 
         System.out.println("Result : y not equal x");
        
        
        if (z == y) 
            System.out.println("Result : y equal z");
        
        if(x > y)
            System.out.println("Result : x greater than y");
        
        if(y < x) {
            System.out.println("value x " + x + " and value y " + y);
            System.out.println("Result : y less than x");
        }
	}

}

/*output
Enter value of x= 
27
Enter value of y= 
15
Enter value of z= 
15
Result : y not equal x
Result : y equal z
Result : x greater than y
value x 27.0value y 15.0
Result : y less than x
*/

