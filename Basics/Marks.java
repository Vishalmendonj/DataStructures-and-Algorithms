import java.util.*;
public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter 0 or 1");
        Scanner sc = new Scanner(System.in);
        int ask = sc.nextInt();
        do {
            System.out.println("Enter your marks:");
            int marks = sc.nextInt();
            if (marks>90) {
                System.out.println("Very Good");
                
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also good");
            }
            else if(marks>0 && marks<=59){
                System.out.println("This is good as well.");
            }
        } while (ask!=0);
    }
}
