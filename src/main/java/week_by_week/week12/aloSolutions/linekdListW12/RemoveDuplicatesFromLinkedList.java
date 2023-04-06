package week_by_week.week12.aloSolutions.linekdListW12;

public class RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {

        LinkedListW12<Integer> linkedList = new LinkedListW12<>();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4);

        linkedList.print();
        removeDuplicatesFromLinkedListTwoPointer(linkedList.head);
        linkedList.print();

        LinkedListW12<String> stringLinkedList = new LinkedListW12<>();


        stringLinkedList.add("cydeo");
        stringLinkedList.add("cydeo");
        stringLinkedList.add("hello");
        stringLinkedList.add("hello");
        stringLinkedList.add("hello");
        stringLinkedList.add("maven-team");
        stringLinkedList.add("school");
        stringLinkedList.add("school");
        stringLinkedList.add("school");

        stringLinkedList.print();
        removeDuplicatesFromLinkedListOnePointer(stringLinkedList.head);
        stringLinkedList.print();
    }

    /**
     * Time Complexity O(n) Space Complexity O(1)
     * @param head
     * @return
     * @param <E>
     */
    public static <E> NodeW12<E> removeDuplicatesFromLinkedListTwoPointer(NodeW12<E> head) {
        NodeW12<E> slow = head;
        NodeW12<E> fast = head.next;

        while (fast != null) {

                if (slow.value == fast.value) {
                    fast = fast.next;
                    slow.next = fast;
                } else {
                    slow = fast;
                    fast = fast.next;
                }
        }

        return head;
    }

    /**
     * Time Complexity O(n) Space Complexity O(1)
     * @param head
     * @return
     * @param <E>
     */
    public static <E> NodeW12<E> removeDuplicatesFromLinkedListOnePointer(NodeW12<E> head) {
        NodeW12<E> current = head;

        while (current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}
