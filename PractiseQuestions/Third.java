package PractiseQuestions;
//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class Third {
    public static int greater_num(int a, int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest number is "+greater_num(a, b));
    }
}
