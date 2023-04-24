package Project;

import java.util.Scanner;

public class Door {
    Scanner scan = new Scanner(System.in);
    protected double width;
    protected double height;
   
    
    public Door (double w, double h){
        width = w;
        height = h;
    }
    
    public void ShowDoor(){
      System.out.print("width = "+ width + " height = " + height + "\n");  
    }
    
    public void EditDoor(){
        System.out.print("Enter door number to edit:"); 
        int j=scan.nextInt();
        System.out.print("Enter new width of door number "+ j + "  :"); 
        width=scan.nextDouble();
        System.out.print("Enter new height of door number "+ j + " :"); 
        height=scan.nextDouble();
    }
    
    public void setwidth( double w){
        width =w;
    }
    
    public void setheight( double h){
        height = h;
    }
    
    public double getwidth(){
        return width;
    }
    
    public double getheight(){
        return height;
    }
    
}
