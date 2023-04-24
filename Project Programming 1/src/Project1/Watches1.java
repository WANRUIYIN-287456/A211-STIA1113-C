package Project1;
import java.util.Scanner;
public class Watches1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner (System.in);	
				int qr;
				int yes = 1;
				int sanitise;
				int check;
				double temperature;
				
				
				System.out.println("Welcome to Orchid IT Mall!");
				System.out.println("Please scan the QR code, sanitise your hand and check your temperature.");
				System.out.println("Have you can the QR code? Please enter 1 for yes or 2 for no.");
				qr = scan.nextInt();
			    while(qr != yes){
			        System.out.println("Please scan the QR code, sanitise your hand and check your temperature.");
			        System.out.println("Have you can the QR code? Please enter 1 for yes or 2 for no.");
			        qr = scan.nextInt();
			    }
			    System.out.println("Thank you.");
			    System.out.println();
				System.out.println("Have you sanitise your hands? Please enter 1 for yes or 2 for no.");
			    sanitise = scan.nextInt();
				    while(sanitise != yes) {
					System.out.println("Please scan the QR code, sanitise your hand and check your temperature.");
					System.out.println("Have you sanitise your hands? Please enter 1 for yes or 2 for no.");
				    sanitise = scan.nextInt();
				    }
				    System.out.println("Thank you.");
				    System.out.println();
				    System.out.println("Have you check your temperature ? Please enter 1 for yes or 2 for no.");
				    check = scan.nextInt();
				        while(check != yes) {
				    	System.out.println("Please scan the QR code, sanitise your hand and check your temperature.");
				    	System.out.println("Have you check your temperature ? Please enter 1 for yes or 2 for no.");
				    	check = scan.nextInt();
				        }
				        System.out.println("What is your temperature? ");
					    temperature = scan.nextDouble();
					    while(temperature > 37.5) {
					    	System.out.println("You need to cool down and check your temperature again. ");
					    	System.out.println("What is your temperature now? ");
					    	temperature = scan.nextDouble();
					    }
					    System.out.println("Thank you. You can go in now.");
					    System.out.println();
	}

}
