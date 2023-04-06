package kemal.mentor_tasks.week12.interview;

public class TestMyDoubleLinkedList {

    public static void main(String[] args) {

        MyDoubleLinkedList<Integer> myList = new MyDoubleLinkedList<>();

        for (int i = 0; i< 11;i++){
            myList.addFirst(i);
        }

        System.out.println(myList.getSize());
        myList.printMyDoubleLinkedList();

        myList.deleteByValueMyDoubleLinkedList(0);

        System.out.println(myList.getSize());
        myList.printMyDoubleLinkedList();

        myList.deleteByValueMyDoubleLinkedList(10);

        System.out.println(myList.getSize());
        myList.printMyDoubleLinkedList();

        myList.deleteByValueMyDoubleLinkedList(5);

        System.out.println(myList.getSize());
        myList.printMyDoubleLinkedList();






    }
}
