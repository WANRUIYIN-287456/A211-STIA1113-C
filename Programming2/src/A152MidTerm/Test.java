package A152MidTerm;

public class Test {
	public static void main(String[] args) {
		Wild wild = new Wild();
	}
}

  class Animal {
	Animal() {
		System.out.println("Animal");
	}
  }

  class Wild extends Animal{
	Wild() {
		super();
		System.out.println("Wild");

	}
  }
