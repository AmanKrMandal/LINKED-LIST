package LinkedList;

public class Rever {
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
            head=reverse(head);
            print(head);
        }
        static class Node {
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next= null;
            }
        }
        static Node reverse (Node head){
            Node cur = head;
            Node per = null;
            while (cur != null){
                Node temp = cur.next;
                cur.next= per;
                per= cur;
                cur = temp;
            }
            return per;
        }
         static void print(Node head){
            while (head != null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

