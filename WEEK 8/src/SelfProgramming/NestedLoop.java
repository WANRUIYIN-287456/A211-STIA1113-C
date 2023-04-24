package SelfProgramming;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
		 int j;
		 
		 for (j=2;j<=12;j=j+2) {
			 System.out.println("The even number of a month is " + j);
			 
			 
			for (i=1;i<=30;i=i+2) {
				System.out.println("The odd number of a day in a month is " + i);
			}
			
		 }
		
		
	}

}
