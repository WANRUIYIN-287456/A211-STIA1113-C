package MyArray;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock[] = new int[6];
		int sum=0;
		int i;
		stock[0]=10;//initialization gincu ada 10 biji 
		stock[1]=20;  //eyeliner ada 20 biji
		stock[2]=70;  
		stock[3]=40;  
		stock[4]=50;
		stock[5]=60;
		for(i=0; i<stock.length; i++)
		    sum=sum+stock[i];
		System.out.println("sum is :" + sum);
	}

}
