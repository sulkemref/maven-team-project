package kemal.mentor_tasks.week15;

import kemal.utilities.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Linked_List_Cycle {

    //https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycleSet(ListNode head) { //Time O(n) Space O(n)

        ListNode current = head;
        Set<ListNode> set = new HashSet<>();
        while(current!=null){
            if(set.contains(current)){
                return current;
            }
            set.add(current);
            current=current.next;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) { //Time O(n) Space O(1)
        if(head==null)
            return null;
        ListNode fast = head;
        ListNode slow = fast;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                fast=head;
                while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }

}
