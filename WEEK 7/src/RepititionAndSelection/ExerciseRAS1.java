package RepititionAndSelection;
import java.util.Scanner;
public class ExerciseRAS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		//RANDOM NUMBER *(STAR NOT MULTIPLY) 11 MEANS, SYSTEM WILL GIVE OUT ANY NUMBER 1-10 RANDOMLY
		int number = (int)(Math.random() * 101);
		int guess = -1;
		
		while(number != guess) {
		    System.out.println("Please enter an integer (0-100) : ");
		    guess = scan.nextInt();
		
		    if(number == guess)
		      System.out.println("Congratulations");
		    else if( guess > number)
		      System.out.println("Too high");
		    else
		      System.out.println("Too low");	
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
