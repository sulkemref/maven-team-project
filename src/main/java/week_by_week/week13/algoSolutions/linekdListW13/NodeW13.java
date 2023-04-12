package week_by_week.week13.algoSolutions.linekdListW13;

public class NodeW13<E> {

    public NodeW13<E> next;
    public E value;

    public NodeW13(E value) {
        this.value = value;
    }

    public void printNode(){
        NodeW13<E> current = this;
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
