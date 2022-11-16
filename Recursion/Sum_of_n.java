package Recursion;

public class Sum_of_n {
    public static void printSum(int i, int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n-1, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
