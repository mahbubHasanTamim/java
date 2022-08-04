import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter height of the rectangle: ");
        double height = scn.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scn.nextDouble();
        //formula
        double area = height*width;
        System.out.println("Area of rectangle is: " + area);
    }  
}