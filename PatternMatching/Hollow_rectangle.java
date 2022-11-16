package PatternMatching;
public class Hollow_rectangle {
    public static void main(String[] args) {
        int r,c;
        for( r=1; r<=5; r++){
            for( c=1; c<=5; c++){
                if(r==1 || r==5 || c==1 || c==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
