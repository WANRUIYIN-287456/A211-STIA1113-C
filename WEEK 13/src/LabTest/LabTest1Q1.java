package LabTest;
import java.util.Scanner;

public class LabTest1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double totalPrice = 0;
		double sum =0;
		int item;
		System.out.println("The maximum number of item is 3.");
		System.out.print("Please enter the number of items        : ");
		 item = scan.nextInt();
		while(item >3 || item < 0) {
		System.out.println("The maximum number of item is 3.");
		System.out.print("Please re-enter the number of items     : ");
		 item = scan.nextInt();
		// To print out the input of number of items bought
		}
		
		for (int i = 1; i <= item ; i++) {
		
		System.out.print("Enter the price of item " + i + "               : RM");
		double price = scan.nextDouble();
		System.out.print("Please enter the quantity of item " + i + "     : ");
		int quantity = scan.nextInt();
		sum = (double) sum + (price * quantity);
		
		}
		
		System.out.println();
        totalPrice = sum;
		TotalPrice(totalPrice);

		}
	//TO PRINT DISCOUNT
		public static void TotalPrice(double totalPrice){
	        if (totalPrice >100){
	        System.out.println("Congratulations, you are entitled for 20% discount. ");
	        double discountPrice1 = totalPrice * 20 / 100;
	        double payPrice1 = totalPrice * 80 / 100;
	        
	        System.out.print("The total price before discount       : RM");
	        System.out.printf("%.2f%n", totalPrice);
	        System.out.println("The discount recieved is 20%.");
	        System.out.print("The discount price                    : RM");
	        System.out.printf("%.2f%n", discountPrice1);
	        System.out.print("The total amount that need to be paid : RM");
	        System.out.printf("%.2f%n", payPrice1);        
	        }
	        else {System.out.println("Congratulations, you are entitled for 10% discount. ");
	        double discountPrice2 = totalPrice * 10 / 100;
	        double payPrice2 = totalPrice * 90 / 100;
	        System.out.print("The total price before discount       : RM  ");
	        System.out.printf("%.2f%n", totalPrice);
	        System.out.println("The discount recieved is 10%.");
	        System.out.print("The discount price                    : RM  ");
	        System.out.printf("%.2f%n", discountPrice2);
	        System.out.print("The total amount that need to be paid : RM  ");
	        System.out.printf("%.2f%n", payPrice2);        
	        }
	}

}
