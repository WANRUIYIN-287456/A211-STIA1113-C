package MyMethod;

public class SeacrhEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] item = {10,20,30,40,50,60,70,80,90,100};
		   editValue(item,60);
		   printArray(item);
		}
		static void printArray(int[] number)
		{
		   for (int index = 0; index < number.length; index++)
			System.out.println(number[index] + "");
		}
		static void editValue(int[ ] num, int searchValue){
		  boolean edit=false;   
		  for (int i=0; i < num.length; i++) 
			  if(num[i] == searchValue){
				 num[i]=65;
				 edit=true;
				 break;
				 }
		  if (edit==false)
		System.out.println("The search value is not in the list.");

	}

}
