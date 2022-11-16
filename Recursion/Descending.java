package Recursion;

public class Descending {

    public static void printDescend(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDescend(n-1);
    }
    public static void main(String[] args) {
        printDescend(6);
    }
}
