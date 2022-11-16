package Arrays;
//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;
public class Third_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result=true;
        // System.out.println("Enter the size of array: ");
        // int size = sc.nextInt();
        int numbers[] = new int[3];
        for(int i=0; i<numbers.length-1; i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                result=false;
            }
        }
        if(result==true){
            System.out.println("Its sorted");

        }
        else{
            System.out.println("It is not sorted");
        }


    }
}
