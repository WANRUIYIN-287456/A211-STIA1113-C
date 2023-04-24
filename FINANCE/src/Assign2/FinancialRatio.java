package Assign2;

import java.util.Scanner;

public class FinancialRatio {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double ca =0,cl=0,i=0,s=0,ta=0,ni=0,te=0,tl=0;

		System.out.print("Enter inventory\t\t : RM ");
		i = scan.nextDouble();
		System.out.print("Enter current assets\t : RM ");
		ca = scan.nextDouble();
		System.out.print("Enter total assets\t : RM ");
		ta = scan.nextDouble();
		System.out.print("Enter total equity\t : RM ");
		te = scan.nextDouble();
		System.out.print("Enter current liabilities: RM ");
		cl = scan.nextDouble();
		System.out.print("Enter total liabilities  : RM ");
		tl = scan.nextDouble();
		System.out.print("Enter sales\t\t : RM ");
		s = scan.nextDouble();
		System.out.print("Enter net income\t : RM ");
		ni = scan.nextDouble();
		
		double cr = ca/cl;
		double qr = (ca-i)/cl;
		double tat = s/ta;
		double npm = ni/s;
		double roa = ni/ta;
		double roe = ni/te;
		double dr = tl/ta;
		double er = te/ta;
		
		System.out.println("\nCurrent ratio           = " + ca + " /" + cl);
		System.out.printf("                        = %.2f",cr );
		System.out.println("\nQuick ratio             = (" + ca + " - " + i + ") /" + cl);
		System.out.printf("                        = %.2f",qr );
		System.out.println("\nTotal Asset Turnover    = " + s +  " /" + ta);
		System.out.printf("                        = %.2f",tat );
		System.out.println("\nNet Profit Margin       = " + ni +  " /" + s);
		System.out.printf("                        = %.2f",npm );
		System.out.println("\nReturn On Assets        = " + ni +  " /" + ta);
		System.out.printf("                        = %.2f",roa);
		System.out.println("\nReturn On Equity        = " + ni +  " /" + te);
		System.out.printf("                        = %.2f",roe);
		System.out.println("\nDebt Ratio              = " + tl +  " /" + ta);
		System.out.printf("                        = %.2f",dr);
		System.out.println("\nEquity Ratio            = " + te +  " /" + ta);
		System.out.printf("                        = %.2f",er);
		
	}

}
