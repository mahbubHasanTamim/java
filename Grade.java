// Grade নির্ণয়ের প্রোগ্রাম
import java.util.Scanner;
public class Grade{

    public static void main(String[]args){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int mark = scn.nextInt();
        String grade = null;

        switch(mark/10){
            case 10:
            case 9:
            case 8:{
                grade = "A+";
                break;
            }
            case 7:{
            grade = "A";
            break;
            }
            case 6:{
            grade = "B";
            break;
            }
            case 5:{
            grade = "C";
            break;
            }
            case 4:{
            grade = "D";
            break;
            }
            default:
                grade = "F";
                break;            
        }
        System.out.println("Your Grade is: " + grade);
    }
}
