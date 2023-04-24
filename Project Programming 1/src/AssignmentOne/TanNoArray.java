package AssignmentOne;
import java.util.Scanner;
public class TanNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("ZALORA MALAYSIA: Online Platform for Customize Handbags Service");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Customer Service Team at 03-92123535 or customer@my.zalora.com");
		System.out.println("");
		System.out.println("Welcome to ZALORA, online platform for Fashion & Lifestyle! ");
		System.out.println("This program provide a customize handbag service.");
		System.out.println();
		
		System.out.println("First, do you wish to obtain suggestion size, weight and type of handbags? (Y/N)");
		char a = sc.next().charAt(0);
		System.out.println("Please answer the following question accordingly.");
		System.out.println("1. Please enter your height in cm: ");
		int b = sc.nextInt();
		System.out.println("2. Please enter your weight in kg: ");
		int c = sc.nextInt();
		System.out.println("3. Please enter your body type: ");
		System.out.println("  i.  Inverted Triangle Body Type");
		System.out.println("  ii. Triangle Body Type");
		System.out.println("  iii.Rectangle Body Type");
		System.out.println("  iv. Hourglass Body Type");
		System.out.println("  v.  Apple Body Type");
		String d = sc.next();
		String e = sc.nextLine();
		
		
		System.out.println();
		System.out.println("Handbag size chart by height and weight:");
		System.out.println();
		System.out.println("Height(cm)   | "+"Recommend Size of Handbag");
		System.out.println("-------------------------------------------");
		System.out.println(">175 cm      | "+"Large or Extra large");
		System.out.println("160 - 175 cm | "+"Medium");
		System.out.println("<160 cm      | "+"Small");

		
		System.out.println();
		System.out.println();
		System.out.println("Weight(kg)   | "+"Recommend Size of Handbag");
		System.out.println("-------------------------------------------");
		System.out.println(">75kg	     | "+"Large or Extra large");
		System.out.println("60 - 75kg    | "+"Medium or Large");
		System.out.println("45 - 60kg    | "+"Medium");
		System.out.println("<45kg	     | "+"Small");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Handbag  suggestion chart by Body Type: ");
		System.out.println();
		System.out.println("Body Type                    | "+"Suggestion Handbag");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Inverted Triangle Body Type  | "+"-crossbody handbags");
		System.out.println("                             | "+"-hobo handbags");
		System.out.println("                             | "+"-shoulder handbags");
		System.out.println("                             | "+"");
		System.out.println("Triangle Body Type           | "+"-satchel handbags");
		System.out.println("                             | "+"");
		System.out.println("Rectangle Body Type          | "+"-satchel handbags");
		System.out.println("                             | "+"-hobo handbags");
		System.out.println("                             | "+"");
		System.out.println("Hourglass Body Type          | "+"-tote handbags");
		System.out.println("                             | "+"-satchel handbags");
		System.out.println("                             | "+"-hobo handbags");
		System.out.println("                             | "+"-crossbody handbags");
		System.out.println("                             | "+"-shoulder handbags");
		System.out.println("                             | "+"");
		System.out.println("Apple Body Type	             | "+"-tote handbags");
		System.out.println();
		
		System.out.println();
		System.out.println("Your height is "+b +"cm.");
		System.out.println("Your weight is "+c +"kg.");
		System.out.println("You body type is "+d +e);
		System.out.println();
		
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
		String f = sc.nextLine();
		
		System.out.println("Types of handbag:");
		System.out.println("   1.  Clutch        |"+ " RM150");
		System.out.println("   2.  Hobo          |"+ " RM210");
		System.out.println("   3.  Satchel       |"+ " RM175");
		System.out.println("   4.  Shopper       |"+ " RM100");
		System.out.println("   5.  Travel        |"+ " RM250");
		System.out.println("   6.  Cross-body    |"+ " RM130");
		System.out.println("   7.  Sports        |"+ " RM90");
		System.out.println("   8.  Beach         |"+ " RM60");
		System.out.println("   9.  Messenger Bag |"+ " RM90");
		System.out.println("   10. Sling Bag     |"+ " RM128");
		System.out.println();
		System.out.println("Please select the type of the handbag: ");
		String k = sc.nextLine();
		
		System.out.println();
		System.out.println("============Personalization Section============");
		System.out.println();
		System.out.println("Material      | "+"Price(RM)");
		System.out.println("-----------------------------");
		System.out.println("Leather       | "+"RM90");
		System.out.println("Vegan Leather | "+"RM25");
		System.out.println("Cotton Canvas | "+"RM55");
		System.out.println("Nylon	      | "+"RM30");
		System.out.println("Cordura       | "+"RM35");
		System.out.println("Denim	      | "+"RM70");

		
		System.out.println();
		System.out.println("Please select the material of the handbags:");
		String g = sc.nextLine();
		System.out.println();
		
		System.out.println("=====Accessories Add-on(Handbag Compartment)=====");
		System.out.println();
		System.out.println("Items                     | "+"Price (RM)");
		System.out.println("--------------------------------------------");
		System.out.println("Adding compartment(each)  | "+"RM15");
		System.out.println("Adding handle             | "+"RM7");
		System.out.println("Adding zipper             | "+"RM5");
		System.out.println("Adding inner pocket       | "+"RM12");
		
		System.out.println();
		System.out.println("Please select your accessories add-on: ");
		String p = sc.nextLine();
		System.out.println("Please enter the quantity: ");
		int count = sc.nextInt();
		System.out.println();
		
		System.out.println("=================Color Selection==================");
		System.out.println("Color                | "+"Price (RM)");
		System.out.println("-----------------------------------------");
		System.out.println("Black                | "+"Free of Charge");
		System.out.println("White                | "+"Free of Charge");
		System.out.println("Charcoal             | "+"Free of Charge");
		System.out.println("Beige                | "+"Free of Charge");
		System.out.println("Red                  | "+"Free of Charge");
		System.out.println("Yellow	             | "+"Free of Charge");
		System.out.println("Premium Multi-color  | "+"RM25");
		System.out.println("Premium Pearl color  | "+"RM14");
		System.out.println("Premium Black Gold   | "+"RM20");
		
		
		System.out.println();
		System.out.println("Please select your color: ");
		String u = sc.next();
		String q = sc.nextLine();
		System.out.println();
		
		System.out.println("===================Size Selection==================");
		System.out.println();
		System.out.println("	1. Extra Large |" + "  RM 25");
		System.out.println("	2. Large       |" + "  RM 15");
		System.out.println("	3. Medium      |" + "  RM 10");
		System.out.println("	4. Small       |" + "  RM 10");
		
		System.out.println();
		System.out.println("Please select your size for handbag: ");
		String t = sc.nextLine();
		System.out.println();
		
		//Calculation
		System.out.println("====================Membership=====================");
		System.out.println("**10% offer and free premium gift will be available for membership");
		System.out.println("**Free Shipping will also be available for membership");
		System.out.println("**Zero interest for installment payment");
		System.out.println();
		System.out.println("Do you have a membership? Please enter your member id:");
		String member = sc.next();
		String id = sc.nextLine();
		System.out.println();
		
		System.out.println("====================Confirm Order===================");
		System.out.println();
		System.out.println("The brand and the type of the bag you choose is: "+ f +k);
		System.out.println("The material you choose is: " +g);
		System.out.println("The accessoreis add-on you choose is: " +p);
		System.out.println("The color you choose is: "+u +q);
		System.out.println("The size of handbag you choose is: " +t);
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		System.out.println("Please enter the price of the handbags you choose: ");
		double handbag_price = sc.nextDouble();
		System.out.println("Please enter the price of the material you choose: ");
		double material_price = sc.nextDouble();
		System.out.println("Please enter the price of the accessories you choose: ");
		double accessories_price = sc.nextDouble();
		System.out.println("Please enter the price of the color you choose: ");
		double color_price = sc.nextDouble();
		System.out.println("Please enter the price of the size you choose: ");
		double size_price = sc.nextDouble();
		
		double shipping = 15;
		double total_accessories_price = accessories_price * count;
		double total_price = handbag_price + material_price 
							+ total_accessories_price + color_price + size_price + shipping;
		double membership = (total_price - shipping) * 10/100;
		double final_price =(total_price - shipping)* 90/100;
		
		System.out.println("======================Payment========================");
		System.out.println();
		System.out.printf("The price of the handbag      =  RM "+"%.2f",handbag_price);
		System.out.println();
		System.out.printf("The price of the material     =  RM "+"%.2f",material_price);
		System.out.println();
		System.out.printf("The price of the accessories  =  RM "+"%.2f",accessories_price);
		System.out.println();
		System.out.printf("The price of the color chosen =  RM "+"%.2f",accessories_price);
		System.out.println();
		System.out.printf("The price of the size chosen  =  RM "+"%.2f",accessories_price);
		System.out.println();
		System.out.printf("Shipping fees                 =  RM "+"%.2f",shipping);
		System.out.println();
		System.out.printf("Total price before discount   =  RM "+"%.2f",total_price);
		System.out.println();
		System.out.printf("Membership Offer              = -RM "+"%.2f",membership);
		System.out.println();
		System.out.println("Free Shipping                 = -RM 15.00");
		System.out.printf("______________________________________________________");
		System.out.println();
		System.out.printf("Total price after discount    =  RM " +"%.2f",final_price);
		System.out.println();
		System.out.println();
		
		System.out.println("Please enter the amount paid  =  RM ");
		double amount = sc.nextInt();
		System.out.printf("Total amount paid             =  RM "+ "%.2f",amount);
		System.out.println();
		
		double change = final_price - amount;
		System.out.printf("Change                        =  RM " +"%.2f",change);
		System.out.println();
		System.out.println();
		System.out.println("Thank you very much! Please enjoy your day!");
	}

}
