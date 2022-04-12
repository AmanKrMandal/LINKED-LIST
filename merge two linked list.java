package LinkedList;

import com.sun.org.apache.xpath.internal.patterns.NodeTest;

public class MergeSort {
    public static void main(String[] args) {
        Node res = null;
        Node n1 = new Node(12);
        Node n2 = new Node(13);
        Node n3 = new Node(14);
        Node n4 = new Node(15);
        Node n5 = new Node(16);
        Node p = n1;
        p.next =n2 ;
        n2.next= n3;
        n3.next =n4;
        n4.next= n5;
        n5.next=null;

        Node n11 = new Node(9);
        Node n22 = new Node(8);
        Node n33 = new Node(10);
        Node n44 = new Node(11);
        Node n55 = new Node(12);
        Node r= n11;
        r.next =n22 ;
        n22.next= n33;
        n33.next =n44;
        n44.next= n55;
        n55.next=null;

        res =mix(p,r);
        print(res);
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node mix(Node p,Node r) {
        if (p == null) return r;
        if (r == null) return r;
        if (p.data > r.data) {
            Node temp = p;
            p = r;
            r = temp;
        }
        Node res = p;
        while (p != null && r != null) {
            Node tmp = null;
            while (p != null && p.data <= r.data) {
                tmp = p;
                p = p.next;
            }
            tmp.next = r;
            Node temp = p;
            p = r;
            r = temp;
        }
        return res;
    }
    static void print(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
