package myWhile;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare dua variable x =0, y=1. 
		//Selagi = while y lebih kecil dan sama dgn 10, tambah x dgn y. 
		//kemudian tambah y dgn 5. print x.
	int x=0;
	int y=1;
	int m=0;
	int n=1;
	int j;
	int k=1;
	
	while(y<=10) {
		x=x+y;
		y=y+5;
	System.out.print(x + " ");	
	}
	System.out.println();
	
	
	do {
	m=m+n;
	System.out.print(n + " ");
	n=n+5;
	System.out.print(m + " ");
	}while(n<=10);
	System.out.println();
	
	for(j=1; j<=10; j=j+k) {
				k=k+5;
		System.out.print(j + " ");
	}
	System.out.println();

	/*for(j=1; j<=30;k=k+5){
		j=j+k;
	System.out.print(j + " ");
    }
    System.out.println();
    }
	*/
	
	
	
	
}
}
