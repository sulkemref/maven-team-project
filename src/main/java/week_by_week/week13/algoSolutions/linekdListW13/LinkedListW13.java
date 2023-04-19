package week_by_week.week13.algoSolutions.linekdListW13;



public class LinkedListW13<E> {

    public NodeW13<E> head;
    public NodeW13<E> tail;

    public int size;


    public void add(E value) {
        NodeW13<E> newNode = new NodeW13<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }


    public void print() {
        NodeW13<E> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
            if (current == null) {
                System.out.print(" null");
            }
        }
        System.out.println();
    }

}
