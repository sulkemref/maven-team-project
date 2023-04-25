package almi.JavaCodingTasks.week14;

import kemal.node_practice.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList {

    private static boolean stackSolution(ListNode head){
        Deque<Integer> stack = new LinkedList<>();
        ListNode current = head;

        while (current != null){
            stack.push(current.val);
            current = current.next;
        }

        current = head;
        while (current != null){
            if (current.val != stack.pop())
                return false;
            current = current.next;
        }
        return true;
    }


}
