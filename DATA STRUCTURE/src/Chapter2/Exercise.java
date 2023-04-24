package Chapter2;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	

    System.out.println("Please input integer n."); 
   	int n = scan.nextInt();
	Recursive(n);  
	 
	 if(n==0 || n==1)
	 System.out.println(1);  
	 else
	 System.out.println(n);    
  }

	public static int Recursive (int n) {
		
	 //f(n)==1, if n=o or n=1
    if(n==0 || n==1)
    	n =1;
    
    //f(n)=f(n-1) + 2*f(n-2), if n>1
    else if(n>1)
     n = n-1 + 2 *(n-2);
    	
	  return n;
}
	
}
