package Sorting;

public class Bubble_Sort {

    // public static void printArray(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
 
    // public static void main(String[] args) {
    //     int arr[] = {5,2,3,4,1,6,4,56,45};

    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length-1-i; j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    //     System.out.println(arr);
    // }


    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
  
    public static void main(String args[]) {
        int arr[] = {5,2,3,4,1,6,4,56,45};
  
        //bubble sort
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
  
        // printArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
}
}
