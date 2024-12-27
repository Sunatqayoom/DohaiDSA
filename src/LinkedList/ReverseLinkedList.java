package LinkedList;

import java.util.Stack;


public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(head);
    }

    //using stack to reverse .spac complexoty O(n)
    public static Node reverseLinkedList(Node head) {
        Node temp = head;
        Stack<Integer> st = new Stack<>();


        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

   //print LL
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
