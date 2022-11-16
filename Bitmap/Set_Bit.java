package Bitmap;
////Get the 2nd bit (position=1) of number n = 0101
public class Set_Bit {
        public static void main(String[] args) {
            int pos = 1;
            int n = 5;
            int bitmask = 1<<1;
            int result = bitmask|n;
            System.out.println(result);
        }
    
}
