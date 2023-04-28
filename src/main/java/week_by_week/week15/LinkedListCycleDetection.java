package week_by_week.week15;


import java.util.HashSet;
import java.util.Set;


public class LinkedListCycleDetection {


    public ListNode detectCycleSet(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        ListNode current = head;

        while(current != null){
            if(!set.add(current)){
                return current;
            }

            current = current.next;
        }
        return null;
    }
    public ListNode detectCycleTwoPointer(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    void print() {
        ListNode current = this;

        while (current != null) {
            System.out.print(current.val + " -> ");

            current = current.next;

            if (current == null) {
                System.out.print("null");
            }
        }
        System.out.println();
    }
}

class MyLinkedList {

    ListNode head;
    ListNode tail;

    void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}
