package MyMethod;

import java.util.Scanner;

public class passingParameter {

	public static void main(String[] args) {

//0) MAIN
		 Scanner scan = new Scanner (System.in);
		 int num[] = new int[10];
		 int i;
		 //Read integers number and store in item[i]
		 System.out.println("Enter ten integers number:");
		 for(i = 0; i < num.length; i++)
		 num[i] = scan.nextInt();
        
	    System.out.println("\nThe number of students:  " + num.length);
	    printArray(num);
	    int sum = sumArray(num);
	    double average = sum/num.length;
	    int max = indexLargestElement(num);

	    System.out.println("\nSum:  " + sum);
	    System.out.println("Average:  " + average);
	    System.out.println("Largest element: Element " + (max+1) + "\nLargestvalue : " + num[max]);
	    reverseOrder(num);
	    System.out.println("\nPlease enter search value.  " );
	    int searchValue = scan.nextInt();
	    int locate = search(num,searchValue) + 1;
	    System.out.println("The element is at : " + locate);
	   
	    System.out.println();
	    
	 }
	
//A) PRINTING ELEMENTS
	 public static void printArray(int[] number){
	   for (int index = 0; index < number.length; index++) {
		System.out.print("The marks of student "+ (index+1) +" is " );    
		System.out.println( number[index] + ".");  
	   }
	}

//B) SUM OF ELEMENTS	 
	 public static int sumArray(int[] number)
	 {
	        int index;
	        int sum = 0;
	        for (index = 0; index < number.length; index++)
	 	   sum = sum + number[index];
	        return sum;
	 }

//C) LARGEST ELEMENT
	 public static int indexLargestElement(int[] number)
	 {
	          int index;
	          int maxIndex = 0;
	          for (index = 1; index < number.length; index++)
	  	    if(number[maxIndex] < number[index])
	                     maxIndex = index;
	           return maxIndex;
	 } 	 
 
//D) REVERSE ITEM
	 public static void reverseOrder(int [] number){	
		   //Print the output in reverse order are:");
		   System.out.println("\nThe numbers in reverse order are:");
			for(int i = number.length-1; i >= 0; i--)
			  System.out.println(number[i]);
	 }
	 
//E) SEARCH VALUE 
	 public static int search (int[ ] number, int searchValue){
		   int location =0;
		   for (int i=0; i <number.length; i++) 
		      if(number[i] == searchValue)
		      location = i;
		   return location;
		}

	 
	 
}
