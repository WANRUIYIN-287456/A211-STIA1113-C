package Assignment1;
import java.util.Scanner;
public class Watches {

	public static void main(String[] args) {
		/*  Nowadays, technology is more advanced and we have now smart watches.  
		We can use smart watches to track our fitness while doing sports. 
		However, when we set a goal to burn an amount of calories, 
		we are not sure about our speed of exercising and 
		the duration of time we still need to exercise to achieve our goal. */
		Scanner scan = new Scanner (System.in);	
// WELCOMING GUESTS
		int service;
		int proceed;
		int s;
		double age;
		double weight;
		double height;
		double activity;
		double goal;
		double x;
		double y;
		double z;
		String name;
		String gender;
		
		System.out.println("************************************************************************");
		System.out.println("                             TS House");
		System.out.println("************************************************************************");
		System.out.println("                     Lot 1A, Orchid IT Mall, ");
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
		System.out.println("Please enter 1 for updating pogram. ");
	    service = scan.nextInt();
	    System.out.println("Updating .... Please wait");
		System.out.println();
		System.out.println("Update suceeded. You are directed to the trial now.");
		System.out.println("Please enter any integer to continue.");
		proceed = scan.nextInt();
		System.out.println();
	//INPUT 

	//user details
	System.out.println("Dear user, what is your name? ");
	name = scan.next();
	System.out.println("Hi " + name + ", what is you age?"); 
	age = scan.nextDouble();
	System.out.println("Hi " + name + ", what is you gender?"); 
	gender = scan.next();
	System.out.println("Hi " + name + ", what is you weight in kg?"); 
	weight = scan.nextDouble();
    System.out.println("Hi " + name + ", what is you height in cm?"); 
	height = scan.nextDouble();
	System.out.println("Please enter -161 for female and 5 for male."); 
	s = scan.nextInt();
	System.out.println("Activity level : \r\n"
			+ "	1.2, for sedentary (little to no exercise)\r\n"
			+ "        1.375, or lightly active (light exercise 1–3 days per week)\r\n"
			+ "	1.55, or moderately active (moderate exercise 3–5 days per week)\r\n"
			+ "	1.725, or moderately active (moderate exercise 3–5 days per week)\r\n"
			+ "	1.9, or extra active (very hard exercise, training, or a physical job)");
	System.out.println("Please enter your activity level."); 
	activity = scan.nextDouble();
	
	
	//amount of calories user wanted to burn daily	
	System.out.println("Hi " + name + ", Please enter your daily goal to burn calories."); 
	goal = scan.nextDouble();
	System.out.println("Please enter the distance traveled today in metres.");
	x = scan.nextDouble();
	System.out.println("Please enter the time you have exercised today in minutes.");
	y = scan.nextDouble();
	//amount of calories user burned displayed by the smart watch
	System.out.println("Please enter the calories burned today.");
	z = scan.nextDouble();
	
	//CALCULATION
	double speed = x/y; // speed = distance traveled / time taken
	double c1    = z/y; // c1 = calories burned in one minute = calories burned / time taken
	double c2    = goal - z; // c2=calories yet to burn in order to achieve the daily goal
	double time  = c2/c1; //time=time needed to achieve daily goal
	double rmr   = 10 * weight + 6.25 * height - 5 * age + s;
	double tdee  = rmr * activity;
	
	
	
	//PRINT RESULTS
	  //TDEE, RMR
	 System.out.println( name + ", your Resting Metabolic Rate (RMR) is " + rmr + "kcal/day.");
     System.out.println( name + ", your Total Daily Energy Expenditure (TDEE) is " + tdee + " kccal/day.");
     System.out.println();
     // Speed
	System.out.print("Your speed now is ");
	System.out.printf("%.1f", speed);
	System.out.println(" m/min.");
	System.out.println();
	  // Results achieved till now
	System.out.print("By running at speed " );
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
	proceed = scan.nextInt();
	System.out.println();
	
// CALCULATING PRICE
	double price       = 0;
	double discountRate= 0;
	double discount    = 0;
	double cash;
	double change      = 0;
	int member;
	
    price = 160*0.8;
	discount = 160*0.2;
	discountRate =20.00;
	
	System.out.println("The fees for updating the pogram is RM 150.");
	System.out.println("Today is our Grand Opening and you are one of our first 100 customers!");
	System.out.println("Hence, we will have some promotion.");
	System.out.println("Discount for member: 20%, Discount for non-member: 5%");
	System.out.println();
	System.out.println("The membership costs RM 10 and it is for lifetime.");
	System.out.println("The final price that you need to pay will be RM 128 only as our member.");
	System.out.println("However, for non-member, you will need to pay RM 142.50.");
	System.out.println("Please enter 1 to register for our member.");
	member = scan.nextInt();
	System.out.println("Please enter 128 to continue your payment.");
	cash = scan.nextDouble();
	change = cash - price;
	System.out.println();
	System.out.print("Dear " + name);
	System.out.println(", here is your receipt." );
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