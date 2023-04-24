public class test{
	 public static int isEven (int num){
	    if(num==0){
	        return 0;
	    }else if (num == 1){
	        return 1;
	    }else {
	        num = num - 2;
	        return(isEven(num));
	    }
	    }

}
}