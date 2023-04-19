package week_by_week.week14;


import java.util.Deque;
import java.util.LinkedList;


public class PalindromeLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(6);
        myLinkedList.add(2);
        myLinkedList.add(1);

        myLinkedList.head.print();

        System.out.println(withTwoPointer(myLinkedList.head));


    }

    public static boolean withStackSimple(ListNode head) {

        Deque<Integer> stack = new LinkedList<>();

        ListNode current = head;

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        current = head;

        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    public static boolean withListNodeStack(ListNode head) {

        Deque<ListNode> stack = new LinkedList<>();

        ListNode current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        current = head;

        ListNode prev = null;
        // it compares each node once.
        // we need to keep previous if linked-list size is even number
        while (current != stack.peek() && prev != stack.peek()) {   // object equality not value
            if (current.val != stack.pop().val) return false;
            prev = current;
            current = current.next;
        }

        return true;
    }

    public static boolean withTwoPointer(ListNode head) {

        ListNode slow = head, fast = head, prev, nextNode, current;

        // find middle point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse 2nd half of linked list
        prev = slow;
        current = slow.next;
        prev.next = null;   // we break the reverse cycle and avoid an endless loop.
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // palindrome check : first half and second half
        ListNode left = head;
        ListNode right = prev;
        while (left != null && right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
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
