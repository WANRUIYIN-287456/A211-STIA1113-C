package Mooc;

public class PetWorld {

	public static void main(String[] args) {
		 Pet f;

	      Cat h;

	      Dog l;

	      MagicCat m;

	      f = new Cat(); //1

	      l = new Dog(); //2

	      m = new MagicCat(); //3

	      h = new MagicCat(); //4

	      f = new MagicCat(); //5

	      m = new MagicCat(); //6

	      Pet[] petList = new Pet[3];

	      petList[0] = new Cat();

	      petList[1] = new Dog();

	      petList[2] = new MagicCat();

	  

	      for (int i = 0; i < petList.length; i++) {

	        Pet thePet = petList[i];

	        thePet.speak();
	      }
	}

}


abstract class Pet {

	   boolean hungry = true;

	   public abstract void speak();	   

	}//end of class Pet

	 

	class Cat extends Pet {

	   public void speak() {

	     System.out.println("Meow!");

	   }

	   public void call() {

	      System.out.println("Here kitty, kitty..");

	      if (hungry) speak();

	   }

	}//end of class Cat

	 

	class Dog extends Pet {

	   public void speak() {

	      System.out.println("Wolf!");

	   }

	}//end of class Dog

	 

	class MagicCat extends Cat {

	   boolean peoplePresent = false;

	   public void speak() {

	   if (peoplePresent)

	     super.speak();

	   else

	     System.out.println("Hello");

	   }

	}//end of class MagicCat
