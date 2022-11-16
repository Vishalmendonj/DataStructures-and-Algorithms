package Stacks;
import java.util.ArrayList;

// import javax.xml.crypto.Data;
public class StackWithArrayList {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);

        }

        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peep(){
            return list.get(list.size()-1);
        }


    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(6);

        while(!stack.isEmpty()){
System.out.println(stack.pop());        
        }
        

    }
}
