package AdvancedRecursion;

public class PlacingTiles {
    public static int printTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //placed vertically
        int vertical = printTiles(n-m, m);

        // placed horizontally
        int horizontal = printTiles(n-1, m);
        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int answer = printTiles(4, 3);
        System.out.println(answer);
    }
}
