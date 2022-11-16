package Recursion;
public class XpowerN{
    public static int printXexponent(int x, int n){
        if(n==0){
            // System.out.println(1);
            return 1;
        }
        if(x==0){
            // System.out.println(0);
            return 0;
        }
        int sum= x*printXexponent(x, n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printXexponent(3, 3));
        
    }
}
