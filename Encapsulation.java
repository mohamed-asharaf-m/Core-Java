package core_java_oops;

class Persons {

	  // private field
	  private int age;

	  // getter method
	  public int getAge() {
	    return age;
	  }

	  // setter method
	  public void setAge(int age) {
	    this.age = age;
	  }
	}

	class Encapsulation {
	  public static void main(String[] args) {

	    // create an object of Person
	    Persons p1 = new Persons();

	    // change age using setter
	    p1.setAge(21);

	    // access age using getter
	    System.out.println("My age is " + p1.getAge());
	  }
	}