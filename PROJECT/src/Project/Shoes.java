package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Shoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---0`~`0---RAYYAN SPORT SHOES SHOP---0`~`0---");
		System.out.println("\t");
		String inputuserdetails = null;
		InputUserDetails(inputuserdetails);
		String mainprogram = null;
		MainProgram(mainprogram);
		String pricecalculation = null;
		PriceCalculation(pricecalculation);
		String typerofpayment = null;
		TypeOfPayment(typerofpayment);
	}
		
		public static void InputUserDetails(String inputuserdetails) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String name;
		name = sc.next();
		System.out.println("\t");
		System.out.println("Enter your gender (Women=W && Men=M) :");
		char gender =sc.next().charAt(0);
					
		
		if (gender == 'W' || gender =='w') {

		System.out.println("********SIZE FOR WOMEN********");
		System.out.println("*30-33 = Total price + RM1.00*");
		System.out.println("*34-37 = Total price + RM2.00*");
		System.out.println("*38-41 = Total price + RM3.00*");
		System.out.println("******************************");
		System.out.println();
		}
		
		else if (gender == 'M' || gender=='m') {
			System.out.println();
		
		System.out.println("*********SIZE FOR MEN*********");
		System.out.println("*37-40 = Total price + RM3.00*");
		System.out.println("*41-44 = Total price + RM4.00*");
		System.out.println("*45-48 = Total price + RM5.00*");
		System.out.println("******************************");
		
		}
		

		System.out.println("Enter your shoes size:");
		int size =sc.nextInt();
	}
	public static void MainProgram(String mainprogram) {
		Scanner sc = new Scanner(System.in);
		String brand,design,sets;
		int size;
		System.out.print("BRANDS AND TYPE");
		
		for(int i=1;i<6;i++) {
			System.out.print("---");
		}
		System.out.println("\n_________________________________________________");
		System.out.println("| Adidas   |-Football    |Price design + RM2.00 |");
		System.out.println("|          |-Hiking      |                      |");
		System.out.println("|          |-Daily wear  |                      |");
		System.out.println("|__________|_____________|______________________|");
		System.out.println("|Puma      |-Flats       |Price design + RM2.50 |");
		System.out.println("|          |-Runners     |                      |");
		System.out.println("|          |-Kicks       |                      |");
		System.out.println("|__________|_____________|______________________|");
		System.out.println("|Skechers  |-Works       |Price design + RM3.00 |");
		System.out.println("|          |-Runners     |                      |");
		System.out.println("|          |-Hiking      |                      |");
		System.out.println("|__________|_____________|______________________|");
		System.out.println("|Nike      |-Football    |Price design + RM3.20 |");
		System.out.println("|          |-Skate       |                      |");
		System.out.println("|          |-Gym         |                      |");
		System.out.println("|__________|_____________|______________________|");
		System.out.println("|Line7     |-Cycling     |Price design + RM3.50 |");
		System.out.println("|          |-Jogging     |                      |");
		System.out.println("|          |-Tennis      |                      |");
		System.out.println("|__________|_____________|______________________|");
		
		System.out.println("Enter brand(type):");
		brand = sc.next();
		System.out.println("\t");
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^DESIGN^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^Plain with chosen colour            = RM60.00 ^");
		System.out.println("^Stripe                              = RM80.00 ^");
		System.out.println("^Air max                             = RM100.00^");
		System.out.println("^Autumn Travel                       = RM150.00^");
		System.out.println("^Limited edition(UV changing color)  = RM200.00^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		System.out.println("-----------------------SETS WITH ANY BRANDS------------------------");
		System.out.println("___________________________________________________________________");
		System.out.println("|    Set   |                     LIST                             |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     A    |-Plain and Stripe only                                |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     B    |-Autumn Travel and Stripe only                        |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     C    |-Air max only                                         |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     D    |-Limited edition only                                 |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     E    |-PREMIUM (ADIDAS AND PUMA brands only with any design |");
		System.out.println("|__________|______________________________________________________|");
		
		System.out.println("\t");
		//DO NOT PUT SPACE WHEN ENTER DESIGN
		System.out.println("Your wanted design:");
		design =sc.next();
		
		System.out.println("\t");
		System.out.println("Enter your chosen set:");
		sets = sc.next();
		
		System.out.println("\t");

	}
	public static void PriceCalculation(String pricecalculation) {
		Scanner sc = new Scanner(System.in);
		double price;
		
		System.out.println("\t");

		System.out.println("---------------------------------SETS THAT COME WITH OFFERS--------------------------------");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("|    Set   |           OPFFERS                       |       PRICE                        |");
		System.out.println("|__________|_________________________________________|____________________________________|");
		System.out.println("|     A    |-Buy 1, Free 1                           |Price set A + RM0                   |");
		System.out.println("|__________|_________________________________________|____________________________________|");
		System.out.println("|     B    |-Buy 2 gets 30% off for second shoes     |Price set B + (price set B * 30%)   |");
		System.out.println("|__________|_________________________________________|____________________________________|");
		System.out.println("|     C    |-Buy 3 gets limited free gifts worth RM50| Price set C + free gifts           |");
		System.out.println("|__________|_________________________________________|____________________________________|");
		System.out.println("|     D    |-Buy 2 gets to wear test any brands      | Price set D + RM5.00               |");
		System.out.println("|          | by add RM5.00                           |                                    |");
		System.out.println("|__________|_________________________________________|____________________________________|");
		System.out.println("|     E    |-Get member ship card                    | Price set E + (RM 10.00)           |");
		System.out.println("|__________|_________________________________________|____________________________________|");
					
		System.out.println("\t");
		
		System.out.println("-----------------------CALCULATION FOR PRICE-----------------------");
		System.out.println("___________________________________________________________________");
		System.out.println("|    Set   |                Formula Price                         |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     A    |(RM60.00 OR RM 80.00) + RM0                           |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     B    |RM150.00 + (RM80 * 30%) OR RM80 + (RM150 *30%)        |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     C    |RM150.00 * 3 + FREE GIFTS                             |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     D    |(RM200.00 * 2) + RM5.00                               |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("|     E    |(RM60.00 OR RM 80.00 OR RM100.00 OR RM150.00          |");
		System.out.println("|          |   OR RM200.00) + RM10.00                             |");
		System.out.println("|__________|______________________________________________________|");
		System.out.println("THE PRICE FOR SIZE AND DESIGN WILL BE ADDED AFTER THE CALCULATION FOR PRICE");

		System.out.println("Total Price: RM");
		price = sc.nextDouble();
	
	}
	
	public static void TypeOfPayment(String typeofpayment) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How do you wish to pay? (cash=1 && card=2) :");
		int cash = sc.nextInt();

		if (cash == 1) {
		System.out.println("Please hand in the money to the cashier");
		System.out.println("THANK YOU for puchasing with us" );

		}
		else if (cash == 2) {
		System.out.println("Do you want payWave or pin");
		System.out.println("If payWave please put your card here, if pin please input your pin");
		System.out.println("THANK YOU for puchasing with us" );

		}
	}
	}
