package QUIZ3;
import java.util.Arrays;   
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner (System.in);
		 int [] item = new int [5];
		 int choose;
		  System.out.println("Please enter integer 1-4.");
          System.out.println("1. Accept elements of an array");
          System.out.println("2. Display elements of an array");
          System.out.println("3. Search the element within array given by the user");
          System.out.println("4. Sort the array by using any sort method");
        
         choose = scan.nextInt();
         Input (item);
      
          switch (choose){
              case 1:
            	  Input (item);
                  break;
              case 2:
            	  for (int m = 0; m <item.length;m++)  
            			Print((m+1),item[m]);
            	  break;                
              case 3:
                  System.out.print("Enter the number you want to search. ");
                  System.out.println("Please input the location of integer you want to search. (0-4)");
          		int find = scan.nextInt();
                 	 
          		Find(item, find);
                  break;
              case 4:
            		Sort(item) ;
                  break;
              default :
                System.out.println("Please try again.");
          }
		
		
		
		
		
	
		
	}

	public static void Input (int [] i) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please input 5 integers.");
		for (int q = 0; q < i.length;q++)  
		i[q] = scan.nextInt();
	}
	
	public static void Print (int s, int t) {

	     System.out.println("Integer " + s + ": " + t);
	}
	
	
		public static void Find(int[ ] num, int searchValue) {
			  for (int j=0; j < num.length; j++) {
				 if( j == searchValue) {
					  System.out.println("The search value is " + num[j]);
					  break;
				 }
			  }	
			 if(searchValue > 4 || searchValue < 0) {
				  System.out.println("The search value is not found."); 
		}
		}
		
		public static void Sort (int[ ] z) {
			Arrays.sort(z);  
			System.out.println("Elements of array sorted in ascending order: ");  
			for (int y = 0; y < z.length; y++)   
			{       
			System.out.println(z[y]);   
			}   
		}
		
		
		
	}


