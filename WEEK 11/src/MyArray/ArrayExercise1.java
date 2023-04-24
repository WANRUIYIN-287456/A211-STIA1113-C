package MyArray;

public class ArrayExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  a) Declare an array numArray of 15 elements of type int.
	b) Output the value of the tenth element of the array alpha.
	c) Set the value of the fifth element of the array alpha to 35.
	d) Set the value of the ninth element of the array alpha to the 
sum of the sixth and thirteenth elements of the array alpha.

array alpha = numArray
*/
		
		int num = (int)(Math.random() * 51);
		int [] alpha = new int[15];
		alpha[4] = 35;
		alpha[8] = alpha[5] + alpha[12];
		alpha[5] = num;
		alpha[12]= num;
		alpha[9]= num;
		
		System.out.println("Tenth element : " + alpha[9]);
		System.out.println("Fifth element : " + alpha[4]);
		System.out.println("Ninth element : " + alpha[8]);
		
		
		
		
		
	}

}
