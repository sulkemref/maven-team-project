package kemal.mentor_tasks.week12.interview;

public class DoubleListNode<T> {

    public DoubleListNode<T> next;
    public DoubleListNode<T> prev;

    public T value;

    public DoubleListNode(T value) {
        this.value = value;
    }
}
