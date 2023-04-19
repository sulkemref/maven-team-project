package week_by_week.week12.aloSolutions.linekdListW12;


public class LinkedListW12<E> {

    public NodeW12<E> head;
    public NodeW12<E> tail;

    public int size;


    public void add(E value) {
        NodeW12<E> newNode = new NodeW12<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }


    public void print() {
        NodeW12<E> current = head;
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
