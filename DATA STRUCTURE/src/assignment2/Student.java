//WAN RUI YIN 287456_ A212 STIA2024 (A) ASSIGNMENT 2
package assignment2;

import java.util.Scanner;

public class Student {
	 
	private String name;
    private String matricNo;
    private String inasis;
    private String handphoneNo;
    private int currentSem;
    private String programme;
    private String college;
    
    public Student(){
      
    }
    
    public Student(String nm, String mNo, String in, String hpNo, int sem, String prog, String coll){
        this.name = nm;
        this.matricNo = mNo;
        this.inasis = in;
        this.handphoneNo = hpNo;
        this.currentSem = sem;
        this.programme = prog;
        this.college = coll;
    }
   
    public void DisplayStudentInfo(){
         System.out.printf("%-20s%-18s%-10s%-23s%-13s%-15s%-15s%n", name, matricNo,currentSem,programme,
        		           college,inasis,handphoneNo);
    }
    
    public String SearchStudentInfo (){
    Scanner scan = new Scanner(System.in);
    	System.out.print("Enter tht matric number of student that you would like to search: ");
   	      matricNo = scan.nextLine();
   	      return matricNo;
    }

     public void UpdateStudentInfo (){
     Scanner scan = new Scanner(System.in);	    	        
    	System.out.println("Update Student Info\n");
    	        
    	System.out.print("Update name             : ");
    	 name = scan.nextLine();
    	System.out.print("Update matric number    : ");
  	     matricNo = scan.nextLine();
        System.out.print("Update inasis           : ");
    	 inasis = scan.nextLine();
    	System.out.print("Update current semester : ");
    	 currentSem = scan.nextInt();
    	System.out.print("Update programme        : ");
    	 programme = scan.next() +scan.nextLine();
        System.out.print("Update college          : ");
    	 college = scan.nextLine();
    	System.out.print("Update handphone number : ");
    	 handphoneNo = scan.nextLine();
    	 
     }
     
 //ACCESSORS AND MUTATORS
    public void setname( String nm){
        this.name = nm;
    }
    
    public void setmatricNo( String mNo){
        this.matricNo = mNo;
    }
    
    public void setinasis( String in){
        this.inasis = in;
    }
    
    public void sethandphoneNo( String hpNo){
        this.handphoneNo = hpNo;
    }
    
    public void setcurrentSem( int sem){
        this.currentSem = sem;
    }
    
    public void setprogramme( String prog){
        this.programme = prog;
    }
    
    public void setcollege( String coll){
        this.college = coll;
    }
    
    public String getname(){
        return name;
    }
    
     public String getmatricNo(){
        return matricNo;
    } 
     
     public String getinasis(){
        return inasis;
    }
     
     public String gethandphoneNo(){
        return handphoneNo;
    }
     
      public int getcurrentSem(){
        return currentSem;
    }
     
    public String getprogramme(){
        return programme;
    }
    
    public String getcollege(){
        return college;
    }

}
