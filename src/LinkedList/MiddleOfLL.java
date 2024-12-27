package LinkedList;

public class MiddleOfLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node middleNode = middle(head);
        System.out.println("The middle node value is: " + middleNode.data);
    }

    //tortoise and hair approach
    public static Node middle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
