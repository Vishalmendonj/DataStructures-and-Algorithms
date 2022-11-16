package PractiseQuestions;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
import java.lang.Math;
// import java.lang.FdLibm.Pow;
public class Eight {
    public static int exponent(double x, double n){
        int ans = (int) Math.pow(x, n);
        return ans;
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double n = sc.nextDouble();
            System.out.println("Exponential value is "+exponent(x, n));

        }
}

