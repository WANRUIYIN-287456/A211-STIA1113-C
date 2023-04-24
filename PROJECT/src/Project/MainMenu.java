package Project;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);	
		
        String name;
		int conService;
		
		System.out.println("Welcome to LS Mall!");
		System.out.println("Good day! How could we address you?"); 
		name = scan.nextLine();
		System.out.println("Hi " + name +", please input '1' to proceed.");   
		conService = scan.nextInt();
				
		while (conService == 1) {  
			System.out.println("Please enter 1-7 to choose the service provided.");
			System.out.println("------------------------------------------------");
			System.out.println("\t1. WATCHES" + "\n\t2. SHOES" + "\n\t3. HANDBAGS" + "\n\t4. GARDEN" +
			                  "\n\t5. CAMERA" + "\n\t6. CLOTHES" + "\n\t7. INTERIOR DESIGN");
			System.out.println("------------------------------------------------");
			int lifestyle = scan.nextInt();
		 if (lifestyle == 1){
        	//WATCHES
        	Watches w = new Watches();
        	w.main(args);
		 }
        else if(lifestyle == 2){
        	//SHOES
        	Shoes s = new Shoes();
        	s.main(args);
		 }
        else if(lifestyle == 3){
        	//HANDBAGS
        	Handbags h = new Handbags();
        	h.main(args);
		 }
        else if(lifestyle == 4){
        	//GARDEN
        	Garden g = new Garden();
        	g.main(args);
        }
        else if(lifestyle == 5){
        	//CAMERA
        	Camera c = new Camera();
        	c.main(args);
        }
        else if(lifestyle == 6){
        	//CLOTHES
        	Clothes cl = new Clothes();
        	cl.main(args);
        }    
        else if(lifestyle == 7){
        	//INTERIOR DESIGN
        	InteriorDesign id = new InteriorDesign();
        	id.main(args);
        }       
        else {
            System.out.println("Please try again.");
            System.out.println("Please input '1' to proceed.");   
    		conService = scan.nextInt();
	}
		 System.out.println();
		 System.out.println("Are you interested in continue with other shops? Please input '1' to continue or any other integers to stop.");
		 conService = scan.nextInt();
}
		
		if (conService != 1)
	    System.out.println("Thank you for visiting us. See you next time.");
		
		
		scan.close();	
	}
	
	
}
