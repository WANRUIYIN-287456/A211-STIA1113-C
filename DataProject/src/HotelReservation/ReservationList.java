package HotelReservation;

import java.util.*;

public class ReservationList {
    private List<Client> clientListA, clientListB, clientListC;
    private List<Room> roomA, roomB, roomC;
    private List<Reservation> reservationListA, reservationListB, reservationListC;
    
    public ReservationList(){
        clientListA = new ArrayList<Client>();
        clientListB = new ArrayList<Client>();
        clientListC = new ArrayList<Client>();
        roomA = new ArrayList<Room>();
        roomB = new ArrayList<Room>();
        roomC = new ArrayList<Room>();
        reservationListA = new ArrayList<Reservation>();
        reservationListB = new ArrayList<Reservation>();
        reservationListC = new ArrayList<Reservation>();
    }
    
    
    
    public void addReservation(Client newClient, Room newRoom, Reservation newReservation){
        int index = findIndex(newRoom.getRoomID());
        
        if((newRoom.getRoomID().compareTo("100") >= 0)  &&  (newRoom.getRoomID().compareTo("200") < 0)){//ID of room A is [100,200) 
            for(int i = 0; i < newReservation.getRoomQuantity(); i++){
                if(clientListA.isEmpty() && roomA.isEmpty() && reservationListA.isEmpty()){
                    clientListA.add(newClient);
                    roomA.add(newRoom);
                    reservationListA.add(newReservation);
                }
                else{
                    clientListA.add(index,newClient);
                    roomA.add(index, newRoom);
                    reservationListA.add(index, newReservation);
                }
                newRoom.setRoomID(Integer.toString(Integer.parseInt(newRoom.getRoomID())+Room.roomNumA++));
                Room.countA++;
            }
        }//add in room A
        
        if((newRoom.getRoomID().compareTo("200") >= 0)  &&  (newRoom.getRoomID().compareTo("300") < 0)){
            for(int i = 0; i < newReservation.getRoomQuantity(); i++){                
                if(clientListB.isEmpty() && roomB.isEmpty() && reservationListB.isEmpty()){
                    clientListB.add(newClient);
                    roomB.add(newRoom);
                    reservationListB.add(newReservation);
                }
                else{
                    clientListB.add(index,newClient);
                    roomB.add(index, newRoom);
                    reservationListB.add(index, newReservation);
                }
                Room.countB++;
            }
        }//add in room B
        
        if((newRoom.getRoomID().compareTo("300") >= 0)  &&  (newRoom.getRoomID().compareTo("400") < 0)){
            for(int i = 0; i < newReservation.getRoomQuantity(); i++){                
                if(clientListC.isEmpty() && roomC.isEmpty() && reservationListC.isEmpty()){
                    clientListC.add(newClient);
                    roomC.add(newRoom);
                    reservationListC.add(newReservation);
                }
                else{
                    clientListC.add(index,newClient);
                    roomC.add(index, newRoom);
                    reservationListC.add(index, newReservation);
                }
                Room.countC++;
            }
        }//add in room C
    }//end addReservation method
    
    
    
    
    public void displayReservation(){
        System.out.printf("%-78s%-50s%-80s%n", "Client Information", 
                                               "Room Information", 
                                               "Reservation Information");
        System.out.printf("%-20s%-21s%-22s%-15s","Client's Name", 
                                                 "Client's IC/Passport",
                                                 "Client's Phone Number", 
                                                 "Client's Email");
        System.out.printf("%-10s%-8s%-12s%-20s","Room Name", 
                                                "Room ID", 
                                                "Room Price", 
                                                "Room Detail");
        System.out.printf("%-20s%-15s%-15s%-15s%-15s%n","Special Request",
                                                        "Destination",
                                                        "Check in Date",
                                                        "Check out Date",
                                                        "Room Quantity");
        
        System.out.println("Room A");
        for(int i = 0; i < clientListA.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListA.get(i).displayClientDetail();
            roomA.get(i).displayRoomInfo();
            reservationListA.get(i).displayReservationInfo();
            System.out.println();
        }
        
        System.out.println("Room B");
        for(int i = 0; i < clientListB.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListB.get(i).displayClientDetail();
            roomB.get(i).displayRoomInfo();
            reservationListB.get(i).displayReservationInfo();
            System.out.println();
        }
        
        System.out.println("Room C");
        for(int i = 0; i < clientListC.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListC.get(i).displayClientDetail();
            roomC.get(i).displayRoomInfo();
            reservationListC.get(i).displayReservationInfo();
            System.out.println();
        }
    }//end displayReservation
    
    
    public void updateReservation(String roomID){
        int index = searchIndex(roomID);
        
        if(roomID.compareTo("100") >= 0 && roomID.compareTo("200") < 0){
            clientListA.get(index).updateClientDetail();
            roomA.get(index).updateRoomInfo();
            reservationListA.get(index).updateReservationInfo();
        }
        if(roomID.compareTo("200") >= 0 && roomID.compareTo("300") < 0){
            clientListB.get(index).updateClientDetail();
            roomB.get(index).updateRoomInfo();
            reservationListB.get(index).updateReservationInfo();
        }
        if(roomID.compareTo("300") >= 0 && roomID.compareTo("400") < 0){
            clientListC.get(index).updateClientDetail();
            roomC.get(index).updateRoomInfo();
            reservationListC.get(index).updateReservationInfo();
        }
    }//end updateReservation
            
    public void deleteReservation(String roomID){
        int index = searchIndex(roomID);
        
        if(roomID.compareTo("100") >= 0 && roomID.compareTo("200") < 0){
            clientListA.get(index).deleteClientDetail();
            roomA.get(index).deleteRoomInfo();
            reservationListA.get(index).deleteReservationInfo();
        }
        
        if(roomID.compareTo("200") >= 0 && roomID.compareTo("300") < 0){
            clientListB.get(index).deleteClientDetail();
            roomB.get(index).deleteRoomInfo();
            reservationListB.get(index).deleteReservationInfo();
        }
        
        if(roomID.compareTo("300") >= 0 && roomID.compareTo("400") < 0){
            clientListC.get(index).deleteClientDetail();
            roomC.get(index).deleteRoomInfo();
            reservationListC.get(index).deleteReservationInfo();
        }
    }
    
    
    public int findIndex(String roomID){
        int index;
        
        if(roomID.compareTo("100") >= 0 && roomID.compareTo("200") < 0){
            for(index = 0; index < roomA.size(); index++){
                if(roomA.get(index).getRoomID().compareTo(roomID) > 0){
                    return index;
                }
            }
            return index;
        }//ROOM A
        
        else if(roomID.compareTo("200") >= 0 && roomID.compareTo("300") < 0){
            for(index = 0; index < roomB.size(); index++){
                if(roomB.get(index).getRoomID().compareTo(roomID) > 0){
                    return index;
                }
            }
            return index;
        }//ROOM B
        
        else if(roomID.compareTo("300") >= 0 && roomID.compareTo("400") < 0){
            for(index = 0; index < roomC.size(); index++){
                if(roomC.get(index).getRoomID().compareTo(roomID) > 0){
                    return index;
                }
            }
            return index;
        }//ROOM C
        
        return -1;//Index_Not_Found__ERROR
    }//end find Index
    
    public int searchIndex(String roomID){
        int index;
        
        if(roomID.compareTo("100") >= 0 && roomID.compareTo("200") < 0){
            for(index = 0; index < roomA.size(); index++){
                if(roomA.get(index).getRoomID().compareTo(roomID) == 0){
                    return index;
                }
            }
        }//ROOM A
        
        else if(roomID.compareTo("200") >= 0 && roomID.compareTo("300") < 0){
            for(index = 0; index < roomB.size(); index++){
                if(roomB.get(index).getRoomID().compareTo(roomID) == 0){
                    return index;
                }
            }
        }//ROOM B
        
        else if(roomID.compareTo("300") >= 0 && roomID.compareTo("400") < 0){
            for(index = 0; index < roomC.size(); index++){
                if(roomC.get(index).getRoomID().compareTo(roomID) == 0){
                    return index;
                }
            }
        }//ROOM C
        
        return -1;////Index_Not_Found__ERROR
    }
}