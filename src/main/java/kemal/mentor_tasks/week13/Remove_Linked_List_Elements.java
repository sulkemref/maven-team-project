package kemal.mentor_tasks.week13;

import kemal.utilities.ListNode;
import kemal.utilities.NodeUtility;

public class Remove_Linked_List_Elements {

//    https://leetcode.com/problems/remove-linked-list-elements/

    public static void main(String[] args) {

        Remove_Linked_List_Elements obj = new Remove_Linked_List_Elements();

        ListNode head = NodeUtility.createListNodeFromArray(new int[]{1,2,6,3,4,5,6});

        ListNode result = obj.removeElements(head,6);

        NodeUtility.printListNode(result);


    }

    public ListNode removeElements(ListNode head, int val) { //time O(n) Space O(n)
        if(head==null)
            return null;
        ListNode current=head;
        ListNode priv = current;

        while(current!=null){
            if(current.val==val){
                if(current==head){
                    head=head.next;
                    current.next=null;
                    current=priv=head;
                }else if(current.next==null){
                    priv.next=null;
                    current=null;
                }else{
                    priv.next=current.next;
                    current.next=null;
                    current=priv.next;
                }
            }else{
                priv=current;
                current=current.next;
            }
        }
        System.gc();
        return head;
    }
}

