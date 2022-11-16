package TwoD_Arrays;

//take input from user and find the index of needed one.
import java.util.*;
public class Find_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        int numbers[][]=new int[rows][columns];
        System.out.println("Enter the values: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        // int flag = 0;
        System.out.println("Write the number to find ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i][j]==x){
                    System.out.println("Number is found at index " + i+1 +" row "+j+1+" colum.");
                    break;
                }
            }
        }

        // if(flag==)
        
    }
}
