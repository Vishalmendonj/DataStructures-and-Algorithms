import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,2,3,3,3,5,5,5,8,8,9,9,9};
        int n = arr.length;
        int temp[] = new int [n];
        int j=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        
        for(int i=0; i<j; i++){
            System.out.println(arr[i]);
        }
    }
}
