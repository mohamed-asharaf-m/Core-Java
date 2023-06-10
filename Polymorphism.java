package core_java_oops;

class ProgrammingLanguage {
	  public void display() {
	    System.out.println("I am Programming Language.");
	  }
	}

	class Java extends ProgrammingLanguage {
	
	  public void display() {
	    System.out.println("I am Object-Oriented Programming Language.");
	  }
	}

	class Polymorphism {
	  public static void main(String[] args) {

	
	    ProgrammingLanguage pl;

	 
	    pl = new ProgrammingLanguage();
	    pl.display();

	 
	    pl = new Java();
	    pl.display();
	  }
	}
