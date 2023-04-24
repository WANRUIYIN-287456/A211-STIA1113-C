package Project;
import java.util.Arrays;
import java.util.Scanner;
public class Handbags {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String user_details = null;
		input_user_details(user_details);
		String program = null;
		mainProgram(program);
		String receipt = null;
		paymentReceipt(receipt);
		
	}
	
	public static void input_user_details(String user_details) {
		Scanner sc = new Scanner(System.in);
		System.out.println("__________________________________________________________________________________");
		System.out.println("");
		System.out.println("	ZALORA MALAYSIA: Online Platform for Customize Handbags Service" );
		System.out.println("__________________________________________________________________________________");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("	** Customer Service Team at 03-92123535 or customer@my.zalora.com");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Welcome to ZALORA, online platform for FASHION & LIFESTYLE! ");
		System.out.println("This program provide a customize handbag service.");
		System.out.println();
		
		System.out.println("First, do you wish to obtain suggestion size, weight and type of handbags? (Y/N)");
		char a = sc.next().charAt(0);
		
		
	
		if((a=='y')||(a=='Y')) {
			System.out.println("Please answer the following question accordingly.");
			System.out.println("1. Please enter your height (cm): ");
			int b = sc.nextInt();
			System.out.println("2. Please enter your weight (kg): ");
			int c = sc.nextInt();
			System.out.println("3. Please enter your body type: ");
			System.out.println("  a.	Inverted Triangle Body Type");
			System.out.println("  b.	Triangle Body Type");
			System.out.println("  c.	Rectangle Body Type");
			System.out.println("  d.	Hourglass Body Type");
			System.out.println("  e.	Apple Body Type");
			char d = sc.next().charAt(0);
			
			System.out.println();
			System.out.println("Handbag size chart by height and weight:");
			System.out.println();
			String[][] height = {{"Height(cm)","Recommend Size of Handbag"},
								{"-------------------------------------------"},
								{">175 cm","Large or Extra large"},
								{"160 - 175 cm","Medium"},
								{"<160 cm","Small"}};
			System.out.println(Arrays.deepToString(height)
					.replace("],","\n").replace(",","\t| ")
	                .replaceAll("[\\[\\]]", " "));
			
			
			System.out.println();
			String[][] weight = {{"Weight(kg)","Recommend Size of Handbag"},
								{"-------------------------------------------"},
								{">75kg	","Large or Extra large"},
								{"60 - 75kg","Medium or Large"},
								{"45 - 60kg","Medium"},
								{"<45kg	","Small"}};
			System.out.println(Arrays.deepToString(weight)
					.replace("],","\n").replace(",","\t| ")
	                .replaceAll("[\\[\\]]", " "));
			System.out.println();
			System.out.println();
			
			System.out.println("Handbag  suggestion chart by Body Type: ");
			System.out.println();
			String[][] bodytype ={{"Body Type		","Suggestion Handbag"},
									{"--------------------------------------------------------"},
									{"Inverted Triangle Body Type","-crossbody hanbags"},
									{"			","-hobo handbags"},
									{"			", "-shoulder handbags"},
									{"			", ""},
									{"Triangle Body Type	","-satchel handbags"},
									{"			", ""},
									{"Rectangle Body Type	","-satchel hanbags"},
									{"			","-hobo handbags"},
									{"			", ""},
									{"Hourglass Body Type	","-tote handbags"},
									{"			","-satchel handbags"},
									{"			","-hobo handbags"},
									{"			","-shoulder handbags"},
									{"			", ""},
									{"Apple Body Type	","-tote handbags"}};
			System.out.println(Arrays.deepToString(bodytype)
					.replace("],","\n").replace(",","\t| ")
	                .replaceAll("[\\[\\]]", " "));
			System.out.println("");
			
			if(b<160) {
				System.out.println("Suggestion:");
				System.out.println("	Your height is "+b+"cm.");
				System.out.println("	Recommend size of handbags based on the chart above is SMALL size.");
				System.out.println("");
			}else if((b>=160)&&(b<=175)) {
				System.out.println("Suggestion:");
				System.out.println("	Your height is "+b+"cm.");
				System.out.println("	Recommend size of handbags based on the chart above is MEDIUM size.");
				System.out.println("");
			}else if(b>175) {
				System.out.println("Suggestion:");
				System.out.println("	Your height is "+b+"cm.");
				System.out.println("	Recommend size of handbags based on the chart above is LARGE or EXTRA LARGE size.");
				System.out.println("");
			}
			
			if(c<45) {
				System.out.println("	Your weight is "+c+"kg.");
				System.out.println("	Recommend size of handbags based on the chart above is SMALL size.");
				System.out.println("");
			}else if((c>=45)&&(c<=60)) {
				System.out.println("	Your weight is "+c+"kg.");
				System.out.println("	Recommend size of handbags based on the chart above is MEDIUM size.");
				System.out.println("");
			}else if((c>=60)&&(c<=75)) {
				System.out.println("	Your weight is "+c+"kg.");
				System.out.println("	Recommend size of handbags based on the chart above is MEDIUM or LARGE size.");
				System.out.println("");
			}else if(c>75) {
				System.out.println("	Your weight is "+c+"kg.");
				System.out.println("	Recommend size of handbags based on the chart above is LARGE or EXTRA LARGE size.");
				System.out.println("");
			}
			
			switch (d) {
			
			case 'a':
			case 'A':
				System.out.println("	Your body type is Inverted Triangle Body Type.");
				System.out.println("	Suggestion Handbags:");
				System.out.println("		i.   Crossbody handbags");
				System.out.println("		ii.  Hobo handbags");
				System.out.println("		iii. Shoulder handbags");
				System.out.println("");
				break;
			case 'b':
			case 'B':
				System.out.println("	Your body type is Triangle Body Type.");
				System.out.println("	Suggestion Handbags:");
				System.out.println("		i.   Satchel handbags");
				System.out.println("");
				break;
			case 'c':
			case 'C':
				System.out.println("	Your body type is Rectangle Body Type.");
				System.out.println("	Suggestion Handbags:");
				System.out.println("		i.   Satchel handbags");
				System.out.println("		ii.  Hobo handbags");
				System.out.println("");
				break;
			case 'd':
			case 'D':
				System.out.println("	Your body type is Hourglass Body Type.");
				System.out.println("	Suggestion Handbags:");
				System.out.println("		i.   Tote handbags");
				System.out.println("		ii.  Satchel handbags");
				System.out.println("		iii. Hobo handbags");
				System.out.println("		iv.  Crossbody handbags");
				System.out.println("		v.   Shoulder handbags");
				System.out.println("");
				break;
			case 'e':
			case 'E':
				System.out.println("	Your body type is Apple Body Type.");
				System.out.println("	Suggestion Handbags:");
				System.out.println("		i.   Tote handbags");
				System.out.println("");
				break;
			default:
				System.out.println("Invalid Input for Body Type !!!");
				System.out.println("");
			}
			
		}else {
			System.out.println("Loading...");
			System.out.println("You will be redirect to the customize section.");
			System.out.println("");
		}
		
	}

	public static void mainProgram(String program) {
		
		Scanner sc = new Scanner(System.in);
        
		String b1 = null,b2= null,b3= null,b4= null,b5= null,b6= null;
		
		double brand = 0;
        double type_of_handbag = 0;
        double material_price = 0;
        double accessories_price = 0;
        double color_price = 0;
        double size_price = 0;
        
		// Customization part
		System.out.println("Before start personalization feature of the handbags, Please choose the brand and type of the handbag you prefer:");
 		System.out.println("Brand:");
 		System.out.println("	a. Gucci");
 		System.out.println("	b. Coach");
 		System.out.println("	c. Louis Vuitton");
 		System.out.println("	d. Kate Spade");
 		System.out.println("	e. Guess");
 		System.out.println("	f. Bonia");
 		System.out.println("	g. Fossil");
 		System.out.println();
 		System.out.println("Please select the brand of the handbag: ");
 		char f = sc.next().charAt(0);
 		
 		switch (f){
 		case'a':
 			b1 = "Gucci";
 			brand = 0;
 			break;
 		case'b':
 			b1 = "Coach";
 			brand = 0;
 			break;
 		case'c':
 			b1 = "Louis Vuitton";
 			brand = 0;
 			break;
 		case'd':
 			b1 = "Kate Spade";
 			brand = 0;
 			break;
 		case'e':
 			b1 = "Guess";
 			brand = 0;
 			break;
 		case'f':
 			b1 = "Bonia";
 			brand = 0;
 			break;
 		case'g':
 			b1 = "Fossil";
 			brand = 0;
 			break;
 		default:
 			System.out.println("Invalid Input for Brand !!!");
 		}
 		
 		System.out.println("Types of handbag:");
 		System.out.println("   1.  Clutch        ||"+ " RM150");
 		System.out.println("   2.  Hobo          ||"+ " RM210");
 		System.out.println("   3.  Satchel       ||"+ " RM175");
 		System.out.println("   4.  Shopper       ||"+ " RM100");
 		System.out.println("   5.  Travel        ||"+ " RM250");
 		System.out.println("   6.  Cross-body    ||"+ " RM130");
 		System.out.println("   7.  Sports        ||"+ " RM90");
 		System.out.println("   8.  Beach         ||"+ " RM60");
 		System.out.println("   9.  Messenger Bag ||"+ " RM90");
 		System.out.println();
 		System.out.println("Please select the type of the handbag: ");
 		char k = sc.next().charAt(0);
 		
 		switch (k){
 		case'1':
 			b2 = "Clutch";
 			type_of_handbag = 150;
 			break;
 		case'2':
 			b2 = "Hobo";
 			type_of_handbag = 210;
 			break;
 		case'3':
 			b2 = "Satchel";
 			type_of_handbag = 175;
 			break;
 		case'4':
 			b2 = "Shopper";
 			type_of_handbag = 100;
 			break;
 		case'5':
 			b2 = "Travel";
 			type_of_handbag = 250;
 			break;
 		case'6':
 			b2 = "Cross-body";
 			type_of_handbag = 130;
 			break;
 		case'7':
 			b2 = "Sports";
 			type_of_handbag = 90;
 			break;
 		case'8':
 			b2 = "Beach";
 			type_of_handbag = 60;
 			break;
 		case'9':
 			b2 = "Messenger Bag";
 			type_of_handbag = 90;
 			break;
 		default:
 			System.out.println("Invalid Input for Brand !!!");
 		}
		
		System.out.println();
		System.out.println("============Personalization Section============");
		System.out.println();
		String[][] columnNames = {{"Material	","Price(RM)"},
									{"-----------------------------------"},
									{"a. Leather	","RM90"},
									{"b. Vegan Leather","RM25"},
									{"c. Cotton Canvas","RM55"},
									{"d. Nylon	","RM30"},
									{"e. Cordura	","RM35"},
									{"f. Denim	","RM70"}};
	
		System.out.println(Arrays.deepToString(columnNames)
				.replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
		
		System.out.println();
		System.out.println("Please select the material of the handbags:");
		char g = sc.next().charAt(0);
		System.out.println();
		
		switch(g) {
		case'a':
			b3 = "Leather";
			material_price = 90;
			break;
		case'b':
			b3 = "Vegan Leather";
			material_price = 25;
			break;
		case'c':
			b3 = "Cotton Canvas";
			material_price = 55;
			break;
		case'd':
			b3 = "Nylon";
			material_price = 30;
			break;
		case'e':
			b3 = "Cordura";
			material_price = 35;
			break;
		case'f':
			b3 = "Denim";
			material_price = 70;
			break;
		default:
			System.out.println("Invalid input for material !!!");
		}
		
		System.out.println("=====Accessories Add-on(Handbag Compartment)=====");
		System.out.println();
		String[][] compartment = {{"Items			","Price (RM)"},
									{"--------------------------------------------"},
									{"a. Adding compartment(each)","RM15"},
									{"b. Adding handle	","RM7"},
									{"c. Adding zipper	","RM5"},
									{"d. Adding inner pocket","RM12"},
									{"e. Adding clip/ key ring","RM2.50"}};
		
		System.out.println(Arrays.deepToString(compartment)
				.replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
		
		
		System.out.println();
		System.out.println("Please select your accessories add-on: ");
		char p = sc.next().charAt(0);
		
		System.out.println("Please enter the quantity: ");
		int count = sc.nextInt();
		System.out.println();
		
		switch(p){
		case'a':
			b4 = "Compartment";
			accessories_price = 15*count;
			break;
		case'b':
			b4 = "Handle";
			accessories_price = 7*count;
			break;
		case'c':
			b4 = "Zipper";
			accessories_price = 5*count;
			break;
		case'd':
			b4 = "Inner Pocket";
			accessories_price = 12*count;
			break;
		case'e':
			b4 = "clip/ key ring";
			accessories_price = 2.5*count;
			break;
		default:
			System.out.println("Invalid Input for accessories !!!");
		}
		
		
		System.out.println("=================Color Selection==================");
		System.out.println();
		String[][] color = {{"Color			","Price (RM)"},
							{"--------------------------------------------------"},
							{"a. Black		","Free of Charge"},
							{"b. White		","Free of Charge"},
							{"c. Charcoal		","Free of Charge"},
							{"d. Beige		","Free of Charge"},
							{"e. Red		","Free of Charge"},
							{"f. Yellow		","Free of Charge"},
							{"g. Premium Multi-color","RM25"},
							{"h. Premium Pearl color","RM14"},
							{"i. Premium Black Gold	","RM20"}};
		
		System.out.println(Arrays.deepToString(color)
				.replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
		
		System.out.println();
		System.out.println("Please select your color: ");
		char u = sc.next().charAt(0);
		System.out.println();
		
		switch (u) {
		case'a':
			b5 = "Black";
			color_price = 0;
			break;
		case'b':
			b5 = "White";
			color_price = 0;
			break;
		case'c':
			b5 = "Charcoal";
			color_price = 0;
			break;
		case'd':
			b5 = "Beige";
			color_price = 0;
			break;
		case'e':
			b5 = "Red";
			color_price = 0;
			break;
		case'f':
			b5 = "Yellow";
			color_price = 0;
			break;
		case'g':
			b5 = "Premium Multi-color";
			color_price = 25;
			break;
		case'h':
			b5 = "Premium Pearl color";
			color_price = 14;
			break;
		case'i':
			b5 = "Premium Black Gold";
			color_price = 20;
			break;
		default:
			System.out.println("");
		}
		
		System.out.println("===================Size Selection==================");
		System.out.println();
		System.out.println("	1. Extra Large |" + "  RM 25");
		System.out.println("	2. Large       |" + "  RM 15");
		System.out.println("	3. Medium      |" + "  RM 10");
		System.out.println("	4. Small       |" + "  RM 10");
		
		System.out.println();
		System.out.println("Please select your size for handbag: ");
		char t = sc.next().charAt(0);
		System.out.println();
		
		switch(t) {
		case'1':
			b6 = "Extra Large";
			size_price = 25;
			break;
		case'2':
			b6 = "Large";
			size_price = 15;
			break;
		case'3':
			b6 = "Medium";
			size_price = 10;
			break;
		case'4':
			b6 = "Small";
			size_price = 10;
			break;
		default:
			System.out.println("Invalid input for size selection !!!");
		}
		
		System.out.println("===================================================================");
		System.out.println("                          Membership                               ");
		System.out.println("===================================================================");
		System.out.println("**10% offer and free premium gift will be available for membership");
		System.out.println("  Free Shipping will also be available for membership");
		System.out.println("  Zero interest for installment payment");
		System.out.println();
		System.out.println("Do you have a membership?");
		boolean member = sc.nextBoolean();
		System.out.println();
		
		if (member==true) {
			System.out.println("Please enter your member id: ");
			int id = sc.nextInt();
			System.out.println("");
			System.out.println("You can now enjoy the membership privilege.");
			System.out.println("	i.   10% offer & Free Premium Gift");
			System.out.println("	ii.  Free Shipping");
			System.out.println("	iii. Zero interest for installment payment");
			System.out.println("");	
		}else {
			System.out.println("Do you want to apply membership ? (Y/N)");
			char apply = sc.next().charAt(0);
			if ((apply=='y')||(apply=='Y')) {
				System.out.println("The application for membership will cost RM100 annually.");
				System.out.println("Loading...");
				System.out.println("Redirect to the payment sites");
			}else {
				System.out.println("Loading...");
				System.out.println("Redirect to the payment sites");
			}
		}
		System.out.println("===================================================================");
		System.out.println("                         Confirm Order                             ");
		System.out.println("===================================================================");
		System.out.println();
		System.out.println("The brand of the bag you choose is   : "+b1);
		System.out.println("The type of handbag you choose is    : "+b2);
		System.out.println("The material you choose is           : "+b3);
		System.out.println("The accessoreis add-on you choose is : "+b4);
		System.out.println("The color you choose is              : "+b5);
		System.out.println("The size of handbag you choose is    : "+b6);
		System.out.println("");
		
		System.out.println("Confirm you order and proceed to payment ? (Y/N)");
		char confirm = sc.next().charAt(0);
		
		if((confirm =='n')||(confirm =='N')) {
			System.exit(0);
		}
		
		double shipping = 15;
		double discount_price= 0;
		double total_before_discount = brand + type_of_handbag + material_price + accessories_price 
				+ color_price + size_price;
		
		//Calculation
		if(member==true) {
			shipping=0;
			discount_price= total_before_discount*10/100;
			
		}
		double total_before_discount_1 = brand + type_of_handbag + material_price + accessories_price 
				+ color_price + size_price +shipping;
		
		double total_after_discount = total_before_discount_1 - discount_price;
		
		System.out.println("===================================================================");
		System.out.println("                         Payment                                   ");
		System.out.println("===================================================================");
		System.out.println();
		System.out.printf("The price of the handbag      =  RM "+"%.2f",type_of_handbag);
		System.out.println();
		System.out.printf("The price of the material     =  RM "+"%.2f",material_price);
		System.out.println();
		System.out.printf("The price of the accessories  =  RM "+"%.2f",accessories_price);
		System.out.println();
		System.out.printf("The price of the color chosen =  RM "+"%.2f",color_price);
		System.out.println();
		System.out.printf("The price of the size chosen  =  RM "+"%.2f",size_price);
		System.out.println();
		System.out.printf("Shipping fees                 =  RM "+"%.2f",shipping);
		System.out.println();
		System.out.printf("Total price before discount   =  RM "+"%.2f",total_before_discount_1);
		System.out.println();
		System.out.printf("Membership Offer              = -RM "+"%.2f",discount_price);
		System.out.println();
		System.out.printf("______________________________________________________");
		System.out.println();
		System.out.printf("Total price after discount    =  RM " +"%.2f",total_after_discount);
		System.out.println();
		System.out.println();
		
		double amount;
		do {
			System.out.println("Please enter the amount paid  =  RM ");
			amount = sc.nextDouble();
			if(amount<total_after_discount) {
				System.out.println("Payment declined, Insufficient fund");
				System.out.println("Please Re-enter the amount paid.");
				System.out.println();
			}else {
			System.out.printf("Total amount paid             =  RM "+ "%.2f",amount);
			System.out.println();
			}
		}while(amount<total_after_discount);
		
		double change = amount -total_after_discount;
		System.out.printf("Change                        =  RM " +"%.2f",change);
		System.out.println();
		System.out.println();
		System.out.println("Thank you very much! Please enjoy your day!");
	}
	
	public static void paymentReceipt(String receipt) {
		
		System.out.println();
		System.out.println("Voucher: ");
		System.out.println();
		System.out.println("  ____________________________________________________________________");
		System.out.println("||====================================================================||");
		System.out.println("||## ZALORA MALAYSIA: Online Platform for Customize Handbags Service  ||");
		System.out.println("||--------------------------------------------------------------------||");
		System.out.println("||                                                                    ||");
		System.out.println("||   Limited Voucher:  Second purchase items can enjoy 50% off !!!    ||");
		System.out.println("||                                                                    ||");
		System.out.println("||***Term & condition apply                        Valid Date: 1 year ||");
		System.out.println("||====================================================================||");
		System.out.println("||____________________________________________________________________||");
		
	}

}
