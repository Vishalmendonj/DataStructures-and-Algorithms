package Strings;
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class String_1 {
    public static void main(String[] args) {
        String line[] = new String[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            line[i]= sc.nextLine();

        }
        System.out.println(line[0]+" "+line[1]+" "+line[2]);

    }
}
