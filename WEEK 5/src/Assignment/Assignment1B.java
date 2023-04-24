package Assignment;
import java.util.Scanner;
public class Assignment1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Say your brother wants to buy a used car for $5,000 and has only $2,000 for the down payment.
		He hits you up for a loan for the remaining $3,000.
		If the length of the loan is five years and he’s paying you simple interest of 3.5 percent per month to borrow the additional $3,000,
		Calculate the sum of interest, monthly payment and total of payment.*/
		//loan =3000, simple interest = 3.5% per month, loan year = 5
		
		//To get the input of loan, monthly rate and loan year
		Scanner scan = new Scanner (System.in);
		System.out.println("Please input your monthly rate.");
		double rate1 = scan.nextDouble();
		System.out.println("Please input your total loan.");
		double loan = scan.nextDouble();
		System.out.println("Please input your loan year.");
		int loanYear = scan.nextInt();
		
		//calculation
		double interestPerMonth = loan * rate1 /100;
		double interestPerYear = interestPerMonth * 12;
		//interest per month * 12 months(a year)
		double totalInterest = interestPerYear * loanYear;
		//total interest for x years = interestPerYear * x (years)
		double monthlyPayment = ( loan / (loanYear*12)) + interestPerMonth;
		//monthly payment = total loan  / total months + monthly interest
		double totalPayment = monthlyPayment * loanYear * 12;
		//total payment = monthly payment * total months
		
		
		//Printing of sum of interest, monthly payment and total payment
		System.out.print("Sum of interest  : $");
		System.out.printf("%.2f%n", totalInterest);
		System.out.print("Monthly payment  : $");
		System.out.printf("%.2f%n", monthlyPayment);
		System.out.print("Total of payment : $");
		System.out.printf("%.2f%n", totalPayment);
	}

}
