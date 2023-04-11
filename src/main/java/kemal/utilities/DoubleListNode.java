package kemal.utilities;

public class DoubleListNode<T> {

    public DoubleListNode<T> next;
    public DoubleListNode<T> prev;

    public T value;

    public DoubleListNode(T value) {
        this.value = value;
    }
}
