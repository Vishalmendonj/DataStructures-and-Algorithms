package AdvancedRecursion;

public class GuestInvite {
    public static int printGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int ways1 = printGuest(n-1);

        //pair
        int ways2 = (n-1)*printGuest(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        System.out.println(printGuest(4));
    }
}
