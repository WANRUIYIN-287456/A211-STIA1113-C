package SelfProgramming;
import java.util.Scanner;

public class Example11 {
// SENTINEL CONTROLLED LOOP
// DO NOT KNOW EXACTLY HOW MANY TIMES IT WILL LOOP
// STOP LOOPING WHEN SPECIAL OR SENTINEL VALUE IS INPUT
	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner input = new Scanner(System.in);
         System.out.print("Enter an Integer, or -1 to stop: ");
         int choice= input.nextInt();
         while (choice!=-1){
         System.out.println("INSIDE LOOPING");     
         System.out.print("Enter an Integer, or -1 to stop: ");
         choice= input.nextInt(); 
         }
		 System.out.println("Sentinel value detected. Good Bye.");
		 }

	}
