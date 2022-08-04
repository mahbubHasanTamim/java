
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base of the triangle: ");
        double base = scn.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double height = scn.nextDouble();
        //formula
        double area = base*height / 2;
        System.out.println("Area of triangle is: " + area);
    }  
}
