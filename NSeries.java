
package nseries;

import java.util.Scanner;

public class NSeries {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the range of number : ");
        int n = r.nextInt();
        int i, sum = 0;
       for(i=0; i<=n; i=i+2){
           sum +=i;
       }
        
        System.out.println("The sum of the series = " + sum);

    }
    
}