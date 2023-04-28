package almi.JavaCodingTasks.week15;

import java.util.HashSet;
/** Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null **/
public class LLCycle {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;


        System.out.println(isCycle(n1));

    }


    public static ListNode isCycle(ListNode head){

        HashSet<ListNode> reversedList = new HashSet<>();

        ListNode current = head;

        while (current != null){

            if (reversedList.contains(current)) return current;

            reversedList.add(current);
            current = current.next;

        }

        return null;
    }

}
