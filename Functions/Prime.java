package Functions;
import java.util.*;
public class Prime {
    static int flag=0;
    public static int primeNum(int n){
        if(n==1){
            System.out.println("Not prime");

        }
        else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    flag=1;
                }
                // else{
                //     flag=0;
                // }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result= primeNum(num);
        if(result==1){
            System.out.println("Not Prime");
        }
        else if(result==0){
            System.out.println("Prime");
        }
    }
}
