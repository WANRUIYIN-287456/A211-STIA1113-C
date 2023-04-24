package MyMethod;

public class SearchRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] item = {10,20,30,40,50,60,70,80,90,100};
          boolean delete=deleteValue(item,100);
          if (delete)
          printArray(item,item.length-1);
          else
          printArray(item,item.length);
          }
	static void printArray(int[] number, int size){
    for (int index = 0; index < size; index++)
    System.out.println(number[index] + "");
    }
    static boolean deleteValue(int[ ] num, int searchValue){
    int i,j;
    boolean delete=false;
    for (i=0; i < num.length; i++)
      if(num[i] == searchValue){
      for(j=i;j<num.length-1;j++)
         num[j]=num[j+1];
      delete=true;
      break;
      }
      if (delete==false)
      System.out.println("The search value is not in the list.");
      return delete;  

	}

}
