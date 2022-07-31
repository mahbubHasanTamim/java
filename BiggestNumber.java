package biggestnumber;

import java.util.Scanner;

public class biggestnumber {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = r.nextInt();
        System.out.println("Enter second number: ");
        int num2 = r.nextInt();
        System.out.println("Enter third number: ");
        int num3 = r.nextInt();
        
        int result = (num1 > num2 && num1 > num3) ? num1
        : (num2 > num1 && num2 > num3) ? num2
        : num3;
        
        System.out.println("Biggest number is " + result);

    }
    
}