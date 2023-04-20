package kemal.mentor_tasks.week12;

public class Remove_Duplicates_from_Sorted_List {

//    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public ListNode deleteDuplicates(ListNode head) { // time O(n) space O(n)
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode dummy = new ListNode(-101,head);
        ListNode current = dummy;
        while (current.next!=null){
            if(current.next.val == dummy.val){
                current.next=current.next.next;
            }else {
                dummy.val=current.next.val;
                current=current.next;
            }
        }
        return dummy.next;

    }
}

