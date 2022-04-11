package LinkedList;

public class FrontZero {
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(0);
        Node n3 = new Node(0);
        Node n4= new Node(2);
        Node n5 = new Node(0);
        Node head = n1;
        head.next =n2 ;
        n2.next= n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;
        head=moveZero(head);
        print(head);
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node moveZero(Node head) {
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data == 0) {
                prev.next = cur.next;
                cur.next = head;
                head = cur;
                cur = prev.next;
            }
            else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
    static void print(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
