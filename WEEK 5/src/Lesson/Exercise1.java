package Lesson;
import java.util.Scanner;
public class Exercise1 {

	/*	Markah penuh 100
	Guna scanner input:
	    Masukkan dua subject dan markah
	    Nyatakan subjek yang mempunyai markah lebih besar daripada 50, calon di kira lulus
	    Nyatakan subjek mana yang lebih besar markah dan mana yang lebih kecil  
	Kira purata markah. Markah 80-100 adalah Gred A, markah 60-79 adalah Gred B dan 
	markah 50-59 adalah gred C. Lain2 markah adalah Gagal
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner (System.in);	
    final int fullmarks = 100;
    char grade = 0;	

    //GET THE INPUT FROM USER ABOUT SUBJECTS AND MARKS
    System.out.println("Please insert subject 1. ");
	String subject1 = scan.nextLine();
	System.out.println("Please insert subject 2. ");
	String subject2 = scan.nextLine();
	System.out.println("Please insert your mark for subject 1. ");
	int mark1 = scan.nextInt();
	System.out.println("Please insert your mark for subject 2. ");
	int mark2 = scan.nextInt();
	
	// CHECK IF USER PASSES FIRST SUBJECT 
	if(mark1 > 50 && mark1 <= fullmarks) {
	System.out.println("Congratulations! You have passed " + subject1 + " exam.");	
	}
	else 
	System.out.println("You have failed " + subject1 + " exam.");
	
	// CHECK IF USER PASSES SECOND SUBJECT 
	if(mark2 > 50 && mark2 <= fullmarks) {
	System.out.println("Congratulations! You have passed " + subject2 + " exam.");	
	}
	else 
	System.out.println("You have failed " + subject2 + " exam.");
	
	//CHECK IF USER PASSES BOTH SUBJECT
	if((mark1 > 50 && mark1 <= fullmarks) && (mark2 > 50 && mark2 <= fullmarks))
	System.out.println("Congratulations! You have passed both subjects.");		
	else if((mark1 > 0 && mark1 <= 50 && mark1 <= fullmarks) && (mark2 > 50 && mark2 <= fullmarks))
	System.out.println("You have passed " + subject2 + " only.");
	else if((mark1 > 50 && mark1 <= fullmarks) && (mark2 > 0 && mark2 <= 50 && mark2 <= fullmarks))
	System.out.println("You have passed " + subject1 + " only.");	
	
	// CHECK IF FIRST SUBJECT HAD THE HIGHER MARKS THAN SECOND SUBJECT OR VICE VERSA
	if(mark1>mark2) {
	System.out.println("You have got higher marks for " + subject1 + " than " + subject2 + ".");
	System.out.println(subject1 + " is easier than " + subject2 + ".");
	}
	else {
    System.out.println("You have got higher marks for " + subject2 + " than " + subject1 + ".");
    System.out.println(subject2 + " is easier than " + subject1 + ".");
	}
	
	//CALCULATION FOR AVERAGE MARKS
	double averagemarks = ( mark1 + mark2 )/2;
	System.out.print("Your average mark is ");
	System.out.printf("%.2f", averagemarks);
	System.out.println(".");
	
	//CHECK THE GRADE
     if (averagemarks >= 80 && averagemarks <= 100) {
	 grade = 'A';
	 System.out.println("Your grade is " + grade + ". You have passed this exam. ");
     }
	    
     else if (averagemarks >= 60 && averagemarks < 80) {
	 grade = 'B';
	 System.out.println("Your grade is " + grade + ". You have passed this exam. ");
	 }
     
     else if (averagemarks>= 50 && averagemarks < 60) {
	 grade = 'C';
	 System.out.println("Your grade is " + grade + ". You have passed this exam. ");
     }
     else {    
     grade = 'F';
     System.out.println("Your grade is " + grade + ". You have failed this exam. ");
     }

   
	}

}
