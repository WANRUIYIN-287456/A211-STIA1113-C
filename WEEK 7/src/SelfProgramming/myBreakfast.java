package SelfProgramming;
import java.util.Scanner;
public class myBreakfast {
//FOR SOMEONE WHO HAS DIFFICULTIES IN CHOOSING WHAT TO EAT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
		System.out.println("NOT SURE what to eat for your BREAKFAST? ");
		System.out.println("No worries. We are here to help you. ^_^ ");
		System.out.println("First of all please insert an integer from 1-5. ");
		int type1 = scan.nextInt();
		
		String type  = null;
		int rice     = 0;
		int noodles  = 0;
		int noodles2 = 0;
		int roti     = 0;
		int drinks   = 0;
		
		switch(type1) {
		case 1 :
		type = "Rice";
		System.out.println("Rice. ");
		Rice(rice);
		break;
		case 2 : 
		type = "Fried Noodles";
		System.out.println("Fried Noodles. ");
		Noodles(noodles);
		break;
		case 3:
		type = "Soup Noodles";			
		System.out.println("Soup Noodles.");
		Noodles2(noodles2);
		break;
		case 4 :
		type = "Roti";
		System.out.println("Roti. ");
		Roti(roti);
		break;
		case 5 :
		type = "Drinks";
		System.out.println("Drinks. ");	
		Drinks(drinks);
		break;
		}
		
		
	scan.close();	
	}

	public static void Rice(int rice) {
	Scanner scan2 = new Scanner (System.in);
	System.out.println("Please insert an integer 1-4 to determine your type of rice. ");
    int type2a = scan2.nextInt();
    String type2ai = null;
    String type2bi = null;
    switch(type2a) {
	case 1 :
	type2ai = "Nasi Lemak";
	System.out.println("Nasi Lemak ");
	break;
	case 2 :
	type2ai = "Nasi Putih";
	System.out.println("Nasi Putih ");	
	break;
	case 3 :
	type2ai = "Nasi Tomato";
	System.out.println("Nasi Tomato");	
	break;
	case 4 : 
	type2ai = "Nasi Karabu";
	System.out.println("Nasi Kerabu ");	
	break;
	default :
	System.out.println("ERROR INPUT");	
	}
    System.out.println("Please insert an integer 1-8 to determine your add-ons. ");
    int type2b = scan2.nextInt();
    switch(type2b) {
	case 1 :
	    type2bi = "Sambal";
	System.out.println("Sambal ");
	break;
	case 2 : 
		type2bi = "Fried Egg";
	System.out.println("Fried Egg ");	
	break;
	case 3 :
		type2bi = "Fried Chicken";
	System.out.println("Fried Chicken ");	
	break;
	case 4 :
		type2bi = "Rendang Chicken";
	System.out.println("Rendang Chicken ");	
	break;
	case 5 :
		type2bi = "Masak Merah Chicken";
	System.out.println("Masak Merah Chicken ");	
	break;
	case 6 : 
		type2bi = "Mixed Vegetables";
	System.out.println("Mixed Vegetables ");	
	break;
	case 7 :
		type2bi = "Curry Vegetables";
	System.out.println("Curry vegetables ");	
	break;
	case 8 : 
		type2bi = "All add-ons";
	System.out.println("All add-ons");	
	break;
	default :
	System.out.println("ERROR INPUT");	
	}
    System.out.println("Your breakfast today is " + type2ai + " with add-ons " + type2bi + ".");	
	scan2.close();
}

	public static void Noodles(int noodles) {
		Scanner scan3 = new Scanner (System.in);
		String type3ai = null; 
		String type3bi = null;
		System.out.println("Please insert an integer 1-4 to determine your type of noodles. ");
	    int type3a = scan3.nextInt();
	    switch(type3a) {
		case 1 :
			type3ai = "Bihun";
		System.out.println("Bihun ");
		break;
		case 2 : 
			type3ai = "Keutiaw";
		System.out.println("Keutiaw");	
		break;
		case 3 : 
			type3ai = "Mee";
		System.out.println("Mee");	
		break;
		case 4 : 
			type3ai = "Instant Noodles";
		System.out.println("Instant Noodles");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-8 to determine your add-ons. ");
	    int type3b = scan3.nextInt();
	    switch(type3b) {
		case 1 :
			type3bi = "Sambal";
		System.out.println("Sambal ");
		break;
		case 2 : 
			type3bi = "Fried Egg";
		System.out.println("Fried Egg ");	
		break;
		case 3 : 
			type3bi = "Fried Chicken";
		System.out.println("Fried Chicken ");	
		break;
		case 4 : 
			type3bi = "Rendang Chicken";
		System.out.println("Rendang Chicken ");	
		break;
		case 5 : 
			type3bi = "Masak Merah Chicken";
		System.out.println("Masak Merah Chicken ");	
		break;
		case 6 :
			type3bi = "Mixed Vegetables";
		System.out.println("Mix Vegetables ");	
		break;
		case 7 : 
			type3bi = "Curry Vegetables";
		System.out.println("Curry vegetables ");	
		break;
		case 8 :
			type3bi = "All add-ons";
		System.out.println("All add-ons");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Your breakfast today is fried " + type3ai 
	    + " with add-ons " + type3bi + ".");	
		scan3.close();
	}
	
	public static void Noodles2 (int noodles2) {
		Scanner scan4 = new Scanner (System.in);
		String type4ai = null;
		String type4bi = null;
		String type4ci = null;
		System.out.println("Please insert an integer 1-4 to determine your type of noodles. ");
	    int type4a = scan4.nextInt();
	    switch(type4a) {
		case 1 :
			type4ai = "Bihun";
		System.out.println("Bihun ");
		break;
		case 2 : 
			type4ai = "Keutiaw";
		System.out.println("Keutiaw");	
		break;
		case 3 : 
			type4ai = "Mee";
		System.out.println("Mee");	
		break;
		case 4 : 
			type4ai = "Instant Noodles";
		System.out.println("Instant Noodles");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-4 to determine your type of soup. ");
	    int type4b = scan4.nextInt();
	    switch(type4b) {
		case 1 : 
			type4bi = "Clear Soup";
		System.out.println("Clear Soup ");
		break;
		case 2 : 
			type4bi = "Curry Soup";
		System.out.println("Curry");	
		break;
		case 3 : 
			type4bi = "Tomyam Soup";
		System.out.println("Tomyam");	
		break;
		case 4 : 
			type4bi = "Laksa Soup";
		System.out.println("Laksa");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-7 to determine your add-ons. ");
	    int type4c = scan4.nextInt();
	    switch(type4c) {
		case 1 : 
			type4ci = "Bean Sprouts";
		System.out.println("Bean Sprouts ");
		break;
		case 2 :
			type4ci = "Boiled Eggs";
		System.out.println("Boiled Egg ");	
		break;
		case 3 : 
			type4ci = "Fishballs";
		System.out.println("Fishballs ");	
		break;
		case 4 : 
			type4ci = "Tofu";
		System.out.println("Tofu ");	
		break;
		case 5 : 
			type4ci = "Lady's finger";
		System.out.println("Lady's finger ");	
		break;
		case 6 : 
			type4ci = "Sambal";
		System.out.println("Sambal ");	
		break;
		case 7 : 
			type4ci = "All add-ons";
		System.out.println("All add-ons ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Your breakfast today is soup " 
		+ type4ai + " with " + type4bi + " and add-ons " + type4ci + ".");	
		scan4.close();
	}
	
	public static void Roti (int roti) {
		Scanner scan5 = new Scanner (System.in);
		String type5ai = null;
		String type5bi = null;
	    System.out.println("Please insert an integer 1-6 to determine your dish. ");
	    int type5 = scan5.nextInt();
	    switch(type5) {
		case 1 :
			type5ai = "Roti Canai";
		System.out.println("Roti Canai");
		break;
		case 2 : 
			type5ai = "Roti Tisu";
		System.out.println("Roti Tisu ");	
		break;
		case 3 : 
			type5ai = "Roti Telur";
		System.out.println("Roti Telur ");	
		break;
		case 4 : 
			type5ai = "Roti Telur dengan Bawang";
		System.out.println("Roti Telur dengan Bawang ");	
		break;
		case 5 : 
			type5ai = "Roti Planta";
		System.out.println("Roti Planta ");	
		break;
		case 6 : 
			type5ai = "Roti Canai Pisang";
		System.out.println("Roti Canai Pisang ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-5 to determine your gravy. ");
	    int type5b = scan5.nextInt();
	    switch(type5b) {
		case 1 :
			type5bi = "No Gravy";
		System.out.println("No gravy");
		break;
		case 2 : 
			type5bi = "Sugar";
		System.out.println("Sugar ");	
		break;
		case 3 : 
			type5bi = "Chicken Curry";
		System.out.println("Chicken Curry ");	
		break;
		case 4 : 
			type5bi = "Dhal Gravy";
		System.out.println("Dhal Curry ");	
		break;
		case 5 : 
			type5bi = "Mixed Curry";
		System.out.println("Mixed Curry ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Your breakfast today is " + type5ai + 
	    " with " + type5bi + ".");	
		scan5.close();
	}	
	
	public static void Drinks (int drinks) {
		Scanner scan6 = new Scanner (System.in);
		String type6ai = null;
		String type6bi = null;
		String type6ci = null;
		String type6di = null;
	    System.out.println("Please insert an integer 1-5 to determine your type of drinks. ");
	    int type6 = scan6.nextInt();
	    switch(type6) {
		case 1 : 
			type6ai = "Milo";
		System.out.println("Milo");
		break;
		case 2 : 
			type6ai = "Coffee";
		System.out.println("Coffee ");	
		break;
		case 3 : 
			type6ai = "Tea";
		System.out.println("Tea ");	
		break;
		case 4 : 
			type6ai = "Horlicks";
		System.out.println("Horlicks ");	
		break;
		case 5 :
			type6ai = "Cocoa";
		System.out.println("Cocoa ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-3 to determine your amount of sugar. ");
	    int type6b = scan6.nextInt();
	    switch(type6b) {
		case 1 : 
			type6bi = "No Sugar";
		System.out.println("No sugar");
		break;
		case 2 : 
			type6bi = "Half Sugar";
		System.out.println("Half sugar ");	
		break;
		case 3 : 
			type6bi = "Full Sugar";
		System.out.println("Full Sugar ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-3 to determine your amount of milk. ");
	    int type6c = scan6.nextInt();
	    switch(type6c) {
		case 1 : 
			type6ci = "No milk";
		System.out.println("No milk");
		break;
		case 2 : 
			type6ci = "Half milk";
		System.out.println("Half milk ");	
		break;
		case 3 : 
			type6ci = "Full milk";
		System.out.println("Full milk ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}
	    System.out.println("Please insert an integer 1-3 to determine your amount of ice. ");
	    int type6d = scan6.nextInt();
	    switch(type6d) {
		case 1 : 
			type6di = "No ice";
		System.out.println("No ice");
		break;
		case 2 : 
			type6di = "Half ice";
		System.out.println("Half ice ");	
		break;
		case 3 : 
			type6di = "Full ice";
		System.out.println("Full ice ");	
		break;
		default :
		System.out.println("ERROR INPUT");	
		}  
	    System.out.println("Your breakfast today is only " + type6ai + 
	    " with " + type6bi + " " + type6ci + " and " + type6di + ".");	
		scan6.close();
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
