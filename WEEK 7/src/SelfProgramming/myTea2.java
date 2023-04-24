package SelfProgramming;

import java.util.Scanner;

public class myTea2 {
	//A CODING FOR USER TO ORDER THEIR TEA WITH THE DATABASE 
	public static void main(String[] args) {

			//REFERENCE FROM TEALIVE MENU
			Scanner scan = new Scanner (System.in);	
			System.out.println("NOT SURE what to have for your Hi-Tea ? ");
			System.out.println("No worries. We are here to help you. ^_^ ");
			System.out.println();
			System.out.println("WELCOME to MyTEA !! ");
			System.out.println("1: Signature Brown Sugar Milk Tea");
			System.out.println("2: Original Milk Tea");
			System.out.println("3: Classic Roasted Milk Tea");
			System.out.println("4: Black Diamond Milk Tea");
			System.out.println("5: Hazelnut Milk Tea");
			System.out.println("6: Malty Milk Tea");
			System.out.println("First of all please insert an int from 1-6. ");
			int tea = scan.nextInt();
			String tea1   = null;
			String sugar1 = null;
			String milk1  = null;
			String milk2  = null;
			String ice1   = null;
			String ao1    = null;
			
		    switch(tea) {
			case 1 :
			tea1 = "Signature Brown Sugar Milk Tea";
			System.out.println("Signature Brown Sugar Milk Tea");
			break;
			case 2 :
			tea1 = "Original Milk Tea";	
			System.out.println("Original Milk Tea");	
			break;
			case 3 :
			tea1 = "Classic Roasted Milk Tea";			
			System.out.println("Classic Roasted Milk Tea");	
			break;
			case 4 : 
			tea1 = "Black Diamond Milk Tea";
			System.out.println("Black Diamond Milk Tea");	
			break;
			case 5 : 
			tea1 = "Hazelnut Milk Tea";
			System.out.println("Hazelnut Milk Tea");	
			break;
			case 6 :
			tea1 = "Malty Milk Tea";
			System.out.println("Malty Milk Tea");	
			break;
			default :
			System.out.println("ERROR INPUT");	
			}
		    
			System.out.println("1: no sugar");
			System.out.println("2: half sugar");
			System.out.println("3: full sugar");
		    System.out.println("Please insert an integer 1-3 to determine your amount of sugar. ");
		    int sugar = scan.nextInt();
		    switch(sugar) {
			case 1 :
			sugar1 = "No Sugar";
			System.out.println("No sugar");
			break;
			case 2 :
			sugar1 = "Half Sugar";	
			System.out.println("Half sugar ");	
			break;
			case 3 :
			sugar1 = "Full Sugar";		
			System.out.println("Full Sugar ");	
			break;
			default :
			System.out.println("ERROR INPUT");	
			}
		    
		    System.out.println("1: Full Cream milk");
			System.out.println("2: Low Fat milk");
			System.out.println("3: Almond milk");
		    System.out.println("Please insert an integer 1-3 to determine your type of milk. ");
		    int milka = scan.nextInt();
		    switch(milka) {
			case 1 :
			milk1 = "Full Cream Milk";
			System.out.println("Full Cream Milk");
			break;
			case 2 : 
			milk1 = "Low Fat Milk";
			System.out.println("Low Fat Milk ");	
			break;
			case 3 :
			milk1 = "Almond Milk";
			System.out.println("Almond Milk");	
			break;
			default :
			System.out.println("ERROR INPUT");	
			}
		    
		    System.out.println("1: no milk");
			System.out.println("2: half milk");
			System.out.println("3: full milk");
		    System.out.println("Please insert an integer 1-3 to determine your amount of milk. ");
		    int milkb = scan.nextInt();
		    switch(milkb) {
			case 1 :
			milk2 = "No Milk";
			System.out.println("No milk");
			break;
			case 2 :
			milk2 = "Half Milk";
			System.out.println("Half milk ");	
			break;
			case 3 :
			milk2 = "Full Milk";
			System.out.println("Full milk ");	
			break;
			default :
			System.out.println("ERROR INPUT");	
			}
		    
		    System.out.println("1: no ice");
			System.out.println("2: half ice");
			System.out.println("3: full ice");
		    System.out.println("Please insert an integer 1-3 to determine your amount of ice. ");
		    int ice = scan.nextInt();
		    switch(ice) {
			case 1 :
			ice1 = "No Ice";
			System.out.println("No ice");
			break;
			case 2 :
			ice1 = "Half Ice ";
			System.out.println("Half ice ");	
			break;
			case 3 :
			ice1 = "Full Ice ";	
			System.out.println("Full ice ");	
			break;
			default :
			System.out.println("ERROR INPUT");	
			} 
		    
			System.out.println("1: Brown Sugar Pearls");
			System.out.println("2: Red Beans");
			System.out.println("3: Grass Jelly");
			System.out.println("4: Peanut Pieces");
			System.out.println("5: Taro Balls");
			System.out.println("6: Chocolate topping");
			System.out.println("7: Cheese Topping");
			System.out.println("8: No Topping");
		    System.out.println("Please insert an integer 1-7 to determine your add-ons. ");
		    int ao = scan.nextInt();
		    switch(ao) {
			case 1 :
			ao1 = "Brown Sugar Pearls";
			System.out.println("Brown Sugar Pearls");
			break;
			case 2 :
			ao1 = "Red Beans";
			System.out.println("Red Beans ");	
			break;
			case 3 :
			ao1 = "Grass Jelly";	
			System.out.println("Grass Jelly ");	
			break;
			case 4 :
			ao1 = "Peanut Pieces";	
			System.out.println("Peanut Pieces ");		
			break;
			case 5 :
			ao1 = "Taro Balls";	
			System.out.println("Taro Balls ");		
			break;
			case 6 :
			ao1 = "Chocolate Topping";	
			System.out.println("Chocolate Topping ");		
			break;
			case 7 :
			ao1 = "Cheese Topping";	
			System.out.println("Cheese Topping ");		
			break;
			case 8 :
			ao1 = "No Topping";	
			System.out.println("No Topping ");		
			break;
			default :
			System.out.println("ERROR INPUT");	
			}  
		    
		    System.out.println("You ordered milk tea number " + tea + " which is " + tea1 +   
		    " with amount of sugar number " + sugar + " which is " + sugar1 + 
		    " with milk number " + milka + " which is " + milk1 + " with amount of milk number " 
		    + milkb + " which is " + milk2 + " with amount of ice number " + ice + " which is " 
		    + ice1 + " and add-ons number " + ao + " which is " + ao1 + ".");
		    
		    System.out.println("Please confirm your purchase by pressing int 1 or cancel"
		    		+ " it by pressing int 2.");
		    int confirm = scan.nextInt();
		    
		    if(confirm == 1) {
		    System.out.println("Your " + tea1 + " with " + sugar1 + " " + milk1 + " " + milk2 + " " + ice1 + 
		    " and add-ons " + ao1 + " will be ready soon.");
		    System.out.println("Thank You ! Please come again !");
		    }
		    else if(confirm == 2) {
		    System.out.println("Your purchase has been cancelled.");
		    System.out.println("Please refer to customer service for more information.");
		    System.out.println("Hope to see you next time !");
		    }
		    
		    
		    
		    
		    
			scan.close(); 
			
			
			
			
			
			
			
			
			
			
		

	}

}
