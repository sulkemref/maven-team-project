package week_by_week.week13.algoSolutions.linekdListW13;


public class RemoveLinkedListElements {

    public static void main(String[] args) {

        LinkedListW13<Integer> linkedList = new LinkedListW13<>();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);

        linkedList.add(4);

        linkedList.add(1);
        linkedList.add(4);

        linkedList.add(1);
        linkedList.add(3);

        linkedList.print();


        NodeW13<Integer> integerNodeW13 = recursiveSolution(linkedList.head, 1);
        integerNodeW13.printNode();


    }

    /**
     * This is my solution Time Complexity O(n) Space Complexity O(1)
     *
     * @param head
     * @param value
     * @param <E>
     * @return
     */
    public static <E> NodeW13<E> removeLinkedListElementsByValue(NodeW13<E> head, E value) {

        while (head != null && head.value == value) {
            head = head.next;
        }

        NodeW13<E> current = head;
        NodeW13<E> prev = head;

        while (current != null) {
            if (current.value == value) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;

        }
        return head;
    }

    /**
     * Time Complexity O(n) Space Complexity O(1)
     *
     * @param head
     * @param value
     * @param <E>
     * @return
     */
    public static <E> NodeW13<E> onePointer(NodeW13<E> head, E value) { // 1 1 2 2 4 4 1 3 4 - 1

        if (head == null) return null;
        NodeW13<E> current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
  //1 2 2 4 4 3 4
        return head.value == value ? head.next : head;
    }

    /**
     * The time complexity of this recursive solution is also O(n), where n is the number of nodes in the linked list. This is because we need to examine each node in the linked list at least once to determine if its value is equal to value.
     *
     * The space complexity of this recursive solution is O(n) as well. This is because each recursive call adds a new stack frame to the call stack, which takes up space. In the worst case, when all nodes in the linked list have the value, the call stack will have n stack frames, where n is the number of nodes in the linked list.
     *
     * Overall, recursive solutions can be elegant and concise, but they may have a higher space complexity due to the use of the call stack.
     *
     * @param head
     * @param value
     * @return
     * @param <E>
     */
    public static <E> NodeW13<E> recursiveSolution(NodeW13<E> head, E value) {

        // If the head node is null, return null because we have reached the end of the linked list.
        if (head == null) {
            return null;
        }

        // Call recursiveSolution recursively on the next node head.next of the current node.
        // This line of code removes any nodes with value from the rest of the linked list by recursively calling recursiveSolution on the next node.
        head.next = recursiveSolution(head.next, value);

        // Check if the current head node has the value.
        // If it does, return the next node (head.next) as the new head of the linked list. Otherwise, return head as the head of the linked list.
        return head.value == value ? head.next : head;
    }
}
