package core_java_oops;

public class Student {
    public String address;
    public int rollNumber;
    public String phoneNumber;
    
    public Student(String address, int rollNumber, String phoneNumber)
    {
        this.address = address;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
    }
    
    public static void main(String args[])
    {
        Student stu1 = new Student("u60, ublock, kovaipudur, cbe", 18, "9274742383");
        Student stu2 = new Student("41/31 gandhi nagar, cbe", 10, "92756123480");
     
        System.out.println("Student1: "+ stu1.address+" "+stu1.rollNumber+" "+stu1.phoneNumber);
        System.out.println("Student2: "+ stu2.address+" "+stu2.rollNumber+" "+stu2.phoneNumber);

    }
}
