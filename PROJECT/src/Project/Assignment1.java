package Project;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	 
	    int num=0;
	    int i=0,j;
	    while (num<1 || num>10) {
	    System.out.print("Enter number of doors object that you want to create (1-10) : ");
	    num = scan.nextInt();
	    }
	    /*double door[] = new double[i*2];
	    
	    for (j = 0; j < i; j++){
	    	  System.out.print("Door " + j + " :width( 80cm-100cm)  =");
	    	  door[i]= scan.nextDouble(); 
	    	  if(door[i] <80 || door[i]>100) {
	          System.out.print("\ntERROR");  
	          j=i;
	    	  }
	    	  else {
	    	  System.out.print("\theight(170cm-210cm) =");
	    	  door[i]= scan.nextDouble(); 
	    	  if(door[i] <170 || door[i]>210) {
		          System.out.print("\nERROR");
		          j=i;
		      }
	    	  }
	    } 
	    */
	    Door [] door = new Door[num];
	    
	    double width[] = new double[num];
	    double height[] = new double[num];
	    
	    for (i = 0; i < num; i++){
		System.out.print("Door " + i + " :width( 80cm-100cm)  =");
		width[i]= scan.nextDouble(); 
		while(width[i]<80 || width[i]>100) {
	            System.out.print("\nERROR");  
		    System.out.print("\n\twidth( 80cm-100cm)  =");
	            width[i]= scan.nextDouble();
		 }
	       
		System.out.print("\theight(170cm-210cm) =");
		height[i]= scan.nextDouble(); 
	        while (height[i]<170 || height[i]>210) {
	            System.out.print("\nERROR");
	            System.out.print("\n\theight(170cm-210cm) =");
	            height[i]= scan.nextDouble(); 
		}
	        door[i] = new Door(width[i],height[i]);
	    }

	    System.out.print("Enter door number to edit:"); 
        j=scan.nextInt();
        System.out.print("Enter new width of door number "+ j + "  :"); 
        double w =scan.nextDouble();
        System.out.print("Enter new height of door number "+ j + " :"); 
        double h=scan.nextDouble();
       
	      door[j].setwidth(w);
	      door[j].setheight(h);
	      
	      for(i=0; i<door.length; i++){
	          System.out.print("Door " + i +" :");
	          door[i].ShowDoor();
	      }
}
}
