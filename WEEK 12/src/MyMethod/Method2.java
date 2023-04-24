package MyMethod;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=2;
        System.out.println("Test");
        printSquare("Hello");
        printSquare(value);
        printSquare(value * 3);
        printSquare(4);
        printSquare("Malaysia");
    }
    
    public static void printSquare(String s) {
        System.out.println(s);
    }
    
    public static void printSquare(int v) {
        System.out.println(v);
	}

}
