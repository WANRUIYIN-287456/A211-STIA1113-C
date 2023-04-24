package Project;
import java.util.Scanner;
public class InteriorDesign {

	public static void main(String[] args) {
    Scanner ls = new Scanner(System.in);
		
		
		String [] pack = {"Modern Design + Basic Colour", "Modern Design + Premium Colour", "Vintage Design + Basic Colour", " Vintage Design + Premium Colour", "Traditional Design + Basic Colour", 
				"Traditional Design + Premium Colour","Custom Design + Basic Colour","Custom Design + Premium Colour"};
		String [] design = {"LIVING ROOM","BEDROOM","STUDY ROOM","GAMING ROOM","STUDIO", "KITCHEN","TOILET"}; 
		String [] colour = {"Black","White","Green","Blue","Red","Yellow"};
		String [] colour2 = {"Gold","Silver","Rose Gold"};

		int type=0;
		int choice=0;
		double width = 0; double length = 0;
		double total_area=0;
		
		System.out.println("\n________________________________________");
		System.out.println();
		System.out.print("          **MERIDIAN INTERIORS**    ");
		System.out.println("\n________________________________________");
		System.out.println();
		System.out.println();
				
		showMessage();
		
		//user insert room size
		System.out.println("Enter width(in ft): ");
		width = ls.nextDouble();
		System.out.println("Enter length (in ft): ");
		length =ls.nextDouble();
		
		total_area =roomSize(width,length);
		int modern=25; 
		double priceModern =modernPrice(modern,total_area);
		int vintage = 30;
		double priceVintage =vintagePrice(vintage,total_area);
		int traditional = 35;
		double priceTraditional = traditionalPrice(traditional,total_area);
		 int custom = 45;
		double priceCustom =customPrice(custom,total_area);
		
		 double basic = 2.20; /*Rm 2.20 per square feet*/ double premium = 3.00; /*Rm 3.00 per square feet*/
		double priceBasic =basicPrice(basic,total_area);
		double pricePremium =premiumPrice(premium,total_area);
		
		
		
		//Display type of package
		System.out.println("\n* * * * * * * Package * * * * * * * * * * * * * * *");
		System.out.print("*                                                 *");
		System.out.println();
		System.out.println("*  1-Set A: " + pack[0] + "          *");
		System.out.println("*  2-Set B: " + pack[1] + "        *");
		System.out.println("*  3-Set C: " + pack[2] + "         *");
		System.out.println("*  4-Set D: " + pack[3] + "      *");
		System.out.println("*  5-Set E: " + pack[4] + "     *");
		System.out.println("*  6-Set F: " + pack[5] + "   *");
		System.out.println("*  7-Set G: " + pack[6] + "          *");
		System.out.println("*  8-Set H: " + pack[7] + "        *");
		System.out.println("*                                                 *");
		System.out.print("*                                                 *");
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * *");
	
				
				System.out.println();
				System.out.println();
	
				System.out.println("Please Choose Your Package: ");
				int set = ls.nextInt();
				
				
				if(contains(set)){ 
					System.out.println();
					System.out.println("Package "+ set +" is available."); 
					}
				else
					{ 
					while (set != 1 && set != 2 && set != 3 && set != 4 && set != 5 && set != 6 && set != 7 && set != 8) {
						System.out.println();
						System.out.println("Package is unavailable.");
						System.out.println();
						System.out.println("Please Choose Your Package: ");
						set = ls.nextInt();
						contains(set);
						System.out.println("Package "+ set +" is available."); 
					
						
				
						
						}
					
					
					
					
					
					}
				switch(set) {
				
				case 1:
					
					showBasic();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set A
					double set_A;  /*(modern + basic)*/
					set_A = priceModern + priceBasic;
					
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
						
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
						System.out.println();
						System.out.println("Set A: " + pack[0]);
						System.out.println();
						
						if (choice==1) {
							System.out.print("Colour:" + colour[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour[2]);
						}else if (choice==4) {
							System.out.println("Colour:" + colour[3]);
						}else if (choice==5) {
							System.out.println("Colour:" + colour[4]);
						}else if (choice==6) {
							System.out.println("Colour:" + colour[5]);
							System.out.println();
						}
						
							
						
						
							System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_A);
						
					break;
				
				case 2:
					
					showPremium();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set B
						double set_B;  /*(modern + premium*/
						set_B = priceModern + pricePremium;
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
						
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
							System.out.println();
						}
						System.out.println();
						System.out.println("Set B: " + pack[1]);
						System.out.println();

						if (choice==1) {
							System.out.print("Colour:" + colour2[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour2[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour2[2]);
							System.out.println();		
						}	
							total_area = roomSize(width,length);
						System.out.println();
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_B);
					break;
						
			case 3:
					
					
					showBasic();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set C
						double set_C; /*(vintage + basic)*/
						set_C = priceVintage + priceBasic;
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
						
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
						
						System.out.println();
						System.out.println("Set C: " + pack[2]);
						System.out.println();
						
						if (choice==1) {
							System.out.print("Colour:" + colour[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour[2]);
						}else if (choice==4) {
							System.out.println("Colour:" + colour[3]);
						}else if (choice==5) {
							System.out.println("Colour:" + colour[4]);
						}else if (choice==6) {
							System.out.println("Colour:" + colour[5]);
							System.out.println();

						}
						
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_C);
					break;
				
				case 4:
					
					showPremium();

					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set D
						double set_D;  /*(vintage + premium*/
						set_D = priceVintage + pricePremium;
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
			
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
						
						System.out.println();
						System.out.println("Set D: " + pack[3]);
						System.out.println();
						if (choice==1) {
							System.out.print("Colour:" + colour2[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour2[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour2[2]);
							System.out.println();
								
						}	
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_D);
					break;
						
				case 5:
					
					showBasic();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set E
						double set_E; /*(Traditional + basic)*/
						set_E = priceTraditional + priceBasic; 
						
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
						

						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
					
						System.out.println();
						System.out.println("Set E: " + pack[4]);
						System.out.println();
						if (choice==1) {
							System.out.print("Colour:" + colour[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour[2]);
						}else if (choice==4) {
							System.out.println("Colour:" + colour[3]);
						}else if (choice==5) {
							System.out.println("Colour:" + colour[4]);
						}else if (choice==6) {
							System.out.println("Colour:" + colour[5]);
							System.out.println();

						}
						
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_E);
					break;
						
				case 6:
					
					showPremium();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
			
					//Calculate Total Price for Set F
						double set_F;  /*(traditional + premium*/
						set_F = priceVintage + pricePremium;
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
						
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
					
							System.out.println();
							System.out.println("Set F: " + pack[5]);
							System.out.println();		
							if (choice==1) {
								System.out.print("Colour:" + colour2[0]);
							}else if (choice==2) {
								System.out.println("Colour:" + colour2[1]);
							}else if (choice==3) {
								System.out.println("Colour:" + colour2[2]);
								System.out.println();	
							}	
							
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_F);
					break;
							
				case 7:
					
					showBasic();
					System.out.println("Please Choose Colour: ");
					choice= ls.nextInt();
					typeOfRoom();
					System.out.println("Enter code:  ");
					type = ls.nextInt(); 
					
					//Calculate Total Price for Set E
						double set_G; /*(Custom + basic)*/
						set_G = priceCustom + priceBasic; 
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
			
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
					
						System.out.println();
						System.out.println("Set G: " + pack[6]);
						System.out.println();
						if (choice==1) {
							System.out.print("Colour:" + colour[0]);
						}else if (choice==2) {
							System.out.println("Colour:" + colour[1]);
						}else if (choice==3) {
							System.out.println("Colour:" + colour[2]);
						}else if (choice==4) {
							System.out.println("Colour:" + colour[3]);
						}else if (choice==5) {
							System.out.println("Colour:" + colour[4]);
						}else if (choice==6) {
							System.out.println("Colour:" + colour[5]);
							System.out.println();

						}
						
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_G);
					break;
						
			case 8:
					
				showPremium();
				System.out.println("Please Choose Colour: ");
				choice= ls.nextInt();
				typeOfRoom();
				System.out.println("Enter code:  ");
				type = ls.nextInt(); 
				
				//Calculate Total Price for Set H
						double set_H;  /*(Custom + premium*/
						set_H = priceCustom + pricePremium;
						
						System.out.println("\n________________________________________________");
						System.out.println();
						System.out.print("          **MERIDIAN INTERIORS ORDER RECEIPT**    ");
						System.out.println("\n________________________________________________");
						System.out.println();
			
						if(type == 1) {
							System.out.println("| DESIGN FOR " + design[0] + " |");
						}else if (type == 2) {
							System.out.println("| DESIGN FOR " + design[1] + " |");
						}else if (type == 3) {	
							System.out.println("| DESIGN FOR " + design[2] + " |");
						}else if (type == 4) {
							System.out.println("| DESIGN FOR " + design[3] + " |");
						}else if (type == 5) {
							System.out.println("| DESIGN FOR " + design[4] + " |");
						}else if (type == 6) {
							System.out.println("| DESIGN FOR " + design[5] + " |");
						}else if (type == 7) {
							System.out.println("| DESIGN FOR " + design[6] + " |");
						}
					
							System.out.println();
							System.out.println("Set H: " + pack[7]);
							System.out.println();
							if (choice==1) {
								System.out.print("Colour:" + colour2[0]);
							}else if (choice==2) {
								System.out.println("Colour:" + colour2[1]);
							}else if (choice==3) {
								System.out.println("Colour:" + colour2[2]);
								System.out.println();	
							}	
						
						System.out.print("Room size = " + total_area + " sqf");
						System.out.print("\n----------------------------------------");
						System.out.println();
						System.out.print("Total Price:RM ");
						System.out.printf("%.2f",set_H);
							
							break;
						}
				showMessage2();
				}
			
			
					
				
	public static void showMessage() { //header for method 
		System.out.println("Hello, Welcome to MERIDAN INTERIORS! ");
		System.out.println("Please make sure you insert the right code and spelling while filling the form :D");
		System.out.println("Do follow the instructions below.");
		System.out.println();
		
	} //showMessage method
	
	public static void showMessage2() { //header for method 
		System.out.println("\n----------------------------------------");
		System.out.println("Thank you for being our valued customer <3");
		System.out.println("We are so grateful for the pleasure of serving you and hope we met your expectations.");
		System.out.print("See you again in the future :) \nLots of Love! ");
		
		
	} //showMessage method
	
	public static void showBasic() { 
	

	System.out.println("\n* * * * * * * Colours * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	System.out.print("*                                                                           *");
	System.out.println();
	System.out.println("*  Basic Colours: [1] Black [2] White [3] Green [4] Blue [5] Red [6] Yellow *");
	System.out.print("*                                                                           *");
	System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
	System.out.println();
					
	}//showBasic method
	
	public static void showPremium() { //header for method 

		System.out.println("\n* * * * * * * Colours * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("*                                                                           *");
		System.out.println();
		System.out.println("*  Premium Colours: [1] Gold [2] Silver [3] Rose Gold                       *");
		System.out.print("*                                                                           *");
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println();
		
	} //showPremium method
	
public static void typeOfRoom() { //header for method 
	System.out.println();
	System.out.println("[1] living room\n" + "[2] bedroom\n" + "[3] study room\n" +  "[4] gaming room\n" + "[5] studio\n" + "[6] kitchen\n" + "[7] toilet\n");
}

public static double roomSize(double width, double length) {
	return width*length;
	

	
}

public static double modernPrice(int modern, double total_area) {
	
	return modern * total_area; 
}
public static double vintagePrice(int vintage , double total_area) {
	return vintage * total_area; 
}

public static double traditionalPrice(int traditional, double total_area) {
	return traditional * total_area; 
}

public static double customPrice(int custom, double total_area) {
	return custom * total_area; 
}
public static double basicPrice(double basic, double total_area) {
	basic = 2.20;
	return basic * total_area; 
}
public static double premiumPrice(double premium, double total_area) {
	return premium * total_area; 
}


public static boolean contains(int  s){ 
	
	
	if(s ==1 || s ==2 || s ==3 || s ==4 ||  s ==5 || s ==6 || s ==7 || s ==8){ 
		return true; 
		
	} 


return false; 

} 
}
