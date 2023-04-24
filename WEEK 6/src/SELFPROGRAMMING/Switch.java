package SELFPROGRAMMING;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
	    System.out.println("What month is your birthday in? ");
	    int month = scan.nextInt();
	    switch (month) {
	      case 1:
	        System.out.println("Your birthday is in January. ");
	        break;
	      case 2:
	        System.out.println("Your birthday is in February. ");
	        break;
	      case 3:
	        System.out.println("Your birthday is in March. ");
	        break;
	      case 4:
	        System.out.println("Your birthday is in April. ");
	        break;
	      case 5:
	        System.out.println("Your birthday is in May. ");
	        break;
	      case 6:
	        System.out.println("Your birthday is in June. ");
	        break;
	      case 7:
	        System.out.println("Your birthday is in July. ");
	        break;
	      case 8:
		    System.out.println("Your birthday is in August. ");
		    break;
	      case 9:
		    System.out.println("Your birthday is in September. ");
		    break;
	      case 10:
		    System.out.println("Your birthday is in October. ");
		    break;
	      case 11:
		    System.out.println("Your birthday is in November. ");
		    break;
	      case 12:
		    System.out.println("Your birthday is in December. ");
		    break;
	}
	}

}
