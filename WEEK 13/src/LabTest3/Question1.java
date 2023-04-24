package LabTest3;

import java.util.Arrays;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner (System.in);
		  String [] item = new String [5];
		  Input (item);
		
		 unique_array(item);
		 Count (item);
	}


	public static void Input (String [] i) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please input 5 words (String).");
		for (int q = 0; q < i.length;q++)  
		i[q] = scan.nextLine();
	}
	
	   static void unique_array(String[] my_array)
	    {
	        System.out.println("Original Array : ");
	         
	        for (int i = 0; i < my_array.length; i++)
	        {
	            System.out.print(my_array[i]+"\t");
	        }
	         
	        //Assuming all elements in input array are unique
	         
	        int no_unique_elements = my_array.length;
	         
	        //Comparing each element with all other elements
	         
	        for (int i = 0; i < no_unique_elements; i++) 
	        {
	            for (int j = i+1; j < no_unique_elements; j++)
	            {
	                //If any two elements are found equal
	                 
	                if(my_array[i] == my_array[j])
	                {
	                    //Replace duplicate element with last unique element
	                     
	                    my_array[j] = "0";
	                }
	            }
	        }
	         
	        //Copying only unique elements of my_array into array1
	         
	       String[] array1 = Arrays.copyOf(my_array, no_unique_elements);
	         
	        //Printing arrayWithoutDuplicates
	         
	        System.out.println();
	         
	        System.out.println("Array with unique values : ");
	         
	        for (int i = 0; i < array1.length; i++)
	        {
	            System.out.print(array1[i]+"\t");
	        }
	         
	        System.out.println();
	
	    }
	
	public static void Count (String [] i) {
		for (int q = 0; q < i.length;q++)  
	   System.out.println(i[q] + ", " + i[q].length());
	}
	
	
	
}