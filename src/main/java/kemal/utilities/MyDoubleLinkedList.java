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

    public void addLast(T value){
        DoubleListNode<T> newNode = new DoubleListNode<>(value);
        if(isEmpty()){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    public void printMyDoubleLinkedList(){
        if(isEmpty()){
            System.out.println("null");
            return;
        }
        DoubleListNode<T> current = head;
        System.out.print("null ← ");

        while (current!=null){
            System.out.print(current.value + (current.next!=null?" ⇄ ":""));
            current=current.next;
        }
        System.out.println(" → null");
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

    public void reverseDoubleLinkedList(){
//        reverseDoubleLinkedListFromTail();
        reverseDoubleLinkedListFromHead();
    }

    public void reverseDoubleLinkedListFromTail(){

        DoubleListNode<T> current = tail;
        DoubleListNode<T> prev = null;
        head=current;

        while (current!=null){
            current.next=current.prev;
            current.prev=prev;
            prev=current;
            current=current.next;
        }
        tail=prev;
    }

    public void reverseDoubleLinkedListFromHead(){

        DoubleListNode<T> current = head;
        DoubleListNode<T> next = null;
        tail=current;

        while (current!=null){
            current.prev=current.next;
            current.next=next;
            next=current;
            current=current.prev;
        }
        head=next;
    }

    public boolean containsValue(T value){
        DoubleListNode<T> currentH = head;
        DoubleListNode<T> currentT = tail;

        while (currentH!=currentT.prev&&currentH!=currentT){
            if(currentH.value==value||currentT.value==value){
                return true;
            }
            currentH=currentH.next;
            currentT=currentT.prev;
        }
        return false;
    }

}
