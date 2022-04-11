package LinkedList;

public class DeleteMid {
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(45);
        Node n3 = new Node(67);
        Node n4= new Node(2);
        Node n5 = new Node(7);
        Node head = n1;
        head.next =n2 ;
        n2.next= n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;
        System.out.println("befor");
        print(head);
        head = deletmid(head);
        System.out.println("after");
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
    static Node deletmid(Node head){
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow= slow.next;
        }
        prev.next = slow.next;
        return head;
    }
    static void print(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

}
