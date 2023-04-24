package Chapter2;

import java.util.Scanner;

public class Q4b {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		
	   	recursiveFunc(3);
	}
	public static int recursiveFunc(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}
		else
		{
			return recursiveFunc(n-1) + 2*recursiveFunc(n-2);
		}
	}

}
