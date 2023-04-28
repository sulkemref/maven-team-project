package kemal.mentor_tasks.week15;

import kemal.utilities.MyDoubleLinkedList;

public class DoubleLinkListTest {

    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> dl = new MyDoubleLinkedList<>();

        System.out.println(dl.isEmpty());
        System.out.println(dl.size);
        dl.printMyDoubleLinkedList();

        dl.addFirst(10);
        dl.addFirst(20);
        dl.addLast(50);

        dl.printMyDoubleLinkedList();
        System.out.println(dl.size);

        dl.deleteByValueMyDoubleLinkedList(10);

        dl.printMyDoubleLinkedList();
        System.out.println(dl.size);
        System.out.println(dl.isEmpty());

        dl.reverseDoubleLinkedList();

        dl.printMyDoubleLinkedList();


    }
}
