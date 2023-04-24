package HotelReservation;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] arg){
    	Scanner scan = new Scanner(System.in);
        ReservationList reservationList = new ReservationList();
        int person =0;
        
        person = Person();
        Login(person);
        
        int choice = choice();
        while(choice != 0){
            if(choice == 1){
                Client newClient = new Client();
                newClient.addClient();
                
                Room newRoom = new Room();
                newRoom.addRoomInfo();
                
                Reservation newReservation = new Reservation();
                newReservation.addReservationInfo();
                
                reservationList.addReservation(newClient, newRoom, newReservation);
            }
            else if(choice == 2){
                reservationList.displayReservation();
            }
            else if(choice == 3){
                System.out.print("Enter the roomID that you want to update: ");
                String roomID = scan.next();
                
                reservationList.updateReservation(roomID);
            }
            
            choice = choice();
        }
    }
    
    public static int choice(){
    	Scanner scan = new Scanner(System.in);       
        System.out.println("\n::::::::::::::::::::::::::MENU:::::::::::::::::::::::::::");
        System.out.println("1. Add reservation");
        System.out.println("2. Display reservation");
        System.out.println("3. Update data");
        System.out.println("4. Delete data");
        System.out.println("0. EXIT");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.print("Your choice : ");
        int choice =scan.nextInt();
        
        return choice;
    }
    
    public static int Person(){
    	Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please enter 1 to continue as client or 2 as hotel worker.");    
        System.out.print("Your choice : ");
        int person = scan.nextInt();
        
        return person;
    }
    
    public static void Login(int person){
    	Scanner scan = new Scanner(System.in);
    	
    	if(person ==1) 
    		System.out.println("Dear customer, how can we help you?");    	
        else if(person == 2) {
            System.out.println("Hi, please enter your staff id to continue the access.");    
        	String staffid = scan.nextLine();
        } 
        else
        	System.out.println("Please re-enter your choice. Client:1, Worker:2"); 
    }
}
