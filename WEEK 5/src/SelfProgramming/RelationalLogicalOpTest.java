package SelfProgramming;

public class RelationalLogicalOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age         = 18;
    double weight   = 71.23;
    int height      = 191;
    boolean married = false;
    boolean attached= false;
    char gender     = 'm';
    
    // LOGICAL OPERATOR AND, BINARY, TRUE*TRUE*TRUE=TRUE, ! NOT(UNARY)
    System.out.println(!married && !attached && (gender == 'm'));
    // LOGICAL OPERATOR AND, BINARY, FALSE*FALSE=FALSE
    System.out.println(married && (gender == 'f'));
    // LOGICAL OPERATOR AND, BINARY, TRUE*TRUE*TRUE=TRUE
    System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));
    // LOGICAL OPERATOR OR, BINARY, TRUE*FALSE=TRUE
    System.out.println((height >= 180) || (weight >= 90));
    System.out.println();
    
    //USING IF 
    if (!married && !attached && (gender == 'm'))
    System.out.println("not married, not attached and is male");
    if (married && (gender == 'f'))
    System.out.println("married and female");
    if ((height >= 180) && (weight >= 65) && (weight <= 80))
    System.out.println("height more or equals to 180, weight is between 65 and 80.");
    if ((height >= 180) || (weight >= 90))
    System.out.println("height more than 180 or weight more than 90.");
    System.out.println();
    
    //LOGICAL OPERATOR XOR, BINARY, TRUE*TRUE=FALSE
    System.out.println((height >= 180) ^ (weight <= 90));
    //LOGICAL OPERATOR XOR, BINARY, TRUE*FALSE=TRUE
    System.out.println((height >= 180) ^ (weight >= 90));
    //LOGICAL OPERATOR XOR, BINARY, FALSE*TRUE=FALSE
    System.out.println((height <= 180) ^ (weight <= 90));
    //LOGICAL OPERATOR XOR, BINARY, FALSE*FALSE=FALSE
    System.out.println((height <= 180) ^ (weight >= 90));
    System.out.println();
    
    //QUESTION : WRITE AN EXPRESSION FOR ALL UNMARRIED MALE, AGE BETWEEN 21 AND 35, 
    // WITH HEIGHT ABOVE 180,AND WEIGHT BETWEEN 70 AND 80.
    System.out.println(!married && (gender == 'm') || (age >= 21 && age <= 35) && 
    (height > 180) && (weight>=70 && weight<=80));
    
    
    
	}

}
