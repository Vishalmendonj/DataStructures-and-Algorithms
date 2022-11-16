package ComplexPatternMatching;

public class SolidRhombus {
    public static void main(String[] args) {
        
        int spaces=4;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            spaces--;
            for(int j=1; j<=5; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
