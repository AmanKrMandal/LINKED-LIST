package LinkedList;

public class DeleteKth {
    public static void main(String[] args) {
        int k = 5;
        Node nth ;
        Node n1 = new Node(12);
        Node n2 = new Node(15);
        Node n3 = new Node(36);
        Node n4 = new Node(55 );
        Node n5 = new Node(7 );
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;
        nth=find_nth(head,k);
        System.out.println(nth.data);


    }
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    static Node find_nth(Node head, int k){
        Node curr = head;
        Node nth = head;
        for(int i=0 ; i<k; i++){
            if (curr != null){
                curr=curr.next;
            }
            else {
                return null;
            }
        }
        while (curr!= null){
            curr=curr.next;
            nth = nth.next;
        }
     return nth;
    }
}
