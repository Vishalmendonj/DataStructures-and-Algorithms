package String_Builder;

/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123” */
import java.util.*;
public class String3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        StringBuilder sb = new StringBuilder(mail);
        String username="";
        for(int i=0; i<=sb.length()-1; i++){
            if(sb.charAt(i)=='@'){
                username = sb.substring(0, i);
            }
        }
        System.out.println(username);
    }
    
}
