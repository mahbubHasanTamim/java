

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scn.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scn.nextInt();
        
        int result = (num1 > num2 && num1 > num3) ? num1
        : (num2 > num1 && num2 > num3) ? num2
        : num3;       
        System.out.println("Largest number is " + result);
    }    
}