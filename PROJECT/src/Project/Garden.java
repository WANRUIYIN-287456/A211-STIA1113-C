package Project;
import java.util.Scanner;
public class Garden {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			personalbackground();
			productprovide();
			afterservice();
		}
			
			
			
			public static void personalbackground() {
				
			for (int z=0; z<80;z++) {
				System.out.print("*");
			}
			System.out.println("\n\n WELCOME TO PERDANA BOTANICAL GARDEN\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("*");
			}
			Scanner sc=new Scanner(System.in);
			String[] details= {"name","age","email","phone"};
			System.out.println("\n\nPlease enter you name: ");
			details[0]=sc.nextLine();
			System.out.println("\nPlease enter your age: ");
			details[1]=sc.nextLine();
			System.out.println("\nPlease enter your email: ");
			details[2]=sc.nextLine();
			System.out.println("\nPlease enter your phone number:  ");
			details[3]=sc.nextLine();
			System.out.println();
			for (int z=0; z<80;z++) {
				System.out.print("*");
				}
			System.out.println("\nPLEASE CHECK YOUR DETAILS");
			for (int z=0; z<80;z++) {
				System.out.print("*");
				}
			System.out.println();
			for (int q=0;q<details.length;q++)
			System.out.println(details[q]);
			for (int z=0; z<80;z++) {
				System.out.print("*");
				}

			System.out.println("\n\nAre you a member of Perdana Botanical Garden?");
			boolean member = sc.nextBoolean();
			System.out.println();
			if (member==true) {
				for (int i=0; i<80;i++) {
					System.out.print("*");
				}
			System.out.println("\n\n Attention to all members, please check your validation date for membership.  \n Membership renewal notices will be sent by email only and payment"
					+ " is due by  \n 31 December. Unpaid members as of 1 January will lose membership privileges  \n until"
					+ " their dues are paid. Thankyou.                                        "
					+ "\n We will send notification to " + details[2]+ " and deliver message    \n at " 
					+ details[3] + "\n");
			for (int i=0; i<80;i++) {
				System.out.print("*");
			}
			}
			}
			public static void productprovide() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n\n3 different citizens and price for each: ");
			String[][] ticket= {{"Children","Adult","Senior"},
								{"25","30","45"}};
			int g,h,i;
			System.out.println(ticket[0][0]+"       :RM"+ticket[1][0]);
			System.out.println(ticket[0][1]+"          :RM"+ticket[1][1]);
			System.out.println(ticket[0][2]+"         :RM"+ticket[1][2]);
			
			g=Integer.parseInt(ticket[1][0]); //change string array to integer
			h=Integer.parseInt(ticket[1][1]);
			i=Integer.parseInt(ticket[1][2]);

		    System.out.println("\n**TICKET RESERVATION**");
			
			System.out.println("\nNumber of children: ");
			int a = sc.nextInt();
			
			System.out.println("\nNumber of adult: ");
			int b = sc.nextInt();
			
			System.out.println("\nNumber of senior: ");
			int c = sc.nextInt();
			int no = a + b + c;		
			
			System.out.println("We will display the packages that available for " + no + " people which are " +  a + " tickets for children, " + b + 
					" for adult and " + c + " for senior citizen");
			
			System.out.println("\nTo see all the packages that available, please enter 1");
			int in = sc.nextInt();
			
			while(in!=1) {
				System.out.println("Please try again!");
				in = sc.nextInt();
			}
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.print("\n\nPACKAGE A: " + "\n1. Time given: 2 hours" + "\n2. Free parking ticket" + 
			"\n3. Unlimited Wi-Fi access\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.print("\n\nPACKAGE B: " + "\n1. Time given: 3 hours" + "\n2. Free parking ticket" + 
			"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.print("\n\nPACKAGE C: " + "\n1. Time given: 4 hours" + "\n2. Free parking ticket" + 
			"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" + "\n5. Free exclusive Perdana "
			+ "botanical Garden's shirt and cap per person\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.print("\n\nPACKAGE D: " + "\n1. Time given: 5 to 7 hours" + "\n2. Free parking ticket" + 
			"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" +
			"\n5. Free exclusive Perdana Botanical Garden's shirt and cap per person" + 
			"\n6. Free golden vouchers exclusive from Perdana Botanical Garden" + "\n7. Garden tour guide provided\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.print("\n\nPACKAGE E: " + "\n1. Time given: 24 hours" + "\n2. Free parking ticket" + 
			"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" +
			"\n5. Free exclusive Perdana Botanical Garden's shirt and cap per person" + 
			"\n6. Free golden vouchers exclusive from Perdana Botanical Garden" + "\n7. Garden tour guide provided" + 
			"\n8. Free access and unlimited time to all fun activities and games :" + "\n   -golf" + "\n   -horse riding" + 
			"\n   -mini zoo" + "\n   -flower garden\n\n");
			for (int z=0; z<80;z++) {
				System.out.print("=");
			}
			System.out.println();
			System.out.println("\nFor the price, please enter 1 ");
			int t = sc.nextInt();
			while(t!=1) { 
				System.out.println("Sorry, wrong code. Please try again");
			    t = sc.nextInt();
			}
			if(t==1) {
			    double x = ((a*g) + (b*h) + (c*i));
			    double y = x+30;
			    double z = y+50;
			    double xy = z+100;
			    double ab = xy+200;
			    System.out.println(" ________________________________________________________________");
			    System.out.println("| PACKAGES     |" + " FOR MEMBERS            |" + " FOR NON-MEMBERS        |");
			    System.out.println(" ----------------------------------------------------------------");
			    System.out.println("|1.PACKAGE A   |   " + (x*0.8) + "                 |" + x + "                   |");
			    System.out.println("|2.PACKAGE B   |   " + (y*0.8) + "                |" + y + "                   |");
			    System.out.println("|3.PACKAGE C   |   " + (z*0.8) + "                |" + z + "                   |");
			    System.out.println("|4.PACKAGE D   |   " + (xy*0.8) + "                |" + xy + "                   |");
			    System.out.println("|5.PACKAGE E   |   " + (ab*0.8) + "                |" + ab + "                   |");
			    System.out.println(" ----------------------------------------------------------------");
			
			    for (int aq=0; aq<80;aq++) {
					System.out.print("<");
				}
			System.out.println("\n1. -A- PACKAGE A" + "\n2. -B- PACKAGE B" + "\n3. -C- PACKAGE C" + "\n4. -D- PACKAGE D" + "\n5. -E- PACKAGE E" );
			for (int lm=0; lm<80;lm++) {
				System.out.print(">");
			}
			
			System.out.println("\nDear ,\nplease enter any of package above to proceed");
			char p = sc.next().charAt(0);
			
			while(p!='A' && p!='B' && p!='C' && p!='D' && p!='E') {
				System.out.println("Sorry there's no package " + p);
				System.out.print("Please try again: " );
				p = sc.next().charAt(0);
			}
			
			if(p=='A') {
				System.out.print("\n========================================================================================");
				System.out.print("\nPACKAGE A: " + "\n1. Time given: 2 hours" + "\n2. Free parking ticket" + 
				"\n3. Unlimited Wi-Fi access");
				double pricea = ((a*g) + (b*h) + (c*i));
				double priceab = (pricea*0.8);
				System.out.println("\n________________________________________________________________________________________");
				System.out.println("\nNormal price: " + "RM " + pricea + "\nWith member card price(20% off): " + "RM " + priceab);
				System.out.println("________________________________________________________________________________________");
				System.out.println("========================================================================================");
			}
			
			else if(p=='B') {
				System.out.print("\n========================================================================================");
				System.out.print("\nPACKAGE B: " + "\n1. Time given: 3 hours" + "\n2. Free parking ticket" + 
				"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks");
				double pricea = ((a*g) + (b*h) + (c*i));
				double priceac = pricea+30;
				double pricead = priceac*0.8;
				System.out.println("\n________________________________________________________________________________________");
				System.out.println("\nNormal price: " + "RM " + priceac + "\nWith member card price(20% off): " + "RM " + pricead);
				System.out.println("________________________________________________________________________________________");
				System.out.println("========================================================================================");
			}
			
			else if(p=='C') {
				System.out.print("\n========================================================================================");
				System.out.print("\nPACKAGE C: " + "\n1. Time given: 4 hours" + "\n2. Free parking ticket" + 
				"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" + "\n5. Free exclusive Perdana "
				+ "botanical Garden's shirt and cap per person");
				double pricea = ((a*g) + (b*h) + (c*i));
				double priceac = pricea+30;
				double priceae = priceac+50;
				double priceaf = priceae*0.8;
				System.out.println("\n________________________________________________________________________________________");
				System.out.println("\nNormal price: " + "RM " + priceae + "\nWith member card price(20% off): " + "RM " + priceaf);
				System.out.println("________________________________________________________________________________________");
				System.out.println("========================================================================================");
			}
			
			else if(p=='D') {
				
				System.out.print("\n========================================================================================");
				System.out.print("\nPACKAGE D: " + "\n1. Time given: 5 to 7 hours" + "\n2. Free parking ticket" + 
				"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" +
				"\n5. Free exclusive Perdana Botanical Garden's shirt and cap per person" + 
				"\n6. Free golden vouchers exclusive from Perdana Botanical Garden" + "\n7. Garden tour guide provided");
				double pricea = ((a*g) + (b*h) + (c*i));
				double priceac = pricea+30;
				double priceae = priceac+50;
				double priceag = priceae+100;
				double priceah = priceag*0.8;
				System.out.println("\n________________________________________________________________________________________");
				System.out.println("\nNormal price: " + "RM " + priceag + "\nWith member card price(20% off): " + "RM " + priceah);
				System.out.println("________________________________________________________________________________________");
				System.out.println("========================================================================================");
			}
			
			else if(p=='E') {
				
				System.out.print("\n========================================================================================");
				System.out.print("\nPACKAGE E: " + "\n1. Time given: 24 hours" + "\n2. Free parking ticket" + 
				"\n3. Unlimited Wi-Fi access" + "\n4. Free food and drinks" +
				"\n5. Free exclusive Perdana Botanical Garden's shirt and cap per person" + 
				"\n6. Free golden vouchers exclusive from Perdana Botanical Garden" + "\n7. Garden tour guide provided" + 
				"\n8. Free access and unlimited time to all fun activities and games :" + "\n   -golf" + "\n   -horse riding" + 
				"\n   -mini zoo" + "\n   -flower garden");
				double pricea = ((a*g) + (b*h) + (c*i));
				double priceac = pricea+30;
				double priceae = priceac+50;
				double priceag = priceae+100;
				double priceai = priceag+200;
				double priceaj = priceai*0.8;
				System.out.println("\n________________________________________________________________________________________");
				System.out.println("\nNormal price: " + "RM " + priceai + "\nWith member card price(20% off): " + "RM " + priceaj);
				System.out.println("________________________________________________________________________________________");
				System.out.println("========================================================================================");
			}
			}	
			}
			
			public static void afterservice() {
				Scanner sc=new Scanner(System.in);
			System.out.println("\nIf interested, please enter 1 (yes) and if you want to cancel "
					+ "please enter 2 ");
			int j = sc.nextInt();
			while(j!=1 && j!=2) {
				System.out.println("Wrong code! Try again!");
				j = sc.nextInt();
			}
			
			switch(j) {
			case 1:
				System.out.println("Thankyou ! You can proceed with payment");
				System.out.println("\nPAYMENT METHOD: \n1.ONLINE BANKING \n2.BANK IN \n3.CASH PAYMENT AT CONVENIENCE STORES");
				System.out.println("\nPLEASE CHOOSE ");
				int rp = sc.nextInt();
				while(rp!=1 && rp!=2 && rp!=3) {
					System.out.println("INVALID! TRY AGAIN!");
					rp = sc.nextInt();
				}
				if(rp==1) {
					System.out.println("[1]Maybank2u \n[2]CIMB Clicks \n[3]Public Bank \n[4]RHB Now \n[5]Ambank"
							+ "\n[6]MyBSN \n[7]UOB \n[8]Affin Bank \n[9]Bank Islam \n[10]HSBC Online \n[11]Standard Chartered Bank");
					System.out.println("\nPLEASE CHOOSE YOUR BANK TYPE");
					int nr = sc.nextInt();
					while(nr!=1 && nr!=2 && nr!=3 && nr!=4 && nr!=5 && nr!=6 && nr!=7 && nr!=8 && nr!=9 && nr!= 10 && nr!=11) {
						System.out.println("INVALID! TRY AGAIN!");
						nr = sc.nextInt();
					}
					System.out.println("You are now redirecting to the online banking log in page.....");
					for (int s=2;s>=0;s--) {
						System.out.println("\nEnter your account password: ");
						int d = sc.nextInt();
						System.out.println("Password confirmation: ");
						int pass = sc.nextInt();
						if(d==pass) {
						  System.out.println("Your password is correct and your money have been deducted. Thannkyou for the payment! ");
						  System.out.println();
						  break;
						}
						else {
							System.out.print("Your password is incorrect! You have " + s + " chance. ");
						    System.out.println();
						}
						if(s==0) {
							System.out.print("Sorry, unsuccessful to login! For security, you are unable to continue the login!");	
							break;
						}
					}
				}
				else if(rp==2) {
					System.out.println("Please bank in to our account: 02 0110 1310 8452 (BANK ISLAM)(PERDANA BOTANICAL GARDEN) \n before 12 pm tomorrow. THANKYOU!");
				}
				else if(rp==3) {
					System.out.println("[A] Cash Payment at 7-Eleven \n[B] Cash Payment at KK Mart");
					System.out.println("\nPlease enter ");
					char jj = sc.next().charAt(0);
					while(jj!='A' && jj!='B') {
						System.out.println("INVALID! TRY AGAIN!");
						jj = sc.next().charAt(0);
					}
					System.out.println("Thankyou! We have notified by your booking! Please pay before tomorrow at 12 pm. Thankyou! ");
					}
				int i=0;
					do {
						System.out.print("*");
						i++;
					} while (i<=80);
				System.out.print("\nAre you satisfied with our service (Press Y for yes / N for No): ");
				char service=sc.next().charAt(0);
				System.out.println();
				if (service=='Y' || service=='y') {
					int a=0;
					while (a<6) {
						System.out.print("~Thankyou ! (^_^)~ ");
						a++;
					 } System.out.println();
					System.out.println("We hope to serve you again next time!");		
				} else
				if (service=='n' || service=='N') {
					int a=0;
					while (a<5) {
						System.out.print("Sorry ! (>_<) ");
						a++;
					 } System.out.println();
					System.out.println("Kindly leave you comment for any issues: ");
					String comment=sc.next();
					System.out.println("Thankyou! We will try to improve this problem " + "(" + comment + ")" + " next time!");
				} else
				while (service!='Y' && service!='N') {
					System.out.println("Wrong code ");
					System.out.println("Kindly leave you comment for any issues: ");
					String comment=sc.next();
					System.out.println("Thankyou! We will try to improve this problem " + "(" + comment + ")" + " next time!");
				}
				break;
			case 2:
				System.out.println("Thankyou for visiting! Hope to see you real soon!");
				break;
				}
		}

}
