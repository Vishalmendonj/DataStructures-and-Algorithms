package LinkedList;

public class LinkedListBeginners {
    Node head;
    int size;

    LinkedListBeginners(){
        size=0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node curNode= head;
        while(curNode.next==null){
            curNode=curNode.next;
        }

        curNode.next=newNode;
    }

}
