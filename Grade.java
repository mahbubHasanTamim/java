   
import java.util.Scanner;

public class Hello{

    public static void main(String[]args){
        
        Scanner r = new Scanner(System.in);

        System.out.println("Enter Marks:");
        int mark = r.nextInt();

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
        System.out.println("Your Grade is " + grade);
    }
}
