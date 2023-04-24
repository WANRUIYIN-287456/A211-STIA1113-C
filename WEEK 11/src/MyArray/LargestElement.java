package MyArray;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
double sales [] = {10.00 ,20.00, 30.00, 40.00, 50.00};
int index, maxIndex;
double largestSale;
maxIndex = 0;

for(index = 1; index<sales.length;index++) 
   if (sales[maxIndex] < sales[index]) 
       maxIndex = index;
largestSale = sales[maxIndex];

System.out.println("Largest Sale : " + largestSale);
   
Scanner sc = new Scanner(System.in);


//double sales[] = {10.00, 20.00, 50.00, 40.00, 30.00};
int index2, maxIndex2;
double largestSale2;
maxIndex2 = 0;

double[] sales2 = new double[5];

System.out.print("Enter 5 array elements : ");
for(int i = 0; i < sales2.length;i++)
    sales2[i] = sc.nextDouble();
    
for(index2 = 1; index2<sales2.length; index2++)
    if(sales2[maxIndex2] < sales2[index2])
    maxIndex2 = index2;
System.out.println(maxIndex2);
largestSale2 = sales2[maxIndex2];

System.out.println(largestSale2);

   
	}

}
