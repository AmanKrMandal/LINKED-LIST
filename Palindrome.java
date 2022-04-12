package LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(0);
        Node n3 = new Node(5);
        Node n4= new Node(1);
        Node n5 = new Node(12);
        Node head = n1;
        head.next =n2 ;
        n2.next= n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;
        if(IsPalindrome(head) == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static boolean IsPalindrome (Node head) {

        if(head ==null){
            return  true;
        }
        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node cur = head;
        while (last!=null){
            if (last.data != cur.data) {
                return false;
            }
                last =last.next;
                cur= cur.next;

        }
        return true;
    }
    static Node middle (Node head){
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    static Node reverse (Node mid){
        Node cur = mid ;
        Node per = null;
        while (cur != null){
            Node temp = cur.next;
            cur.next= per;
            per= cur;
            cur = temp;
        }
        return per;
    }
}
