package Conversion;

public class AssignmentConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dollars = 20;
		double money = dollars;
		//Based on the size, the final variable will be double
        System.out.println("Please pay this amount of money : " + money + ".");
        
        int cash = 500;
        int cash2= 205;
        double quid = cash;
        float quid2 = cash2;
        double quid3 = quid + cash;
        System.out.println("cash : " + cash + ".");
        System.out.println("cash2 : " + cash2 + ".");
        System.out.println("quid : " + quid2 + ".");
        System.out.print("quid3 : ");
        System.out.printf("%.2f%n", quid3);
	}

}
