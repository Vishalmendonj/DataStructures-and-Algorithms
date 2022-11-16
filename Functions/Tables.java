package Functions;
import java.util.*;
public class Tables {
    public static int tables(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+ n*i);
            
        }
        return 0;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(tables(num));
    }
}
