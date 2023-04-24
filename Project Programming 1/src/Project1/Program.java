package Project1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*  Nowadays, technology is more advanced and we have now smart watches.  
		We can use smart watches to track our fitness while doing sports. 
		However, when we set a goal to burn an amount of calories, 
		we are not sure about our speed of exercising and 
		the duration of time we still need to exercise to achieve our goal. */

//PART 1		
	//INPUT 
	Scanner scan = new Scanner (System.in);	
	//user details
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
	System.out.println("Activity level : \r\n"
			+ "	1.2, for sedentary (little to no exercise\r\n"
			+ "        1.375, or lightly active (light exercise 1–3 days per week)\r\n"
			+ "	1.55, or moderately active (moderate exercise 3–5 days per week)\r\n"
			+ "	1.725, or very active (hard exercise 6–7 days per week)\r\n"
			+ "	1.9, or extra active (very hard exercise, training, or a physical job)");
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
        System.out.println( name + ", your Resting Metabolic Rate (RMR) is " + rmr + "kcal/day.");
        System.out.println( name + ", your Total Daily Energy Expenditure (TDEE) is " + tdee + " kccal/day.");
        System.out.println();
        
//PART 3
        System.out.println("Are you trying to lose wieght?");
        System.out.println("Please enter 1 for losing weight, 2 for maintaining weight and 3 for gaining weight.");
        int lose = scan.nextInt(); 
        double tdee2 = tdee *0.8; //Losing weight should have 10%-20% deficit in calories from tdee per day
        double tdee3 = tdee *1.2; //Gaining weight should have 10%-20% surplus in calories from tdee per day
        double tdee4 = tdee *0.2; //Can be surplus or deficit based on weight maintainence
        if (lose == 1)
        	System.out.println("You are losing weight. You should have " + tdee2 + " kcal/day.");
        else if(lose == 2)	
        	System.out.println("You are maintain weight. You should have " + " kcal/day.");
        else if(lose == 3)
        	System.out.println("You are gaining weight. You should have " + tdee3 + " kcal/day.");
        System.out.println();
        
//PART 4	
	//amount of calories user wanted to burn daily
    double goal=0;
	System.out.println("Hi "+name+", please enter your goal to burn calories today. "); 
	goal = scan.nextDouble();
	while(goal > tdee4) {
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
    System.out.println();
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
	System.out.println("Pogram successfully updated.");
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
