package String_Builder;
import java.util.*;

//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        StringBuilder sb = new StringBuilder(user);
        for(int i=0; i<=sb.length()-1; i++){
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
    }
}
