package kemal.mentor_tasks.week16;

import kemal.utilities.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Linked_Lists {

//    https://leetcode.com/problems/intersection-of-two-linked-lists/description/

    public ListNode getIntersectionNodeSet(ListNode headA, ListNode headB) { //Time O(n) Space O(n)
        if(headA==null||headB==null)
            return null;

        Set<ListNode> set = new HashSet<>();

        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            if(set.contains(headB))
                return headB;
            headB=headB.next;
        }

        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { //Time O(n) Space O(1)
        if(headA==null||headB==null)
            return null;

        ListNode currentA = headA;
        ListNode currentB = headB;

        int aCount=0;
        int bCount=0;

        while(currentA!=null){
            aCount++;
            currentA=currentA.next;
        }

        while(currentB!=null){
            bCount++;
            currentB=currentB.next;
        }

        int diff = Math.abs(aCount-bCount);

        while(diff>0){
            if(aCount>bCount){
                headA=headA.next;
            }else{
                headB=headB.next;
            }
            diff--;
        }

        while(headA!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }

        return null;

    }
}
