package Lesson;

public class BlockStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double amount          = 500.00;
		double balance         = 1500.00;
		double balance1        = 0;
		double balance2        = 0;

		
		//single statement - balance=1500-500
		if  ((amount <= 1000.0) && (amount <= balance))  
	            balance = balance - amount;
	    System.out.println("1. Acct new balance = " + balance);
	        
	    //block statement - balance=1000-500 (not true)
	    if  ((amount <= 1000.0) && (amount <= balance)){   
	            balance = balance - amount;
	    System.out.println("2. Acct new balance = " + balance);
	        }
	 
	    //block statement - balance=1500-500 (true)
	    if((amount <= 1000.0) && (amount <= balance)){
        	balance = balance + 500;
        	 System.out.println("3. Acct new balance = " + balance);
        }
	    
	    
	    
	    
	    
	    
        // if only run this part below, can get same output
        //single statement - balance=1500-500
        if  ((amount <= 1000.0) && (amount <= balance))  
            balance1 = balance - amount;
        System.out.println("1. Acct new balance = " + balance1);
        
        //block statement - balance=1500-500
        if  ((amount <= 1000.0) && (amount <= balance)){   
            balance2 = balance - amount;
        System.out.println("2. Acct new balance = " + balance2);
        }
	}

}
