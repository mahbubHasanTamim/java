package evenodd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter an Integer number: ");
        int num = r.nextInt();
        
       String even = "Even", odd = "Odd";
        
        String result = (num % 2 == 0) ? even : odd;
        
        System.out.println("Entered number is " + result);

    }
    
}