package core_java_oops;

import java.util.Scanner;

public class RectangleArea {
    private static double length;
    private static double breadth;
    public static void main(String args[]) {
        setDimension();
        double recArea = calculateArea(length, breadth);
        System.out.println("Area of the rectangle is: "+recArea);
    }
    
    public static double calculateArea(double length, double breadth)
    {
        return length * breadth;
    }
    
    public static void setDimension()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
        sc.close();
    }
}