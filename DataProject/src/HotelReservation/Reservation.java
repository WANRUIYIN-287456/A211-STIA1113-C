package HotelReservation;

/*public class Reservation {
	private String client_special_request;

	private String client_destination;
	private String checkin_date;
	private String checkout_date;
	private String room_type ;
	private int room_quatity;
	public Reservation (String csr, String cdes, String ckindate, String ckoutdate, String rtype, int
	rquatity ){

	client_special_request= csr;
	client_destination= cdes;
	checkin_date = ckindate;
	checkout_date = ckoutdate;
	room_type = rtype;
	room_quatity = rquatity;
	}

	//setter and getter
	public void setclient_special_request(String csr){
		client_special_request= csr;
    }
	
	public void setclient_destination(String cdes){
		client_destination= cdes;
    }
	
	public void setcheckin_date(String ckindate){
		checkin_date = ckindate;
    }
	
	public void setcheckout_date(String ckoutdate){
		checkout_date = ckoutdate;
    }
	
	public void setroom_type(String rtype){
		room_type = rtype;
    }
	
	public void setroom_quatity(int rquatity){
		room_quatity = rquatity;
    }
	
	public String getclient_special_request(){
		return client_special_request;
    }
	
	public String getclient_destination(){
		return client_destination;
    }
	
	public String getcheckin_date(){
		return checkin_date;
    }
	
	public String getcheckout_date(){
		return checkout_date;
    }
	
	public String getroom_type(){
		return room_type;
    }
	
	public int getroom_quatity(){
		return room_quatity;
    }
	
}//end reservation class
*/

import java.util.Scanner;

public class Reservation {
    private String clientSpecialRequest;
    private String clientDestination;
    private String checkInDate;
    private String checkOutDate;
    private int roomQuantity;
    
    public Reservation(){
    
    }
    public Reservation(String clientSpecialRequest, String clientDestination, String checkInDate, String checkOutDate, int roomQuantity){
        this.clientSpecialRequest = clientSpecialRequest;
        this.clientDestination = clientDestination;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomQuantity = roomQuantity;
    }
    
    //getter
    public String getSpecialRequest(){
        return clientSpecialRequest;
    }
    public String getDestination(){
        return clientDestination;
    }
    public String getCheckInDate(){
        return checkInDate;
    }
    public String getCheckOutDate(){
        return checkOutDate;
    }
    public int getRoomQuantity(){
        return roomQuantity;
    }
    
    //setter
    public void setSpecialRequest(String specialRequest){
        clientSpecialRequest = specialRequest;
    }
    public void setDestination(String destination){
        clientDestination = destination;
    }
    public void setCheckInDate(String checkInDate){
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }
    public void setRoomQuantity(int roomQuantity){
        this.roomQuantity = roomQuantity;
    }
    
    public void addReservationInfo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Reservation Info");
        System.out.printf("%-42s: ","Enter your special request");
        clientSpecialRequest = scan.next() + scan.nextLine();
        System.out.printf("%-42s: ","Enter your destination");
        clientDestination = scan.next();
        System.out.printf("%-42s: ","Enter the check in date (in dd/mm/yy)");
        checkInDate = scan.next();
        System.out.printf("%-42s: ","Enter the check out date (in dd/mm/yy)");
        checkOutDate = scan.next();
        System.out.printf("%-42s: ","Enter the number of rooms booked");
        roomQuantity = scan.nextInt();
        
    }//end reservation method
    
    public void displayReservationInfo(){
        System.out.printf("%-20s%-15s%-15s%-15s%-15d", clientSpecialRequest,
                                                       clientDestination,
                                                       checkInDate,
                                                       checkOutDate,
                                                       roomQuantity);
    }
    
    public void updateReservationInfo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Update Reservation Info\n");
        
        System.out.print("Client Special Request correction: ");
        clientSpecialRequest = scan.next() + scan.nextLine();
        System.out.print("Destination correction : ");
        clientDestination = scan.next() + scan.nextLine();
        System.out.print("Check in Date correction : ");
        checkInDate = scan.next();
        System.out.print("Check out Date correction : ");
        checkOutDate = scan.next();
        System.out.print("Number of rooms booked correction : ");
        roomQuantity = scan.nextInt();
    }
    
    public void deleteReservationInfo(){
        clientSpecialRequest = "";
        clientDestination = "";
        checkInDate = "";
        checkOutDate = "";
        roomQuantity = 0;
    }
}
