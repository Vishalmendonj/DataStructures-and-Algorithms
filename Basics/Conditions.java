import java.util.*;
public class Conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int button = sc.nextInt();
        // System.out.println("Enter number 2");
        // int number2 = sc.nextInt();
        // if (number1==number2) {
        //     System.out.println("equal");
        // }
        // else{
        //     if (number1>number2) {
        //         System.out.println("Number 1 is greater");
        //     } else {
        //         System.out.println("Number 2 is greater");
        //     }

        // }
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3: System.out.println("Benjour");
            break;
            default : System.out.println("Invalid");
            
        }
    
    }
}