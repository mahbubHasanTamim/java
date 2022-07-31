package additon;

import java.util.Scanner;

public class Additon {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = r.nextInt();
        System.out.println("Enter second number: ");
        int num2 = r.nextInt();
       
        
        int result = num1 + num2;
        
        System.out.println("Sum of two numbers = " + result);

    }
    
}
