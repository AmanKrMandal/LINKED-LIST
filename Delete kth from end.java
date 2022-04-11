package LinkedList;

public class DeleteKth {
    public static void main(String[] args) {
        int k = 5;
        Node n1 = new Node(12);
        Node n2 = new Node(15);
        Node n3 = new Node(36);
        Node n4 = new Node(3 );
        Node n5 = new Node(7 );
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;
        head=delete(head,k);
        print(head);

    }
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    static Node delete(Node head, int k){
        Node curr = head;
        Node nth = head;

        for (int i = 0; i <=k; i++) {
            if(curr == null){
                head= head.next;
                return head;
            }
            curr = curr.next;
        }

        while (curr!= null){
            curr=curr.next;
            nth = nth.next;
        }
        nth.next = nth.next.next;
     return head;
    }
    static void print(Node head){
        while (head!= null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
