
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();       
        String even = "Even", odd = "Odd";
        
        String result = (num % 2 == 0) ? even : odd;      
        System.out.println("Entered number is " + result);
    }   
}