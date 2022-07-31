package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
     System.out.println("Input the value of a:");
     double a = r.nextDouble();
     System.out.println("Input the value of b:");
     double b = r.nextDouble();
     System.out.println("Input the value of c:");
     double c = r.nextDouble();
     double d = b*b-4.0*a*c;
     
     if(d>0.0){
         double x1 = (-b+Math.pow(d,0.5))/(2.0*a);
         double x2 = (-b-Math.pow(d,0.5))/(2.0*a);
         System.out.println("two roots are \t" + x1 + "\t and \t" + x2);
     }else if(a == 0.0){
         double x = (-b)/(2.0*a);
         System.out.println("Root is = " + x);
     }else{
         System.out.println("This is not real number");
     }
    }
    
}