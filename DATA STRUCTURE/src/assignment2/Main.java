//WAN RUI YIN 287456_ A212 STIA2024 (A) ASSIGNMENT 2
package assignment2;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String matricNo = null;
	  	Student newStudent = new Student();
		StudentList studentList = new StudentList();
	   
        int choice = choice();
        while(choice != 0){
            if(choice == 1){
            	studentList.inputStudentInfo();
            }
            else if(choice == 2){
            	studentList.displayStudentInfo();
            }
            else if(choice == 3){
            	matricNo = newStudent.SearchStudentInfo();
            	studentList.searchStudentInfo(matricNo);
            }
            else if(choice == 4){
            	matricNo = newStudent.SearchStudentInfo();
                studentList.updateStudentInfo(matricNo);
            }
      
            choice = choice();
        }
    }
    
    public static int choice(){
   	    int choice =0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n::::::::::::::::::::::::::MENU:::::::::::::::::::::::::::");
        System.out.println("1. Add Student Information");
        System.out.println("2. Display Student Information");
        System.out.println("3. Search Student Information");
        System.out.println("4. Update Student Information");
        System.out.println("0. EXIT");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.print("Your choice : ");
        choice = scan.nextInt();
        while (choice <0 || choice >4) {
        	 System.out.print("Your choice : ");
             choice = scan.nextInt();
        }
        return choice;

	}

}
