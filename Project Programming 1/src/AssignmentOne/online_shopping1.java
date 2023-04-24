package AssignmentOne;
import java.util.Scanner;
public class online_shopping1 {

	public static void main(String[] args) {
	
			String name;
			String gender;
			String choice;
			String size;
			String member;
			String id;
			String renew;
			String duration;
			String clothes;
			double PackageA_price= 2400;
			double PackageB_price= 2710;
			double PackageC_price= 4990;
			double PackageD_price= 6350;
			double Membership_fee= 20;
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("---------------------------------------------------------------");
			System.out.println("MYTHERESA : Online Platform for all luxury items");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Customer Service Team at +49 89 127695-101 or customercare@mytheresa.com");
			System.out.println("");
			System.out.println("Welcome to MYTHERESA, online platform for all luxury items! ");
			System.out.println("This platform only provide new and genuine luxury item.");
			System.out.println();
			
			System.out.println("1. Please enter your full name: ");
			name = sc.nextLine();
			System.out.println("2. Please enter your gender: ");
			gender= sc.nextLine();
			

			System.out.println("===Clothes package===");
			System.out.println("   1.  Package A   |");
			System.out.println("   Consists of: Tee       |"+ " RM 450");
			System.out.println("                Pants    |"+ " RM 950");
			System.out.println("                Sweater    |"+ " RM 1000");
			System.out.println("   Total original price = RM 2400");
			
			System.out.println("   2.  Package B   |");
			System.out.println("   Consists of: Shorts   |"+ " RM 580");
			System.out.println("                Blouse   |"+ " RM 1450");
			System.out.println("                Hoodies       |"+ " RM 680");
			System.out.println("   Total original price = RM 2710");
			
			System.out.println("   3.  Package C   |");
			System.out.println("   Consists of: Skirt       |"+ " RM 650");
			System.out.println("                Dress |"+ " RM 3500");
			System.out.println("                Jacket     |"+ " RM 840");
			System.out.println("   Total original price = RM 4990");
			
			System.out.println("   4.  Package D   |");
			System.out.println("   Consists of: Polo shirt   |"+ " RM 550");
			System.out.println("                Suit jacket    |"+ " RM 2000");
			System.out.println("                Coat    |"+ " RM 3800");
			System.out.println("   Total original price = RM 6350");
			System.out.println();
			System.out.println("Please select the clothes package: ");
			clothes = sc.nextLine();
			
			
			System.out.println("===Size Selection===");
			System.out.println();
			System.out.println(" Extra Large ");
			System.out.println(" Large ");
			System.out.println(" Medium ");
			System.out.println(" Small  ");
			System.out.println(" Extra Small  ");
			System.out.println();
			System.out.println("Please select your size for clothes: ");
			size = sc.nextLine();
			System.out.println();
			
			
			System.out.println("===Membership===");
			System.out.println("**10% offer will be given for the first item with membership, 25% offer will be given for the second item with membership and 45% offer will be given for the third item with membership and 65% offer will be given for the fourth item with membership");
			System.out.println("**FREE Shipping is available for every membership");
			System.out.println();
			System.out.print("1. Do you have membership? Please enter 'yes' or 'no' ");
			choice = sc.nextLine();
			System.out.print("2. Please enter the ID number for the customer with membership and non-membership will need to enter '-' ");
			id = sc.nextLine();
			System.out.print("3. Your membership is going to expired. Do you want to renew it? Please enter 'yes' or 'no' ");
			renew = sc.nextLine();
			System.out.print("4. Enter number '1' which is RM 20 for another 1 year membership. Would you like to renew it?");
			duration = sc.nextLine();
			System.out.println();
			
			System.out.println("===Order Confirmation===");
			System.out.println();
			System.out.println("The clothes package you choose is: "+ "Package A" + "Package B" + "Package C" + "Package D");
			System.out.println("The size you choose is: " + "Large");
			System.out.println("The quantity you needed for each package is: " + "1");
			System.out.println();
			
			System.out.println("===Payment===");
			System.out.println();
			double shipping =0;
			double total_original_price = PackageA_price + PackageB_price + PackageC_price + PackageD_price + shipping + Membership_fee;
			System.out.printf("Total original price =  RM "+"%.2f",total_original_price);
			System.out.println();
			double membership_discount= PackageA_price * 10/100 + PackageB_price * 25/100 + PackageC_price * 45/100 + PackageD_price * 65/100;
			System.out.printf("Membership discount =  RM "+"%.2f",membership_discount);
			System.out.println();
			double total_price_after_promotion = PackageA_price * 90/100 + PackageB_price * 75/100 + PackageC_price * 55/100 + PackageC_price * 35/100;
			System.out.printf("The price with membership discount =  RM "+"%.2f",total_price_after_promotion);
			System.out.println();
			
			System.out.println("Please enter the amount paid =  RM ");
			double amount = sc.nextInt();
			System.out.printf("Total amount paid =  RM "+ "%.2f",amount);
			System.out.println();
			
			double change = amount - total_price_after_promotion;
			System.out.printf("Change =  RM " +"%.2f",change);
			System.out.println();
			System.out.println();
			System.out.println("Thank you very much for using our platform!");
			System.out.println("Please come and visit our platform again!");
			sc.close();
	}

}
