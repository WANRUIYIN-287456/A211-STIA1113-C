package A152MidTerm;

public final class Classik {
    String a = "A";
    String b = "B";
    
    public Classik() {
    	System.out.print(a+b);
    }
    
    public Classik(String ab) {
    	b=a;
    	a=ab;
    	System.out.print(a+b);
    }
    
	public static void main(String[] args) {
		Classik a = new Classik();
		Classik b = new Classik("B");
	}

}
