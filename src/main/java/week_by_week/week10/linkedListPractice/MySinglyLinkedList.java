package week_by_week.week10.linkedListPractice;

import java.util.NoSuchElementException;

public class MySinglyLinkedList {

    public MyNode head;//this will keep the information of first node
    public MyNode tail;//this will keep the information of last node
    public int size;


    public boolean isEmpty() {
        return head == null;
    }


    public void add(int data) {
        MyNode myNode = new MyNode(data);

        if (isEmpty()) {
            head = tail = myNode;
        } else {
            tail.next = myNode;
            tail = myNode;
        }
        size++;
    }

    public void addFirst(int data) {
        MyNode myNode = new MyNode(data);

        if (isEmpty()) {
            head = tail = myNode;
        } else {
            myNode.next = head;
            head = myNode;
        }
        size++;
    }

    public void print() {
        MyNode current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public int indexOf(int value) {
        MyNode current = head;
        int count = 0;
        while (current != null) {
            if (current.value == value) {
                return count;
            }
            count++;
            current = current.next;
        }

        return -1;
    }

    public void deleteByValue(int value) {
        if (isEmpty()) throw new NoSuchElementException("No node exists for deleting");

        MyNode prev = head;
        MyNode current = head;
//this is the code provided by Fatih in class.
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;//Ex -Tail will be eligible for Garbage Collection
                } else {
                    prev.next = current.next;
                    current.next = null;// Current will be eligible for Garbage Collection
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }
}
