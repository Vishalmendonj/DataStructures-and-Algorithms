package Recursion;
import java.util.*;
public class UniqueSubSequence {
    public static void uniqueSubSequence(String str, int idx, String newStr, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqueSubSequence(str, idx+1, newStr+currChar, set);
        uniqueSubSequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequence(str, 0, "", set);
    }
}
