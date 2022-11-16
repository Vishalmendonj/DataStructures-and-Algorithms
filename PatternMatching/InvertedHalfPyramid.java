package PatternMatching;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n=3;
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
