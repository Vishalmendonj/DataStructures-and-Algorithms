package Recursion;

public class MoveAllX {
    public static void moveX(String str, int idx, int count, String newStr){
        if(idx==str.length()-1){
            for(int i=0; i<count; i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)!='x'){
            newStr+=str.charAt(idx);
            moveX(str, idx+1, count, newStr);
        }else{
            count++;
            moveX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveX(str, 0, 0, "");
       
    }
}
