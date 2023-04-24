package SelfProgramming;
import java.util.Scanner;
public class RelationalLogicOpTest2 {

	public static void main(String[] args) {
		
/*NOTES : 1. RETURN TRUE IF x IS BETWEEN 0 AND 100 (INCLUSIVE)
		      (x >= 0) && (x <= 100)
		  2. RETURN TRUE IF x IS OUTSIDE 0 AND 100 (INCLUSIVE)
		      (x <= 0) || (x >= 100)
		      OR
		      !(x > 0) && (x < 100)
		  3. RETURN TRUE IF YEAR IS LEAP YEAR
		      (year % 4 == 0)
		*/
		
//EXERCISE : GIVEN THE YEAR, MONTH(1-12) AND DAY (1-31),WRITE A BOOLEAN EXPRESSION
//           WHICH RETURNS DATES BEFORE OCTOBER 1582. 
		Scanner scan = new Scanner (System.in);
		System.out.println("Please insert a day. ");
		int day = scan.nextInt();
		System.out.println("Please insert a month. ");
		int month = scan.nextInt();
		System.out.println("Please insert a year. ");
		int year = scan.nextInt();
		System.out.println("Your input date is : " + day + "/" + month + "/" + year);

        System.out.println((year == 1582 && month<=10 && day<=15) || 
		(year < 1582 && (month>=1 && month<=12) && (day>=1 && day<=31)));
        System.out.println("Your input date is before or on 15 October 1582.");

//EXERCISE 2
        double d1 = 2.2 + 4.4;
        double d2 = 6.6;
        int i1    = 2 + 4;
        int i2    = 6;
        String s1  = "Azman";
        String s2  = "Azman";
        
        
        System.out.println(d1 == d2); //false
        System.out.println(i1 == i2); //true
        System.out.println(s1 == s2); //true
        
        
	}

}
