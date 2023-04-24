package MyMethod;

public class MethodArrayKor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Advantage of method");
        displayLine();
        System.out.println("Advantage of Array");
        displayLine();
        System.out.println("Display of Array");
        displayLine();
        displayarray();
    }
        public static void displayLine() {
            for(int i=0; i<40; i++) {
                System.out.print("_");
            }
        System.out.println(" ");
        }
        
        public static void displayarray() {
            int[][] list = 
                {
                    {3,4,5},
                    {4,5,6},
                    {7,8,9}
                };
            for(int x=0; x<list.length; x++) {
                for(int y=0; y<list.length; y++) {
                    System.out.println(list[x][y]);
                    
                }
            }
            displaySumarray(list);
        }
            
        public static void displaySumarray(int list[][]) {
            int sum=0;
            int total=0;
            for(int i=0; i<list.length; i++)
            {
                for(int j=0; j<list.length; j++)
                {
                //    System.out.println(list[i][j]);
                    sum+=list[i][j];
                }
                total=total+sum;
                System.out.println("Print sum :"+sum);
                System.out.println("Print total sum :"+total);
	}

        }
}
