package AssignmentOne;

import java.util.Scanner;



import java.util.Arrays;

	public class ArraysToMethod {
        public int max(int [] array) {
             int max = 0;
             for(int i=0; i<array.length; i++ ) {
                if(array[i]>max) {
                   max = array[i];
                }
             }
             return max;
          }
          public int min(int [] array) {
             int min = array[0];
          
             for(int i = 0; i<array.length; i++ ) {
                if(array[i]<min) {
                   min = array[i];
                }
             }
             return min;
          }
          public static void main(String args[]) {
             Scanner sc = new Scanner(System.in);
             OnlineShopping o = new OnlineShopping();
         	 o.main(args);
             System.out.println("Welcome Dear customer, Thank you very much for choosing our shop advisory!");
             System.out.println("Dear customer, we will recommend the most suitable clothes package for you!");
             System.out.println("We want to thank you for trusting our shop advisory.");
             System.out.println();
             System.out.println("Now, let's start the system.");
             System.out.println("Enter the number of clothes package price that are going to be compared:");
             int size = sc.nextInt();
             int[] myArray = new int[size];
             System.out.println("Enter the price for each of the clothes package:");
             for(int i=0; i<size; i++) {
                myArray[i] = sc.nextInt();
             }
             ArraysToMethod m = new ArraysToMethod();
             System.out.println("The most expensive clothes package price : " + m.max(myArray));
             System.out.println("The most economic clothes package price : " + m.min(myArray));
             System.out.println("Customer you're advised to choose according to your own capability!");
             System.out.println("**********************");
             System.out.println("Choose Package A! If you're looking for some casual clothes.");
             System.out.println("Choose Package B! If you're looking for some comfortable clothes.");
             System.out.println("Choose the Package C! If you are a female customer and ready for some formal places.");
             System.out.println("Choose the Package D! If you are a male customer and ready for some formal places.");
             System.out.println("**********************");
             System.out.println("Once again thank you for choosing our shop advisory!");
             System.out.println("We hope that it will help you and see you next time!");
          
       
   }
}
