package MyArray;
import java.util.Scanner;
public class ArrayExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		The variable list1 and list2 are reference arrays that each have 5 elements. 
		Write code that copies the values in list1 to list2. Values in list1 are input 
		by user.
		
		*/
		
		Scanner scan = new Scanner (System.in);
		double[] list1 = new double[5];
		double[] list2 = new double[5];
		int index;
		list1 = list2;
		
		System.out.println("Please input 5 array elements.");
		for (index = 0; index < list1.length;index++)   
		list1[index] = scan.nextDouble();
		System.out.println();
		
		for (index = 0; index <list1.length;index++)
		System.out.println("List1 : " + list1[index]);
		System.out.println();
		
		for (index = 0; index <list2.length;index++)
		System.out.println("List2 : " + list2[index]);
		
		
		
	}

}
