package Functions;
import java.util.*;
public class Factorial {
    public static int numFactorial(int n){
        if (n==0) {
            return 1;
            
        }
        else{

            return n*numFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(numFactorial(num));
    }
}
