package PractiseQuestions;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive_count=0, negative_count=0, zeroes_count=0;
        while(true){
            System.out.println("Enter 00 to end");
            int num = sc.nextInt();
            if(num==00){
                break;
            }
            if(num>0){
                positive_count++;
            }
            else if(num<0){
                negative_count++;
            }
            else{
                zeroes_count++;
            }
        }
        System.out.println("Total positve, negative and zeroes are respectively "+positive_count+" , "+negative_count+" , "+zeroes_count);
    }
}
