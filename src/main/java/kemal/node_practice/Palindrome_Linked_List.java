package kemal.node_practice;

import java.util.Stack;

public class Palindrome_Linked_List {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,2,1};

        ListNode listNode1  =  NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        System.out.println(isPalindromeStack(listNode1));
        System.out.println(isPalindrome(listNode1));


    }
    public static boolean isPalindromeStack(ListNode head) { // time and space O(n)
        if (head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        ListNode tail = head;
        Stack<Integer> stack = new Stack<>();
        while (tail!=null){
            stack.push(tail.val);
            tail=tail.next;
        }
        ListNode present = head;
        while (present!=null){
            if(stack.pop()!=present.val){
                return false;
            }
            present=present.next;
        }

        return true;
    }public static boolean isPalindrome(ListNode head) { //time O(n) space O(1)
        if (head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = slow;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow = NodeUtils.reverseListNode(slow);

        while (slow!=null){
            if(slow.val!= head.val)
                return false;
            slow=slow.next;
            head=head.next;
        }

        return true;
    }

}
