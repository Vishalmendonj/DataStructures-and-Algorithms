package Stacks;

public class StackWithLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        
        public static Node head;
        public boolean isEmpty(){
            return head==null;
        }
        
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public int pop(){
            int top = head.data;
            if(isEmpty()){
                // System.out.println("Stack is empty");
                return -1;
            }
            head=head.next;
            return top;

        }

        public int peep(){
            int top = head.data;
            if(isEmpty()){
                // System.out.println("Stack is empty");
                return -1;
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        // System.out.println(s.peep()); 
    }
}
