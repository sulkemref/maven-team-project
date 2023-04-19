package kemal.mentor_tasks.week14;

import kemal.utilities.ListNode;

public class Palindrome_Linked_List {

    public boolean isPalindrome(ListNode head){
        if (head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        slow = reverseLinkedList(slow);

        while (head!=null&&slow!=null){
            if (slow.val!=head.val)
                return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    private ListNode reverseLinkedList(ListNode head){
        ListNode present = head;
        ListNode prev = null;
        ListNode next = null;
        while (present!=null){
            next=present.next;
            present.next=prev;
            prev=present;
            present=next;
        }
        return prev;
    }
}
