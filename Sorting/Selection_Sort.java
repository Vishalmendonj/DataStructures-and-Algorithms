package Sorting;
public class Selection_Sort {
    public static void main(String[] args) {
        
        int arr[] = {9,2,4,6,8,3,1,7,36};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
