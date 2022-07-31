package triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter base of the triangle: ");
        double base = r.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double height = r.nextDouble();
        //formula
        double area = base*height / 2;
        System.out.println("Area of triangle is: " + area);
    }
    
}
