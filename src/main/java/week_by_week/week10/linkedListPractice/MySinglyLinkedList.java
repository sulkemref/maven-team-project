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

    public int indexOf(int index) {
        MyNode current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.value;
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

        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;

                } else if (current == tail) {
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }
}
