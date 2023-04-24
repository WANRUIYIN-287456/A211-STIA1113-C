package MyMethod;

public class Method1 {

	public static void main(String[] args) {
		
		        int i = 20;
		        String name = "Azman Bin Yasin";
		        
		        System.out.println("I have a message for you");
		        showMessage();
		        System.out.println("That's all folk!");
		        showMessage2();
		        System.out.println("That's all buddie!");
		        showMessage3(i);
		        showMessage4(i, name);
		        showMessage5(60, "Pension");
		        
		    } //main method
		    
		    //public static - modifier
		    // void - result type
		    //showMessage - method name
		    //() - parameter
		    public static void showMessage() { 
		        System.out.println("Hello World");
		    } //showMessafe method
		    
		    public static void showMessage2() {
		        System.out.println("Hello Malaysia");
		    } //showMessage2 method
		    
		    public static void showMessage3(int j) {
		        System.out.println("The number is " + j);
		    }
		    
		 
		public static void showMessage4 (int k, String n) {
		        int m = 4;
		        String s = "Jitra";
		        
		        System.out.println("The number is " +k);
		        System.out.println("My name is " + n + " from " + s);
		        int sum = k+ m;
		        System.out.println("Sum is " + sum);
		    }
		    
		    public static void showMessage5 (int age, String p) {
		        System.out.println("My age is " + age + " " +p);
		    }

	}


