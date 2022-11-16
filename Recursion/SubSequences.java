package Recursion;
//Time Complexity = O(2^n)
public class SubSequences {
    public static void subsequences(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        //chooses to enter
        subsequences(str, idx+1, newstr+currChar);

        //chooses not to enter
        subsequences(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str = "aaa";
        subsequences(str, 0, "");
    }
}
