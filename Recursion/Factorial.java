package Recursion;

public class Factorial {
    public static void printFactorial(int n, int answer){
        if(n==1){
            System.out.println(answer);
            return;
        }
        answer*=n;
        printFactorial(n-1, answer);
    }
    public static void main(String[] args) {
        printFactorial(5, 1);
    }
}
