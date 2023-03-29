package kemal.node_practice;

public class Swapping_Nodes_in_a_LinkedList {

//    https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5}; //[1,4,3,2,5]
        int k1 = 2;

        int[] arr2 = {7,9,6,6,7,8,3,0,9,5}; //[7,9,6,6,8,7,3,0,9,5]
        int k2 = 5;

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        listNode1= swapNodes(listNode1,k1);
        NodeUtils.printListNode(listNode1);

        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        listNode2 = swapNodes(listNode2,k2);
        NodeUtils.printListNode(listNode2);



    }



    public static ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode kFromHead;
        ListNode kFromTail;
        ListNode current = head;
        ListNode priv = current;
        while (k>1){
            current=current.next;
            k--;
        }
        kFromHead=current;

        while (current.next!=null) {
            current=current.next;
            priv=priv.next;
        }

        kFromTail=priv;

        k=kFromHead.val;
        kFromHead.val=kFromTail.val;
        kFromTail.val=k;

        return head;
    }
}
