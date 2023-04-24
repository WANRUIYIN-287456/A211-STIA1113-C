package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Watches {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		String tsHouse = null;
		TSHouse(tsHouse);
		String program = null;
		Program(program);
		String price1 = null;
		Price1(price1);
		
	}
	
	public static void TSHouse(String tsHouse){
		Scanner scan = new Scanner (System.in);
		int service;
		int proceed;
		System.out.println("************************************************************************");
		System.out.println("                             TS House");
		System.out.println("************************************************************************");
		System.out.println("                     Lot 1A, LS Mall, ");
		System.out.println("                     Street 5, Casual Garden, ");
		System.out.println("                     10000 State.");
		System.out.println("                     CareLine : 1300-88-9876");
		System.out.println("                     H/P: 012-3789654   FAX: 04-3789675");
		System.out.println("************************************************************************");
	
		System.out.println();
		System.out.println("Welcome to TS House !");
		System.out.println("TS House is providing the service to upgrade the program in "
				            + "your smartwatch.");
		System.out.println("This program namely TS-1 will contain a few main features in helping you to "
				            + "track your fitness and while exercising.");
		System.out.println();
		System.out.println("   Firstly, by updating this program, you are able to set your "
				            + "daily goal for burning calories. This will motivates you and ");
		System.out.println("enable you to make it a habit to exercise regularly.");
		System.out.println("   Secondly, the smartwatch will display your speed of exercising. "
				            + "This is to give you an idea about your speed and you can ");
		System.out.println("improve it by exercising regularly. ");
		System.out.println("   By updating the program, you will know the amount of calories "
				            + "you will need to burn and the duration you still need to ");
		System.out.println("exercise in order to achieve your daily goal. You will become "
				            + "satisfy and have self-confidence as you can achieve your");
		System.out.println("daily goal. Besides, you will have an idea about the duration "
				            + "you still need to exercise and glad to keep going.");
		System.out.println("   Simply put, this program will helps monitor your exercise. "
				            + "In long term, you are able to lead a healthy lifestyle and ");
		System.out.println("stay away from health problems such as high blood pressure, "
				            + "obesity and atherosclerosis. ");
		System.out.println();
		System.out.println("Are you interested in our TS-1 ?");
		System.out.println("Please enter 1 for updating pogram.");
	    service = scan.nextInt();
		System.out.println("Updating .... Please wait");
		System.out.println();
		System.out.println("Update suceeded. You are directed to the trial now.");
		System.out.println("Please enter any integer to continue.");
		proceed = scan.nextInt();
		System.out.println();
		}
	
	public static void Program(String program) {
//PART 1		
	//INPUT USER DETAILS
	Scanner scan = new Scanner (System.in);	
	System.out.println("Dear user, what is your name? ");
    String name = scan.nextLine();
	System.out.println("Hi " + name + ", what is you age?"); 
	double age = scan.nextDouble();
	System.out.println("Hi " + name + ", what is you gender? Please enter 1 for female and 2 for male."); 
	int gender = scan.nextInt();
	System.out.println("Hi " + name + ", what is you weight in kg?"); 
	double weight = scan.nextDouble();
    System.out.println("Hi " + name + ", what is you height in cm?"); 
	double height = scan.nextDouble();
		String[][] activitylevel = {{"ACTIVITY LEVEL"," "},
			{"1.2","sedentary         (little to no exercise)"},
			{"1.375","lightly active    (light exercise 1–3 days per week)"},
			{"1.55","moderately active (moderate exercise 3–5 days per week)"},
			{"1.725","very active       (hard exercise 6–7 days per week)"},
			{"1.9","extra active      (very hard exercise or training or a physical job)"}};
    System.out.println(Arrays.deepToString(activitylevel)
    		.replace("],","\n").replace(",","\t")
    		.replaceAll("[\\[\\]]", " "));
	System.out.println("Hi " + name + ", what is your activity level?"); 
	double activity = scan.nextDouble();
	
//PART 2
	//(RMR)RestingMetabolicRate-numberOfCaloriesYourBodyBurnsAtRest 
		double rmr = 0;
		if(gender == 1)
		rmr=10*weight+6.25*height-5*age-161; //rmr for female
		else if(gender ==2)
		rmr=10*weight+6.25*height-5*age+5; //rmr for male
	//TotalDailyEnergyExpenditure(TDEE)
		double tdee = rmr * activity;
		System.out.print(name + ", your Resting Metabolic Rate (RMR) is ");
        System.out.printf("%.2f",rmr); 
        System.out.print(" kcal/day.");
        System.out.println();
        System.out.print( name + ", your Total Daily Energy Expenditure (TDEE) is ");
        System.out.printf("%.2f",tdee );
        System.out.print(" cal/day.");
        System.out.println();
 
//PART 3
        System.out.println("Are you trying to lose weight?");
        System.out.println("Please enter 1 for losing weight, 2 for maintaining weight and 3 for gaining weight.");
        int lose = scan.nextInt(); 
        double tdee2       = tdee *0.8; //Losing weight should have 10%-20% deficit in calories from tdee per day
        double tdee3       = tdee *1.2; //Gaining weight should have 10%-20% surplus in calories from tdee per day
        double tdee4       = tdee *0.2; //Can be surplus or deficit based on weight maintainence
        double maxCalories = rmr *2.5;
        if (lose == 1) {
        	System.out.print("You are losing weight. You should have " );
            System.out.printf("%.2f",tdee2 );
            System.out.print(" kcal/day.");
            System.out.println();
        }
        else if(lose == 2) {	
        	System.out.print("You are maintain weight. You should have " );
        	System.out.printf("%.2f",tdee );
        	System.out.print(" kcal/day.");
            System.out.println();
        }
        else if(lose == 3) {
        	System.out.print("You are gaining weight. You should have ");
        	System.out.printf("%.2f",tdee3 );
        	  System.out.print(" kcal/day.");
            System.out.println();
        }
        System.out.print("Recommended goal : more than ");
        System.out.printf("%.2f",tdee4 );
        System.out.print(" kcal/day.");
        System.out.println();
//PART 4	
	//amount of calories user wanted to burn daily
    double goal=0;
	System.out.println("Hi "+name+", please enter your goal to burn calories today. "); 
	goal = scan.nextDouble();
	while(goal > maxCalories) {
		System.out.println("Warning! Your calories needed by your body is not enough.");
		System.out.println("This should be unhealthy for you.");
		System.out.println(name + ", please re-enter your goal to burn calories today.");
		goal = scan.nextDouble();
	}
	System.out.println("Please enter the distance traveled today in metres.");
	double x = scan.nextDouble();
	System.out.println("Please enter the time you have exercised today in minutes.");
	double y = scan.nextDouble();
	//amount of calories user burned displayed by the smart watch
	System.out.println("Please enter the calories burned today.");
	double z = scan.nextDouble();
	
	//CALCULATION
	double speed = x/y; // speed = distance traveled / time taken
	double c1    = z/y; // c1 = calories burned in one minute = calories burned / time taken
	double c2    = goal - z; // c2=calories yet to burn in order to achieve the daily goal
	double time  = c2/c1; //time=time needed to achieve daily goal
	
	
	//PRINT RESULTS
	  // Speed
	System.out.print("Your speed now is ");
	System.out.printf("%.1f", speed);
	System.out.println(" m/min.");
	if(speed >= 107.23 && speed <= 160.9)
		System.out.println("You are jogging.");
	else if(speed>160.9)
		System.out.println("You are running");
	System.out.println();
	  // Results achieved till now
	System.out.print("By exercising at speed " );
	System.out.printf("%.1f", speed);
	System.out.print(" m/min for ");
	System.out.printf("%.1f", y);
	System.out.print(" minutes, you can burn ");
	System.out.printf("%.2f", z);
	System.out.println(" calories. ");
	System.out.println();
	  // Amount of calories to be burned to achieve goal
	System.out.print("You need to burn ");
	System.out.printf("%.2f", c2);
	System.out.println(" more calories in order to achieve your daily goal.");
	System.out.println(name + ", keep going!");
	System.out.println();
	  // Duration of Time needed to achieve goal
	System.out.print("You just need to exercise ");
	System.out.printf("%.1f", time);
	System.out.println(" minutes more to achieve your goal.");
	System.out.println(name + ", keep it up! ");
	System.out.println();
	System.out.println("Trial completed.");
	System.out.println("Details successfully updated.");
	System.out.println();
	System.out.println("Thank you for using the trial.");
	System.out.println("Now, you will be directed to the payment for this program, TS-1.");
	System.out.println();
	System.out.println("Please enter any integer to continue.");
	int proceed = scan.nextInt();
	System.out.println();
	
	}

	//DISCOUNT	
	public static void Price1(String price1) {
	Scanner scan = new Scanner (System.in);	
	int member;
	int game;
	double price=0;
	double discount=0;
	double discountRate=0;
	int warranty = 0;
	String warrantyCode = null;
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
			System.out.println("Oops, you lost. The X is " + number +". Nevermind, good luck next time.");
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
					System.out.println("Oops, you lost. The X is " + number + ". Nevermind, good luck next time.");
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
	if (member==1) {
		warranty = 12;
		warrantyCode = "TS-100098";
	 }
	 else {
		 warranty = 6;
		 warrantyCode = "TS-100097";
	}
	System.out.println("Besides, you will have "+ warranty +"-month warranty for your program. " );	
	System.out.println("Your warranty code will be " + warrantyCode +"." );	
	System.out.println();
	
//PAYMENT USING CASH OR CARD
	int pay;
	double cash = 0 ;
	double change = 0;
	System.out.println("Do you want to pay by cash or by card? Please enter 1 for cash and 2 for card.");
	pay = scan.nextInt();
	if(pay==2) {
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
		
	}
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
	    	System.out.print("The price you paid is RM" );	
			System.out.printf("%.2f",cash);	
			System.out.println(". " );
			System.out.print("Thank you. This is your change RM " );
			System.out.printf("%.2f",change);	
			System.out.println(". " );
	    }
	}
	
		
	
//PRINT RECEIPT
	System.out.println();
	System.out.println("Here's a voucher for you.");
	System.out.println("  ======================================  ");
	System.out.println(" //                                    \\\\");
	System.out.println(" \\\\             VOUCHER                //");
	System.out.println(" //____________________________________\\\\");	
	System.out.println(" \\\\                                    //");
	System.out.println(" //           # LS MALL                \\\\");	
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
	System.out.println();
	System.out.println();
	System.out.println("Here is your receipt." );
	System.out.println();
	System.out.println("*********************************************");
	System.out.println("                   TS House");
	System.out.println("*********************************************");
	System.out.println("Lot 1A, LS Mall, ");
	System.out.println("Street 5, Casual Garden, ");
	System.out.println("10000 State.");
	System.out.println("CareLine : 1300-88-9876");
	System.out.println("H/P: 012-3789654            FAX: 04-3789675");
	System.out.println("*********************************************");
	System.out.println("ITEM                  QTY          PRICE");
	System.out.println("Upgrading Pogram      *1       RM   150.00");
	if(member==1)
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
	System.out.println("WARRANTY CODE   :               " + warrantyCode);
	System.out.println("*********************************************");
	System.out.println("                  Thank You!");
	System.out.println("              Please come again!");
	System.out.println("*********************************************");
	
	
	
	
	
}	
	
	
	
	

}
