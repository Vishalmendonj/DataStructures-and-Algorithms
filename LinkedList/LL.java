package LinkedList;

public class LL {
    public static int size=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        Node currNode = head;
        if(head==null){
            head=newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        
    }

    public void printNode(){
        
        Node currNode = head;
        if(head==null){
            
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
        
    }
    
    public void deleteFirst(){
        size--;
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        head=head.next;
    }

    public void deleteLast(){
        size--;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head.next=null;
            return;
        }

        Node curNode=head;
        while(curNode.next.next!=null){
            curNode=curNode.next;
        }
        curNode.next=null;
    }

    public int getSize(){
        System.out.println(size);
        return size;
    }
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next =prevNode;

            prevNode=currNode;
            currNode= nextNode;
        }
        head.next=null;
        head=prevNode;

    }

    public Node nthNode(int n){
        int i=1;
        Node curr =head;
        while(i<=size-n-1){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        System.out.println(head.data);
        return head;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("tv");
        list.addLast("with");
        list.addLast("remote");

        list.printNode();
        // list.deleteFirst();
        // list.printNode();

        // list.deleteLast();
        // list.printNode();
        // list.getSize();
        list.reverseList();
        list.printNode();
        list.nthNode(6);

    }
}
