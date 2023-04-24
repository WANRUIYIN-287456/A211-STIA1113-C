package assignment2;

public class Node {

	   private Object info;      // data stored in the node
	   private Node link;         // link to next node

	   public Node() {
		     info = null;
		     link = null;
	  } 

	   
	   public void setInfo(Object newInfo) 
	   {
	      info = newInfo;
	   }

	   public void setLink(Node newLink) 
	   {
	      link = newLink;
	   }

	    
	   public Object getInfo(){
	        return info;
	   }
	   
	   public Object getLink(){
	        return link;
	   }
	
}
