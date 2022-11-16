package PatternMatching;
public class NumbersHalfPyramid {
    public static void main(String[] args) {
        int n=4;
        int k=3;
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-k; j++ ){
                System.out.print(j);
            }
            
            // j++;
        //    int k=j;
           for(int h=k; h>=0; h--){
            System.out.print(" ");
           }
           k--;
           System.out.println();
        }
    }
    
}
