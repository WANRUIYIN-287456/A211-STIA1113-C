//WAN RUI YIN 287456_ A212 STIA2024 (A) ASSIGNMENT 2
package assignment2;

import java.util.*;

public class StudentList {
	private List<Student> newstudentList;
    int num;
    
	public StudentList(){
	        newstudentList = new LinkedList<Student>();
	}
	  
	public void inputStudentInfo() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input Student Info\n");
		System.out.print("Name             : ");
		String name = scan.nextLine();
		System.out.print("Matric number    : ");
		String matricNo = scan.nextLine();
		System.out.print("Inasis           : ");
		String inasis = scan.nextLine();
		System.out.print("Current semester : ");
		int currentSem = scan.nextInt();
		System.out.print("Programme        : ");
		String programme = scan.next() + scan.nextLine();
		System.out.print("College          : ");
		String college = scan.nextLine();
		System.out.print("Handphone number : ");
		String handphoneNo = scan.nextLine();

		Student newStudent = new Student(name, matricNo, inasis, handphoneNo, currentSem, programme, college);
		newstudentList.add(newStudent);
	}

	 
	public void displayStudentInfo(){
	   	System.out.println("______________________________________________________________________________________________________________________\n");
	    System.out.printf( "%-23s%-15s%-15s%-20s%-15s%-15s%-15s%n%n","   Student Name", "Matric No", "Semester", "Programme" 
	            , "College" , "Inasis" , "Phone Number");
	    for(int i = 0; i < newstudentList.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            newstudentList.get(i).DisplayStudentInfo();
            System.out.println();

        }
	}
	
	public int searchIndex(String matricNo){
	       int index;
	        
	       for(index = 0; index < newstudentList.size(); index++){
	            if(newstudentList.get(index).getmatricNo().compareTo(matricNo) == 0)
	                return index;                
	       }
		return -1;
	 }	
	
	 public void updateStudentInfo(String matricNo){
	    int index = searchIndex(matricNo);
	     
	    newstudentList.get(index).UpdateStudentInfo();
	 }
	 
	 public void searchStudentInfo(String matricNo){
		    int index = searchIndex(matricNo);
		   	System.out.println("______________________________________________________________________________________________________________________\n");
		    System.out.printf( "%-23s%-15s%-15s%-20s%-15s%-15s%-15s%n%n","Student Name", "Matric No", "Semester", "Programme" 
		            , "College" , "Inasis" , "Phone Number"); 
		    System.out.print((index+1) + ". ");
		    newstudentList.get(index).DisplayStudentInfo();
		 }
	 
}
	 

