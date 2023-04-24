package SelfProgramming;
import java.util.Scanner;
public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
		int game;
		System.out.println("INSTRUCTION : Miss TS, the TS Watch AI assistant will pick a random number as 'X' from 1-50.");
		System.out.println("You will need to guess 'X' correctly in order to win the game. ");
		System.out.println("For every wrong guess, you will be given a clue about 'X'.");
		System.out.println();
		System.out.println("Are you ready? The game starts now. Please enter 1 to continue.");
		game=scan.nextInt();
		while(game!=1) {
			System.out.println("Are you ready? The game starts now. Please enter 1 to continue.");
			game=scan.nextInt();
		}

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("              GUESS THE 'X'     ");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		int i;
		
		int number = (int)(Math.random() * 51);
		int guess = 0;
		 
			
			while(number != guess) {
				 for (i=5; i>=1; i--) {
			System.out.println("You have "+i+ " chance(s) from now.     ");
			System.out.println("Please enter a random number from 1-50.     ");
		    guess = scan.nextInt();
		   
		    if(number == guess) {
		      System.out.println("Congratulations! You win the game.");
		      
		    break;
		    }else if( guess > number) {
		    System.out.println("Too high");
		    }else if( guess < number) {
		      System.out.println("Too low");     
		    }
		
		    if(i==1) {
				System.out.println("Oops, you lost. Nevermind, good luck next time.");
			
			 break;
		    }
			}
		 break;
		 }
	scan.close();
	}
		
			
		
	}




