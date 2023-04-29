package kemal.mentor_tasks.week15;

import kemal.utilities.MyDoubleLinkedList;

public class DoubleLinkListTest {

    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> dl = new MyDoubleLinkedList<>();

        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.addLast(4);


        dl.printMyDoubleLinkedList();
        System.out.println(dl.size);

       dl.reverseDoubleLinkedList();

        dl.printMyDoubleLinkedList();

//        while (dl.tail!=null){
//            System.out.print(dl.tail.value +" ");
//            dl.tail=dl.tail.prev;
//        }
//
//        System.out.println();
//
//        while (dl.head!=null){
//            System.out.print(dl.head.value +" ");
//            dl.head=dl.head.next;
//        }

        System.out.println(dl.containsValue(2));


    }
}
