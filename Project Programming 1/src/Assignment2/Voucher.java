package Assignment2;

import java.util.Arrays;

public class Voucher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discountRate =20.00;
		double discount = 160 * 0.2;
		double price = 160*0.8;
		double cash = 140.00;
		double change = cash-price;
		System.out.println();
		System.out.println("Here's a voucher for you.");
		System.out.println("  ======================================  ");
		System.out.println(" //                                    \\\\");
		System.out.println(" \\\\             VOUCHER                //");
		System.out.println(" //____________________________________\\\\");	
		System.out.println(" \\\\                                    //");
		System.out.println(" //         # ORCHID IT MALL           \\\\");	
		System.out.println(" \\\\         # TS HOUSE                 //");
		System.out.println(" //                                    \\\\");	
		System.out.println(" \\\\      $$ DISCOUNT RM20 $$           //");
		System.out.println(" //                                    \\\\");	
		System.out.println(" \\\\   **with purchase of RM200         //");
		System.out.println(" //   **can be used once only          \\\\");
		System.out.println(" \\\\   **use before 21 DEC 2022         //");
		System.out.println(" //                                    \\\\");
		System.out.println(" \\\\                                    //");
		System.out.println("  ======================================  ");
		System.out.println();
		System.out.println("Here is your receipt." );
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("                   TS House");
		System.out.println("*********************************************");
		System.out.println("Lot 1A, Orchid IT Mall, ");
		System.out.println("Street 5, Casual Garden, ");
		System.out.println("10000 State.");
		System.out.println("CareLine : 1300-88-9876");
		System.out.println("H/P: 012-3789654            FAX: 04-3789675");
		System.out.println("*********************************************");
		System.out.println("ITEM                  QTY          PRICE");
		System.out.println("Upgrading Pogram      *1       RM   150.00");
	
		System.out.println("Membership Fee        *1       RM    10.00");
		System.out.println();
		System.out.println();
		System.out.print("Discount rate, %:                    ");
		System.out.printf("%.2f%n",discountRate);
		System.out.print("Discount price  :              RM    ");
		System.out.printf("%.2f%n",discount);
		System.out.print("Final price     :              RM   ");
		System.out.printf("%.2f%n",price);
		System.out.println("_____________________________________________");
		System.out.print("Amount paid     :              RM   ");
		System.out.printf("%.2f%n",cash);
		System.out.print("Change          :              RM    ");
		System.out.printf("%.2f%n",change);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("WARRANTY CODE   :               TS100098");
		System.out.println("*********************************************");
		System.out.println("                  Thank You!");
		System.out.println("              Please come again!");
		System.out.println("*********************************************");
		
		String[][] activitylevel = {{"ACTIVITY LEVEL"," "},
				{"1.2","sedentary         (little to no exercise)"},
				{"1.375","lightly active    (light exercise 1–3 days per week)"},
				{"1.55","moderately active (moderate exercise 3–5 days per week)"},
				{"1.725","very active       (hard exercise 6–7 days per week)"},
				{"1.9","extra active      (very hard exercise or training or a physical job)"}};
        System.out.println(Arrays.deepToString(activitylevel)
        		.replace("],","\n").replace(",","\t")
        		.replaceAll("[\\[\\]]", " "));
	}

}
