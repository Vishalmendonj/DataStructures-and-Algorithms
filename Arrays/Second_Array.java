package Arrays;
//Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class Second_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String names[] = new String[3];
        System.out.println("Enter the number of names ");
        int num = sc.nextInt();
        System.out.println("Enter the names");
        for(int i=0; i<names.length; i++){
            names[i] = sc.next();
        }
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
