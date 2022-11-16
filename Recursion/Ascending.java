package Recursion;
public class Ascending {

    public static void printAscend(int n){
        if(n==4){
            return;
        }
        System.out.println(n);
        printAscend(n+1);
        System.out.println("Just Checking");
    }
    public static void main(String[] args) {
        printAscend(1);
    }
}
