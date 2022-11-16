package Functions;
import java.util.*;
public class Sum {
    public static int sumOfNumbers(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(sumOfNumbers(a, b));
    }
}
