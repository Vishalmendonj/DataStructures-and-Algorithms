package CodingNinjas;
import java.util.*;
public class Problem1 {
    static public int largest(int n, int m, int arr[]) {
        arr[n-m]=0;
        int sum=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       int n=5;
       int m=3;
        int arr[]={3,2,5,1,4};
        System.out.println(largest(n,m,arr));
    }
}
