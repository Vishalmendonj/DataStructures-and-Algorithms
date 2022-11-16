package Arrays;
import java.util.*;
public class First_Array {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter the number to be found");
        int x = sc.nextInt();
        for(int i=0; i<size; i++){
            if(numbers[i]==x){
                System.out.println(x + " is in the index "+ i);
            }
        }
        
    }
}
