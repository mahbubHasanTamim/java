

import java.util.Scanner;
public class SumOfNSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range of number : ");
        int n = scn.nextInt();
        int i, sum = 0;
        for(i=0; i<=n; i++){
            sum +=i;
        }       
        System.out.println("The sum of the series = " + sum);
    }    
}