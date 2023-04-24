package SelfProgramming;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		 do {	
			   if ((i % 2) == 0)
				   System.out.println("i is " + i + " and i%2 is " + i%2 + ".");
			   else 
				   System.out.println("i is " + i + " and i%2 is " + i%2 + ". Not equal to 0.");
			       i++;
		    } while(i<10);
	}

}
