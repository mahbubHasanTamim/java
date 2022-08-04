import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt(); 
        int flag=0;      
        int m=num/2;   
           
        if(num==0||num==1){  
            System.out.println(num+" is not prime number");      
        }else{  
            for(int i=2;i<=m;i++){      
                if(num%i==0){      
                System.out.println(num+" is not prime number");      
                flag=1;      
                break;      
                }      
            }      
            if(flag==0)  { System.out.println(num+" is prime number"); }  
        } 
    }  
}