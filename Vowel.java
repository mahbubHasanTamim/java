package Vowel;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a character:");
        String letter = r.nextLine().toLowerCase();
    
        switch(letter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":{
                System.out.println("Vowel");
                break;
            }
            
            default:
                System.out.println("Consonent");   
                break;     
        }
    }
    
}