package PractiseQuestions;
//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Fourth {
    public static float circumference(int r) {
        float cir = 2*(22/7)*r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Circumference of given circle is "+circumference(radius));
    }

}
