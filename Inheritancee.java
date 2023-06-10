package core_java_oops;

class Animall {
	  protected String name;

	  protected void display() {
	    System.out.println("I am an animal.");
	  }
	}

	class Dogg extends Animall {

	  public void getInfo() {
	    System.out.println("My name is " + name);
	  }
	}

	class Inheritancee {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dogg labrador = new Dogg();

	    // access protected field and method
	    // using the object of subclass
	    labrador.name = "Max";
	    labrador.display();

	    labrador.getInfo();
	  }
	}
