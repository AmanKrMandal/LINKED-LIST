package LinkedList;

public class Rever {

    public static void main(String args[])
    {
        push(20);
        push(4);
        push(15);
        push(85);
        System.out.println("Given linked list");
        print();
        head = reverse(head);
        System.out.println("Reversed Linked list");
        print();
    }


        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        static Node reverse (Node head){
            if (head == null || head.next == null)
                return head;
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

        static void print()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        static void push(int data)
        {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
    }






