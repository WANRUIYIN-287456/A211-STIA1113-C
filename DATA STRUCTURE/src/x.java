
public class x {
	private static int y=0;
    public static int binaryEquivalent(int n) {
    	
    	
    	if (n==0)
    		return 0;
        else if(n>0) {
    		return binaryEquivalent(n%2);
    	}
    }
    public static int gety() {
    	return y;
    }
}

