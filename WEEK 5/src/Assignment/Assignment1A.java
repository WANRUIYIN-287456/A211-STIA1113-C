package Assignment;
import java.util.Scanner;
public class Assignment1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter the number of items : ");
	int item = scan.nextInt();
	// To print out the input of number of items bought
	System.out.println("Please put 0 if it is not relevant.");
	System.out.print("Enter the price of first item             : RM");
	double price1 = scan.nextDouble();
	System.out.println("Please enter the quantity of first item : ");
	int quantity1 = scan.nextInt();
	System.out.print("Enter the price of second item             : RM");
	double price2 = scan.nextDouble();
	System.out.println("Please enter the quantity of second item : ");
	int quantity2 = scan.nextInt();
	System.out.print("Enter the price of third item             : RM");
	double price3 = scan.nextDouble();
	System.out.println("Please enter the quantity of third item : ");
	int quantity3 = scan.nextInt();
	// To print the price and quantity of each items.
	
	//calculation
	double totalPrice = (double) price1*quantity1 + price2*quantity2 + price3*quantity3;
	TotalPrice(totalPrice);

	}
	public static void TotalPrice(double totalPrice){
        if (totalPrice >100){
        System.out.println("Congratulations, you are entitled for 20% discount. ");
        double discountPrice1 = totalPrice * 20 / 100;
        double payPrice1 = totalPrice * 80 / 100;
        // To print out the total price before discount, discount received and amount that need to be paid for total price more than 100
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
     // To print out the total price before discount, discount received and amount that need to be paid for total price less than 100
        System.out.print("The total price before discount       : RM");
        System.out.printf("%.2f%n", totalPrice);
        System.out.println("The discount recieved is 10%.");
        System.out.print("The discount price                    : RM");
        System.out.printf("%.2f%n", discountPrice2);
        System.out.print("The total amount that need to be paid : RM");
        System.out.printf("%.2f%n", payPrice2);        
        }
}
	
}
