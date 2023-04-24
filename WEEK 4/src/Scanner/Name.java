package Scanner;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter your name: ");
	    String fullname = scan.nextLine();
	    System.out.println("My full name is " + fullname);
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Enter your name: ");
	    String surname = sc.next();
	    String name = sc.next();
	    String name2 = sc.next();
	    
	    System.out.println("My surname is " + surname );
	    System.out.println("My name is " + name +" " + name2);
	   
	    
	   
	}

}
