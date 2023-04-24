package SelfProgramming;
import java.util.*;
public class CommonElement {

	public static void main(String[] args) {
		  String[] list1 = {"WAN RUI YIN", "20", "FEMALE", "163", "43"};
		  
	      String[] list2 = {"LOH POOI MUN", "20", "FEMALE", "160", "48"};
	       
	       System.out.println("Array1 : "+Arrays.toString(list1));
	       System.out.println("Array2 : "+Arrays.toString(list2));
	 
	       HashSet<String> common = new HashSet<String>();
	  	 
	        for (int i = 0; i < list1.length; i++)
	        {
	            for (int j = 0; j < list2.length; j++)
	            {
	                if(list1[i].equals(list2[j]))
	                {
	                	  common.add(list1[i]);
	                }
	            }
	        }
	 
	        System.out.println("Common element : "+(common));   

	}

}
