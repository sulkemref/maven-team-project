package week_by_week.week11;

public class DeleteNAfterM {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        node1.printNode();
        deleteNodes(node1, 2, 3);
        node1.printNode();

    }


    /**
     * All solutions time&space complexity
     * Time Complexity: O(N). Here, N is the length of the linked list pointed by head. We traverse over the linked list only once.
     * Space Complexity: O(1). We use constant extra space to store pointers like lastMNode and currentNode.
     *
     * @param head
     * @param m
     * @param n
     */
    public static Node getDeletedNode(Node head, int m, int n) {
        Node current = head;
        Node deletedNode = null;
        int count;

        while (current != null) {
            count = 0;
            while (count < m && current != null) {
                deletedNode = current;
                current = current.next;
                count++;
            }
            count = 0;
            while (count < n && current != null) {
                current = current.next;
                count++;
            }
            deletedNode.next = current;
        }
        return head;
    }

    public static Node deleteNodes(Node head, int m, int n) {
        Node current = head;
        Node lastM = head;
        while (current != null) {
            // initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            // traverse m nodes
            while (current != null && mCount != 0) {
                lastM = current;
                current = current.next;
                mCount--;
            }
            // traverse n nodes
            while (current != null && nCount != 0) {
                current = current.next;
                nCount--;
            }
            // delete n nodes
            lastM.next = current;
        }
        return head;
    }

    public static Node deleteNodes2(Node head, int m, int n) {
        Node pointer1 = head;
        Node pointer2;
        while (pointer1 != null) {
            for (int i = 1; i < m && pointer1.next != null; i++) {
                pointer1 = pointer1.next;
            }
            pointer2 = pointer1.next;
            for (int i = 1; i <= n && pointer2 != null; i++) {
                pointer2 = pointer2.next;
            }
            pointer1.next = pointer2;                                  //make connection
            pointer1 = pointer2;                                       //come together
        }
        return head;
    }

}

class Node {
    int value;
    Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    void printNode() {
        Node current = this;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
