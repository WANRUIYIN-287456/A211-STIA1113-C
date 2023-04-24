package Project;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Arrays;
public class Clothes {

				public int max(int [] array) {
				      int max = 0;

				      for(int i=0; i<array.length; i++ ) {
				         if(array[i]>max) {
				            max = array[i];
				         }
				      }
				      return max;
				   }

				   public int min(int [] array) {
				      int min = array[0];
				   
				      for(int i = 0; i<array.length; i++ ) {
				         if(array[i]<min) {
				            min = array[i];
				         }
				      }
				      return min;
				   }
				  
				   public static void main(String args[]) {
					    Scanner sc = new Scanner(System.in);
					    String name;
						String gender;
						String advisory;

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
						System.out.println("Please select our system advisory before you purchase any of the clothes package. enter 'y' to continue with our shop advisory system.");
						advisory = sc.nextLine();
						
				      System.out.println("Welcome Dear customer, Thank you very much for choosing our shop!");
				      System.out.println("Dear customer, we will recommend the most suitable clothes package for you!");
				      System.out.println("We want to thank you for trusting our shop advisory.");
				      System.out.println();
				      System.out.println("Now, let's find the ideal item for you.");

						System.out.println("===Clothes package===");
						System.out.println("   1.  Package A   (Casual Clothes)|");
						System.out.println("   Consists of: Tee           |"+ " RM 450");
						System.out.println("                Pants         |"+ " RM 950");
						System.out.println("                Sweater       |"+ " RM 1000");
						System.out.println("   Total original price           = RM 2400");
						
						System.out.println("   2.  Package B   (Comfy Clothes)|");
						System.out.println("   Consists of: Shorts        |"+ " RM 580");
						System.out.println("                Blouse        |"+ " RM 1450");
						System.out.println("                Hoodies       |"+ " RM 680");
						System.out.println("   Total original price           = RM 2710");
						
						System.out.println("   3.  Package C   (Formal Clothes For Women)|");
						System.out.println("   Consists of: Skirt         |"+ " RM 650");
						System.out.println("                Dress         |"+ " RM 3500");
						System.out.println("                Jacket        |"+ " RM 840");
						System.out.println("   Total original price           = RM 4990");
						
						System.out.println("   4.  Package D   (Formal Clothes For Men)|");
						System.out.println("   Consists of: Polo shirt    |"+ " RM 550");
						System.out.println("                Suit jacket   |"+ " RM 2000");
						System.out.println("                Coat          |"+ " RM 3800");
						System.out.println("   Total original price           = RM 6350");
						System.out.println();
				      System.out.println("Enter the number of clothes package price that are going to be compared:");
				      int size = sc.nextInt();
				      int[] myArray = new int[size];
				      System.out.println("Enter the price for each of the clothes package:");

				      for(int i=0; i<size; i++) {
				         myArray[i] = sc.nextInt();
				      }
				      Clothes m = new Clothes();
				      System.out.println("The most expensive clothes package price : " + m.max(myArray));
				      System.out.println("The most economic clothes package price : " + m.min(myArray));
				      System.out.println("Customer you're advised to choose according to your own capability!");
				      System.out.println("**************************************************************");
				      System.out.println("Choose Package A! If you're looking for some casual clothes.");
				      System.out.println("Choose Package B! If you're looking for some comfy clothes.");
				      System.out.println("Choose the Package C! If you are a female customer and ready for some formal places.");
				      System.out.println("Choose the Package D! If you are a male customer and ready for some formal places.");
				      System.out.println("**************************************************************");
				      System.out.println("Once again thank you for choosing our shop advisory!");
				      System.out.println("We hope that it will help you and see you next time!");
				      System.out.println();
				      System.out.println("**************************************************************");
				 
						String choice;
						String size1;
						String member;
						String id;
						String renew;
						String duration;
						String clothes1;
						String clothes2;
						String size2;
						double Membership_fee= 20;
						double oriPrice;
						double oriPrice2;

				System.out.println("===Clothes package===");
				System.out.println("   1.  Package A   |");
				System.out.println("   Consists of: Tee           |"+ " RM 450");
				System.out.println("                Pants         |"+ " RM 950");
				System.out.println("                Sweater       |"+ " RM 1000");
				System.out.println("   Total original price           = RM 2400");
				
				System.out.println("   2.  Package B   |");
				System.out.println("   Consists of: Shorts        |"+ " RM 580");
				System.out.println("                Blouse        |"+ " RM 1450");
				System.out.println("                Hoodies       |"+ " RM 680");
				System.out.println("   Total original price           = RM 2710");
				
				System.out.println("   3.  Package C   |");
				System.out.println("   Consists of: Skirt         |"+ " RM 650");
				System.out.println("                Dress         |"+ " RM 3500");
				System.out.println("                Jacket        |"+ " RM 840");
				System.out.println("   Total original price           = RM 4990");
				
				System.out.println("   4.  Package D   |");
				System.out.println("   Consists of: Polo shirt    |"+ " RM 550");
				System.out.println("                Suit jacket   |"+ " RM 2000");
				System.out.println("                Coat          |"+ " RM 3800");
				System.out.println("   Total original price           = RM 6350");
				System.out.println();
				System.out.println("Please select the clothes package: ");
				clothes1 = sc.nextLine();
			
				System.out.println();
				System.out.println("===Size Selection===");
				System.out.println();
				System.out.println(" Extra Large ");
				System.out.println(" Large ");
				System.out.println(" Medium ");
				System.out.println(" Small  ");
				System.out.println(" Extra Small  ");
				System.out.println();
				System.out.println("Please select your size for clothes: ");
				size1 = sc.nextLine();
				System.out.println();
				
				System.out.println("Do you want to add-on any other packages? ");
				System.out.println("===Clothes package===");
				System.out.println("   1.  Package A   |");
				System.out.println("   Consists of: Tee           |"+ " RM 450");
				System.out.println("                Pants         |"+ " RM 950");
				System.out.println("                Sweater       |"+ " RM 1000");
				System.out.println("   Total original price           = RM 2400");
				
				System.out.println("   2.  Package B   |");
				System.out.println("   Consists of: Shorts        |"+ " RM 580");
				System.out.println("                Blouse        |"+ " RM 1450");
				System.out.println("                Hoodies       |"+ " RM 680");
				System.out.println("   Total original price           = RM 2710");
				
				System.out.println("   3.  Package C   |");
				System.out.println("   Consists of: Skirt         |"+ " RM 650");
				System.out.println("                Dress         |"+ " RM 3500");
				System.out.println("                Jacket        |"+ " RM 840");
				System.out.println("   Total original price           = RM 4990");
				
				System.out.println("   4.  Package D   |");
				System.out.println("   Consists of: Polo shirt    |"+ " RM 550");
				System.out.println("                Suit jacket   |"+ " RM 2000");
				System.out.println("                Coat          |"+ " RM 3800");
				System.out.println("   Total original price           = RM 6350");
				System.out.println();
				System.out.println("Please select the clothes package: ");
				clothes2 = sc.nextLine();
				
				System.out.println("===Size Selection===");
				System.out.println();
				System.out.println(" Extra Large ");
				System.out.println(" Large ");
				System.out.println(" Medium ");
				System.out.println(" Small  ");
				System.out.println(" Extra Small  ");
				System.out.println();
				System.out.println("Please select your size for clothes: ");
				size2 = sc.nextLine();
				System.out.println();
				
				System.out.println("===Membership===");
				System.out.println("**10% offer will be given for the first item with membership and 25% discount on the second one.");
				System.out.println("**FREE Shipping is available for every membership");
				System.out.println();
				System.out.print("1. Do you have membership? Please enter 'yes' or 'no' ");
				choice = sc.next();
				System.out.println();
				System.out.print("2. Please enter the ID number for the customer with membership and non-membership will need to enter '-' ");
				id = sc.next();
				System.out.println();
				System.out.print("3. Your membership is going to expired. Do you want to renew it? Please enter 'yes' or 'no' ");
				renew = sc.next();
				System.out.println();
				System.out.print("4. Enter number '1' which is RM 20 for another 1 year membership. Would you like to renew it?");
				duration = sc.next();
				System.out.println();
				
				System.out.println("===Order Confirmation===");
				System.out.println();
				System.out.println("The clothes package you choose is: " + clothes2);
				System.out.println();
				System.out.println("The size you choose is: " + size2);
				System.out.println();
				System.out.println("The quantity you needed for each package is: " + "1");
				System.out.println();
				
				System.out.println("Please enter the total price for the first clothes package: ");
				System.out.println("   1.  Package A                   = RM 2400");
				System.out.println("   2.  Package B                   = RM 2710");	
				System.out.println("   3.  Package C                   = RM 4990");	
				System.out.println("   4.  Package D                   = RM 6350 ");
				oriPrice = sc.nextDouble();
				System.out.println("Please enter the total price for the second clothes package: ");
				System.out.println("   1.  Package A                   = RM 2400");
				System.out.println("   2.  Package B                   = RM 2710");	
				System.out.println("   3.  Package C                   = RM 4990");	
				System.out.println("   4.  Package D                   = RM 6350 ");
				oriPrice2 = sc.nextDouble();
					
				System.out.println("===Payment===");
				System.out.println();
				int pay;
				System.out.println("Do you want to pay by cash or by online banking? Please enter '1' for cash and '2' for online banking.");
				pay = sc.nextInt();
				
				double amount;
				double amount_paid =0;
				double shipping =0;
				double total_original_price = oriPrice + oriPrice2 + shipping + Membership_fee;
				double membership_discount= oriPrice * 10/100 + oriPrice2 * 25/100;
				double total_price_after_promotion = total_original_price - membership_discount;
				double change = amount_paid - total_price_after_promotion;
				
				if(pay==2) {
					int password, password1;
					int k;
					System.out.println("Please enter your account username : " + name);
					System.out.println("Please enter your password : ");
					password = sc.nextInt();
					System.out.println("Please re-enter your password : ");
					password1 = sc.nextInt();
					
					
					for (k=3; k>=0; k--) {
						if(k==0) {
							System.out.println("LOGIN FAILED!!! Please pay by other method. ");
							pay = sc.nextInt();
							break;
							}
						
						if (password == password1) { 
							amount = total_price_after_promotion;
							System.out.println("Correct password. ");
							System.out.printf("Total price with membership fee    =  RM "+"%.2f",total_original_price);
							System.out.println();
							System.out.printf("Membership discount                =  RM  "+"%.2f",membership_discount);
							System.out.println();
							System.out.printf("The price with membership discount =  RM "+"%.2f",total_price_after_promotion);
							System.out.println();
							System.out.printf("Total amount paid  =  RM "+ "%.2f",total_price_after_promotion);
							System.out.println();
							System.out.println("The amount is already deducted from your account.");
							System.out.println("Thank you for using MYTHERESA!" );
							System.out.println("Hope you enjoy while using our platform!");
							System.out.println("Please come and visit our platform again!");
							break;
						}
						
						else if(password != password1) {
							System.out.println("Wrong password. ");
							System.out.println("You have 5 more chances. Please re-enter your password.");
							password1 = sc.nextInt();				
						}	
					}
					}
				
				if(pay==1) {
				    System.out.println("**************************************************************");
					System.out.printf("Total price with membership fee    =  RM "+"%.2f",total_original_price);
					System.out.println();
					System.out.printf("Membership discount                =  RM  "+"%.2f",membership_discount);
					System.out.println();
					System.out.printf("The price with membership discount =  RM "+"%.2f",total_price_after_promotion);
					System.out.println();
					System.out.printf("Total amount =  RM "+ "%.2f",total_price_after_promotion);
					System.out.println();
					System.out.println("Please enter the amount you want to pay." );
					amount = sc.nextDouble();
					System.out.printf("Total amount paid  =  RM "+ "%.2f",total_price_after_promotion);
					System.out.println();
					System.out.println("THANK YOU FOR USING MYTHERESA!" );
					System.out.println("Hope you enjoy while using our platform!");
					System.out.println("Please come and visit our platform again!");
				    System.out.println("**************************************************************");
					
					while(amount<total_price_after_promotion) {	
					    System.out.println("**************************************************************");
						System.out.printf("The final price is RM " + "%.2f",total_price_after_promotion);
						System.out.println();
						System.out.println("Please re-enter the amount you want to pay." );
						amount = sc.nextDouble();
						System.out.printf("Total amount paid  =  RM "+ "%.2f",total_price_after_promotion);
						amount_paid = sc.nextDouble();
						System.out.println();
						System.out.println("THANK YOU FOR USING MYTHERESA!" );
						System.out.println("Hope you enjoy while using our platform!");
						System.out.println("Please come and visit our platform again!");
					    System.out.println("**************************************************************");
					}
					
					if(amount==total_price_after_promotion) {
					    System.out.println("**************************************************************");
						System.out.printf("Total price with membership fee    =  RM "+"%.2f",total_original_price);
						System.out.println();
						System.out.printf("Membership discount                =  RM  "+"%.2f",membership_discount);
						System.out.println();
						System.out.printf("The price with membership discount =  RM "+"%.2f",total_price_after_promotion);
						System.out.println();
						System.out.printf("The price you need to pay = RM " + "%.2f",total_price_after_promotion);
						System.out.println();
						System.out.printf("Total amount paid  =  RM "+ "%.2f",total_price_after_promotion);
						System.out.println();
						System.out.println("THANK YOU FOR USING MYTHERESA!" );
						System.out.println("Hope you enjoy while using our platform!");
						System.out.println("Please come and visit our platform again!");
					    System.out.println("**************************************************************");
				    }
					
					else if(amount>total_price_after_promotion) {
						change = amount - total_price_after_promotion;
					    System.out.println("**************************************************************");
						System.out.printf("Total price with membership fee    =  RM "+"%.2f",total_original_price);
						System.out.println();
						System.out.printf("Membership discount                =  RM  "+"%.2f",membership_discount);
						System.out.println();
						System.out.printf("The price with membership discount =  RM "+"%.2f",total_price_after_promotion);
						System.out.println();
						System.out.printf("The price you need to pay = RM " + "%.2f",total_price_after_promotion);
						System.out.println();
						System.out.println("Please enter the amount paid      =  RM ");
						amount_paid = sc.nextDouble();
						System.out.printf("Change =  RM " +"%.2f",change);
						System.out.println("Thank you for using MYTHERESA!" );
						System.out.println("Hope you enjoy while using our platform!");
						System.out.println("Please come and visit our platform again!");
					    System.out.println("**************************************************************");
				
					}
					}
		

	}

}
