package week_by_week.week16;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {


    /**
     * TC - O(n) SC - O(n)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode withSetTwoLoop(ListNode headA, ListNode headB){

        if (headA == null || headB == null){
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode currentA = headA;
        ListNode currentB = headB;


        while(currentA != null){
            set.add(currentA);
            currentA = currentA.next;
        }

        while(currentB != null){
            if (set.contains(currentB)){
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;
    }

    public ListNode withSetOneLoop(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        HashSet<ListNode> setA = new HashSet<>();
        HashSet<ListNode> setB = new HashSet<>();
        ListNode cA = headA;
        ListNode cB = headB;
        while (cA != null || cB != null) {
            setA.add(cA);
            setB.add(cB);
            if (setA.contains(cB)) return cB;
            if (setB.contains(cA)) return cA;
            if (cA != null) cA = cA.next;
            if (cB != null) cB = cB.next;
        }
        return null;
    }

    /**
     * TC - O(n) SC - O(1)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode withFindingLength(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int sizeA = length(headA), sizeB = length(headB);
        ListNode currentA = headA, currentB = headB;

        if (sizeA > sizeB) {
            int diff = sizeA - sizeB;
            for (int i = 1; i <= diff; i++) {
                currentA = currentA.next;
            }
        } else {
            int diff = sizeB - sizeA;
            for (int i = 1; i <= diff; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != null && currentB != null) {
            if (currentA == currentB) return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
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