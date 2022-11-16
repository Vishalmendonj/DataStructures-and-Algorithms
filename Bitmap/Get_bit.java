package Bitmap;
//Get the 3rd bit (position=2) of number n = 0101

public class Get_bit {
    public static void main(String[] args) {
        int bitmask = 1<<3;
        int n = 5;
        int result =bitmask & 5  ;
        System.out.println(result);
    }
}
