package TestStudent;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
		        String matricNo;
			double test1,test2;
			
			Student [] studDegree = new Student[3];
			
		        for (int i=0; i<3; i++){
		        System.out.print("Matric No : ");
		        matricNo=input.next();
		        System.out.print("Test 1 : ");
		        test1=input.nextDouble();
		        System.out.print("Test 2 : ");
		        test2=input.nextDouble();
		        
		    	studDegree[i] = new Student (matricNo, test1, test2);
			    studDegree[i].calculateAverage();
		        }
		       
		        
		        System.out.println("*****************************");
		        System.out.println("STUDENT INFORMATION");
		        System.out.println("*****************************");
		        System.out.println("Matric No\tAverageMark");
		       
		        for (int j=0;j<3;j++){
		    
		            System.out.println(studDegree[j].getStudentInfo());
		        }
	
}
}
	