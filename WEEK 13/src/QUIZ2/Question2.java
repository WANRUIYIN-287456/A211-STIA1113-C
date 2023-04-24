package QUIZ2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please input the number of items. ");
		int num_items = scan.nextInt();

		int item[] = new int[num_items];

		System.out.print("Please input value of item. ");
		for(int i=0;i<item.length;i++) {
			item[i] = scan.nextInt();
		}

		for(int i = 0; i < num_items; i++)
		{
			System.out.print(i + ":");
			for(int index2 = 0; index2 < item[i]; index2++)
			{
				System.out.print("*");
			}
			System.out.print("(" + item[i] + ")");
			System.out.println();

		}
		 
		 
	}

	
	}

