package denis.week14;



import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        Node head = node1;
        Node current = node1;
        Stack<Integer> bucket = new Stack<>();
        boolean result = false;


        while (current != null) {
            bucket.push(current.value);
            current = current.next;

        }

        current = node1;
        int size = bucket.size();


        for (int i = 0; i < size; i++) {
            if (current.value == bucket.peek()) {
                bucket.pop();
                current = current.next;


            }
        }
        if (bucket.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


