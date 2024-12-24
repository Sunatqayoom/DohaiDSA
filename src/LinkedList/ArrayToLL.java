package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ArrayToLL {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Node head = arraytoLL(arr);

        // Call the print function to print the linked list
        printLinkedList(head);
    }

    public static Node arraytoLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node newNode = new Node(arr[0]);
        Node temp = newNode;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return newNode;
    }

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null"); // End of the linked list
    }
}
