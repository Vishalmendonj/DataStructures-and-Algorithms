import java.util.*;
public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("MENU\n1:Addition \n2:Subtraction\n3:Multiplication\n4:Division");
        int operand = sc.nextInt();
        
        

        switch (operand) {
            case 1: System.out.println(num1+num2);
            break;

            case 2: System.out.println(num1 - num2);
            break;

            case 3: System.out.println(num1*num2);
            break;

            case 4: if (num2==0) {
                System.out.println("Zero division not available");
            } else {
                System.out.println(num1/num2);
        
            }
            break;

            default: System.out.println("Enter vaild number");
            
            

                
                

        
            
        }
    }
}
