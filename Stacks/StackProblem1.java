package Stacks;
import java.util.Stack;
public class StackProblem1 {
    public static void addBottom(int data, Stack<Integer> s){
        if(s.size()==0){
            s.push(data);
            return;
        }

        int top=s.pop();
        addBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        addBottom(6, s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
