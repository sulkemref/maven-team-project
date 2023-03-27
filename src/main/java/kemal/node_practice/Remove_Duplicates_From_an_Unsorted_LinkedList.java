package kemal.node_practice;

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicates_From_an_Unsorted_LinkedList {

//    https://leetcode.com/problems/remove-duplicates-from-an-unsorted-linked-list/description/
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,2};
        int[] arr2 = {2,1,1,2};

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        listNode1=deleteDuplicatesUnsorted(listNode1);
        NodeUtils.printListNode(listNode1);

        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        listNode2=deleteDuplicatesUnsorted(listNode2);
        NodeUtils.printListNode(listNode2);

    }

    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        Map<Integer,Boolean> map = new HashMap<>();
        ListNode current = head;
        while(current!=null){
            if(map.containsKey(current.val)){
                map.put(current.val,true);
            }else{
                map.put(current.val,false);
            }
            current=current.next;
        }

        ListNode dummy = new ListNode(-1,head);
        current = dummy.next;
        ListNode priv = dummy;

        while(current!=null){
            if(map.get(current.val)){
                priv.next=current.next;
            }else{
                priv=current;
            }
            current=current.next;
        }
        return dummy.next;
    }
}
