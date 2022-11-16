package String_Builder;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        StringBuilder sb = new StringBuilder("tonyStark");
        // char answer;
        for(int i=0; i<=sb.length()/2; i++){
            int front = i;
            int last= sb.length()-1-i;

            char front_char = sb.charAt(front);
            char last_char = sb.charAt(last);
            
            sb.setCharAt(front, last_char);
            sb.setCharAt(last, front_char);
        }
        System.out.println(sb);
    }
}
