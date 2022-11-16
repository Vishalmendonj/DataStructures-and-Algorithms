package PractiseQuestions;
//Write a function to print the sum of all odd numbers from 1 to n

import java.util.*;
public class Second {
    public static int summation_odd(int n){
        int sum_num=0;
        for(int i=1; i<=n;i++){
            if(i%2!=0){
                sum_num=sum_num+i;
            }
            else{
                continue;
            }
        }
        return sum_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of all odd numbers is from 1 to "+ num + "is" + summation_odd(num));
    }
}
