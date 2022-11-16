//Remove duplicates from the string
package Recursion;

public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newStr){
        if(idx==str.length()-1){
            System.out.println(newStr);
            return;
        }
        char curChar = str.charAt(idx);
        if(map[curChar-'a']==true){
            removeDuplicates(str, idx+1, newStr);
        }else{
            newStr+=curChar;
            map[curChar-'a']=true;
            removeDuplicates(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}
