package week_by_week.week10.linkedListPractice;

public class MyApp {

    public static void main(String[] args) {

        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        mySinglyLinkedList.print();
        mySinglyLinkedList.add(5);
        mySinglyLinkedList.add(10);
        mySinglyLinkedList.addFirst(20);
        mySinglyLinkedList.print();
        System.out.println();
        System.out.println(mySinglyLinkedList.indexOf(0));
        System.out.println(mySinglyLinkedList.indexOf(1));
        System.out.println(mySinglyLinkedList.indexOf(2));
        System.out.println(mySinglyLinkedList.indexOf(5));
        mySinglyLinkedList.deleteByValue(5);
        mySinglyLinkedList.print();


    }
}
