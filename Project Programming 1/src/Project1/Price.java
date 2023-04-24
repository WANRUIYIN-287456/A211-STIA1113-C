package Project1;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
//DISCOUNT		
		Scanner scan = new Scanner (System.in);	
		int member;
		int game;
		double price=0;
		double discount=0;
		double discountRate=0;
		System.out.println("The fees for updating the pogram is RM 150.");
		System.out.println("Since we are having grand opening today, we have some promotion for you.");
		System.out.println("We will have a mini game later on and this will be the discount rate.");
		System.out.println("member: 20%, non-member: 5%, member winning the mini game: 30%, non-member winning the mini game: 8%");
		System.out.println();
		System.out.println("First of all, would you like to be our member?"
				+ " The membership costs RM10 and it is for lifetime. Please enter 1 for yes and 2 for no.");
		member=scan.nextInt();
		System.out.println("Thank you. The mini game starts.");
		System.out.println();
		System.out.println("INSTRUCTION : Miss TS, the TS Watch AI assistant will pick a random number as 'X' from 1-50.");
		System.out.println("You will need to guess 'X' correctly in order to win the game. ");
		System.out.println("For every wrong guess, you will be given a clue about 'X'.");
		System.out.println();
		System.out.println("Are you ready? The game starts now. Please enter 1 to continue.");
		game=scan.nextInt();
		while(game!=1) {
			System.out.println("Are you ready? The game starts now. Please enter 1 to continue.");
			game=scan.nextInt();
		}
		if(member==1) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("              GUESS THE 'X'     ");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		int i;
		
		int number = (int)(Math.random() * 51);
		int guess = 0;
		 
			
			while(number != guess) {
				 for (i=5; i>=1; i--) {
			System.out.println("You have "+i+ " chance(s) from now.     ");
			System.out.println("Please enter a random number from 1-50.     ");
		    guess = scan.nextInt();
		   
		    if(number == guess) {
		      System.out.println("Congratulations! You win the game.");
		      price = 160*0.7;
		      discount = 160*0.3;
		      discountRate = 30.00; 
		    break;
		    }else if( guess > number) {
		    System.out.println("Too high");
		    }else if( guess < number) {
		      System.out.println("Too low");     
		    }
		
		    if(i==1) {
				System.out.println("Oops, you lost. Nevermind, good luck next time.");
				price = 160*0.8;
			    discount = 160*0.2;
			    discountRate =20.00;
			 break;
		    }
			}
		 break;
		 }
		}
			else if(member==2) {
			
			    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("              GUESS THE 'X'     ");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				int j;
			
				int number = (int)(Math.random() * 51);
				int guess = 0;
				
				while(number != guess) {
					for (j=3; j>=1; j--) {
					System.out.println("You have "+j+" chance(s) from now.     ");
					System.out.println("Please enter a random number from 1-50.     ");
				    guess = scan.nextInt();
				
				    if(number == guess) {
				      System.out.println("Congratulations! You win the game.");
				      price = 150*0.92;
					  discount = 150*0.08;
					  discountRate = 8.00;
				    break;
				    }else if( guess > number) {
				    System.out.println("Too high");
				    }else if( guess < number)  {
				      System.out.println("Too low");
				    }
				    if(j==1) {
						System.out.println("Oops, you lost. Nevermind, good luck next time.");
						price = 150*0.95;
					    discount = 150*0.05;
					    discountRate = 5.00;  
					    break;
				    }
		       }
				
			break;}
				
			}
		//PRINTING OF PRICE
		System.out.println();
		System.out.println("You have recieved discount at  " + discountRate + " %.");
		System.out.print("Your discount price will be at RM  " );	
		System.out.printf("%.2f",discount);	
		System.out.println(". " );	
		System.out.print("Your final price will be at    RM " );	
		System.out.printf("%.2f",price);	
		System.out.println(". " );		
		System.out.println();
		
	//PAYMENT USING CASH OR CARD
		int pay;
		double cash = 0 ;
		double change = 0;
		System.out.println("Do you want to pay by cash or by card? Please enter 1 for cash and 2 for card.");
		pay = scan.nextInt();
		while(pay!=1) {
			int password, password1;
			int k;
			System.out.println("Please enter your numerical password. ");
			password = scan.nextInt();
			System.out.println("Please re-enter your password.");
			password1 = scan.nextInt();
			
			
			for (k=3; k>=0; k--) {
				if(k==0) {
					System.out.println("LOGIN FAILED. Please pay by cash. Please enter 1.");
					pay = scan.nextInt();
					break;
			        }
				if (password == password1) { 
					System.out.println("Correct password. ");
					System.out.print("The final price you should pay is RM " );	
					System.out.printf("%.2f",price);	
					System.out.println(". " );
					System.out.println("RM "+price+" ENTERED.");
					System.out.println("THANK YOU.");
					cash = price;
				break;
				}
				else if(password != password1) {
					System.out.println("Wrong password. ");
					System.out.println("You have "+k+" more chance(s). Please re-enter your password.");
					password1 = scan.nextInt();				
				}
				
				
		}
			
	break;		}
		if(pay==1) {
			System.out.print("The final price you should pay is RM " );	
			System.out.printf("%.2f",price);	
			System.out.println(". " );
			System.out.println("Please enter the amount you want to pay." );
			cash = scan.nextDouble();
			while(cash<price) {
				System.out.print("The final price you should pay is RM " );	
				System.out.printf("%.2f",price);	
				System.out.println(". " );
				System.out.println("Please re-enter the amount you want to pay." );
				cash = scan.nextDouble();
			}
			if(cash==price) {
				System.out.print("The price you paid is RM " );	
				System.out.printf("%.2f",price);	
				System.out.println(". " );
				System.out.println("Thank you." );
		    }else if(cash>price) {
		    	change=cash-price;
		    	System.out.print("The price you paid is RM " );	
				System.out.printf("%.2f",cash);	
				System.out.println(". " );
				System.out.print("Thank you. This is your change RM " );
				System.out.printf("%.2f",change);	
				System.out.println(". " );
		    }
		}
		
			
		
	//PRINT RECEIPT
		System.out.println();
		System.out.println("Here is your receipt." );
		System.out.println();
		System.out.println("************************************");
		System.out.println("              TS House");
		System.out.println("************************************");
		System.out.println("Lot 1A, Orchid IT Mall, ");
		System.out.println("Street 5, Casual Garden, ");
		System.out.println("10000 State.");
		System.out.println("CareLine : 1300-88-9876");
		System.out.println("H/P: 012-3789654   FAX: 04-3789675");
		System.out.println("************************************");
		System.out.println("ITEM                QTY     PRICE");
		System.out.println("Upgrading Pogram    *1    RM 150.00");
		if(member==1)
		System.out.println("Membership Fee      *1    RM  10.00");
		System.out.println();
		System.out.println();
		System.out.print("Discount rate, %:             ");
		System.out.printf("%.2f%n",discountRate);
		System.out.print("Discount price  :         RM  ");
		System.out.printf("%.2f%n",discount);
		System.out.print("Final price     :         RM ");
		System.out.printf("%.2f%n",price);
		System.out.println("____________________________________");
		System.out.print("Amount paid     :         RM ");
		System.out.printf("%.2f%n",cash);
		System.out.print("Change          :         RM   ");
		System.out.printf("%.2f%n",change);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("************************************");
		System.out.println("              Thank You!");
		System.out.println("          Please come again!");
		System.out.println("************************************");
		
		
		
		
		scan.close();	
		
}
}