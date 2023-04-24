package NumericalData;
import java.util.Scanner;
public class remainderOperator1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Please input a number. ");
        int number = input.nextInt();
        Number(number);
        System.out.println("Please input a number. ");
        int number2 = input.nextInt();
        Number2(number2);
 
	}
	public static void Number(int number){
        if (number%2 == 0){
        System.out.println("This is an odd number. ");
        }else {System.out.println("This is not an odd number7." );}
}
	
	public static void Number2(int number2){
        if (number2%27 == 0){
        System.out.println("This is divisible by 27. ");
        }else {System.out.println("This is not divisible by 27. ");}
	 
	}

}
