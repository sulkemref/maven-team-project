package kemal.utilities;

public class MyDoubleLinkedList<T> {

    public DoubleListNode<T> head;
    public DoubleListNode<T> tail;

    public int size;

    public boolean isEmpty(){
        return head==null&&tail==null;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(T value){
        DoubleListNode<T> newNode = new DoubleListNode<>(value);
        if(isEmpty()){
            head=tail=newNode;
        }else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    public void printMyDoubleLinkedList(){
        if(isEmpty()){
            System.out.println("null");
            return;
        }
        DoubleListNode<T> current = head;

        while (current!=null){
            System.out.print(current.value + " => ");
            current=current.next;
        }
        System.out.println("null");
    }

    public void deleteByValueMyDoubleLinkedList(T value){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        if(size==1&&head.value==value){
            head=tail=null;
            size--;
            return;
        }

        if(head.value==value){
            head=head.next;
            head.prev.next=null;
            head.prev=null;
        }else if(tail.value==value){
            tail=tail.prev;
            tail.next.prev=null;
            tail.next=null;
        }else {
            DoubleListNode<T> current = head;
            while (current!=null){
                if(current.value==value){
                    current.prev.next=current.next;
                    current.next.prev=current.prev;
                    current.next=null;
                    current.prev=null;
                }
                current=current.next;
            }
        }
        size--;
    }

    // print

}
