package Recursion;

public class Fibonacci {
    public static void printFinonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        
       
        System.out.println(a);
        
        printFinonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        printFinonacci(0, 1, 7);
    }
    
}
