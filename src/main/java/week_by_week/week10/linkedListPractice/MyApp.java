package week_by_week.week10.linkedListPractice;

import java.util.LinkedList;

public class MyApp {

    public static void main(String[] args) {

        MyNode myNode1 = new MyNode(100);
        System.out.println(myNode1.next);
        System.out.println(myNode1.value);
        System.out.println(myNode1);


        MyNode myNode2 = new MyNode(200);
        System.out.println(myNode2);
        myNode1.next=myNode2;
        System.out.println(myNode1);
        System.out.println(myNode1.next);
        System.out.println(myNode2);

        System.out.println("======================================================================");

        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        System.out.println(mySinglyLinkedList.isEmpty());

        System.out.println("======================================");
        mySinglyLinkedList.print();
        mySinglyLinkedList.add(5);
        mySinglyLinkedList.add(10);
        System.out.println(mySinglyLinkedList.isEmpty());
        System.out.println("=======================================");
        mySinglyLinkedList.addFirst(20);
        mySinglyLinkedList.print();
        System.out.println();
        System.out.println(mySinglyLinkedList.indexOf(5));
        System.out.println(mySinglyLinkedList.indexOf(20));
        System.out.println(mySinglyLinkedList.indexOf(10));
        System.out.println(mySinglyLinkedList.indexOf(100));
        mySinglyLinkedList.deleteByValue(10);
        mySinglyLinkedList.print();
    }
}

