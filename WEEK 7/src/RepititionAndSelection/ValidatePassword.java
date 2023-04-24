package RepititionAndSelection;
import java.util.Scanner;
public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int upper_letters = 2; //at least 2 uppercase letters
		final int lower_letters = 3; //at least 3 lowercase letters
		final int digit = 1; // at least 1 digit
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password with at least 2 uppercase letters, 3 lowercase letters and 1 digit: ");
		String pass = sc.nextLine();
		int passLength = pass.length(); //to rule this entire String
		//Character:
		for (int i=0; i < passLength; i++)
		{
			char ch = pass.charAt(i);
			
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if (Character.isDigit(ch))
			digitCount++;
		}
		if(upperCount >= upper_letters && lowerCount >= lower_letters && digitCount >= digit)
			System.out.println("Valid password");
		else {
			System.out.println("The password did not have enough of the following: ");
				if(upperCount != upper_letters)
					System.out.println("uppercase letters");
				if(lowerCount != lower_letters)
					System.out.println("lowercase letters");
				if(digitCount != digit)
					System.out.println("digit");
			
		}
	}

}
