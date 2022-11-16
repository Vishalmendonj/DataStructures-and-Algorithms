package LinkedList;
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
import java.util.LinkedList;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the elements");
        for(int i=0; i<11; i++){
            int numbers = sc.nextInt();
            list.add(numbers);
        }
        System.out.println(list);

        for(int i=0; i<list.size();i++){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
