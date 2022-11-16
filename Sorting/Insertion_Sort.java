package Sorting;
import java.util.*;
public class Insertion_Sort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<Integer>(arr.length);
        // int sorted_arr[] = new int [arr.length];
        // sorted_arr[0]=arr[0];
        // for(int i=0; i<arr.length;i++){
        //     al.add(arr[i]);
        // }
        // al.remove(0);
        // System.out.println(al);
        int arr[]= {7,8,3,1,2};
        for(int i=1; i<arr.length; i++){
            int smallest = arr[i];
            int j = i-1;
            while(j>=0 && smallest<arr[j]){
                
            }
        }
    }

    
}
