package PastYear;

public class PY1920Q2 {

	public static void main(String[] args) {
		int num_array [] = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0.0;
		for (int i=0; i< num_array.length; i++) {
			sum += num_array[i];
		}
      System.out.println("The sum of all digits in the array is " + sum);
	}

}
