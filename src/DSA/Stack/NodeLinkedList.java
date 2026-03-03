package DSA.Stack;

import java.util.HashMap;
import java.util.Map;

public class NodeLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        head.next.next = new Node(30);


        Node current = head;

        while(current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        //System.out.println(head.toString());
        reverseLinkedList(head);
    }

    public static void reverseLinkedList(Node head)
    {
        System.out.println("\nReverse linked list");
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }

        while(prev!=null)
        {
            System.out.print(prev.data+" ");
            prev = prev.next;
        }
    }
}
