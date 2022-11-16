//Print x^n (with stack height = logn)

package Recursion;

public class XpowerLogN {
    public static int printLogN(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        else{
            if(n%2==0){
                return printLogN(x, n/2) * printLogN(x, n/2);
            }
            else{
                return printLogN(x, n/2) * printLogN(x, n/2) * x;
            }
        }
    }
    public static void main(String[] args) {
       System.out.println(printLogN(6, 2)); 
    }
}
