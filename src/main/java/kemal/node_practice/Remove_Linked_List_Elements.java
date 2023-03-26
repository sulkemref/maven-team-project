package kemal.node_practice;

public class Remove_Linked_List_Elements {

//    https://leetcode.com/problems/remove-linked-list-elements/

    public static void main(String[] args) {

        int[] arr1 = {1,2,6,3,4,5,6};
        int val1 = 6;

        int[] arr2 = {7,7,7,7};
        int val2 = 7;

        int[] arr3 = {};
        int val3 = 1;

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        ListNode result1 = removeElements(listNode1,val1);
        NodeUtils.printListNode(result1);

        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        ListNode result2 = removeElements(listNode2,val2);
        NodeUtils.printListNode(result2);

        ListNode listNode3 = NodeUtils.createListNodeFromArray(arr3);
        NodeUtils.printListNode(listNode3);

        ListNode result3 = removeElements(listNode3,val3);
        NodeUtils.printListNode(result3);

    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        if(head.next==null&&head.val==val)
            return null;
        if(head.next==null&&head.val!=val)
            return head;
        ListNode present=head;
        ListNode priv = present;

        while(present!=null){
            if(present.val==val){
                if(present==head){
                    head=head.next;
                    present=head;
                    priv = present;
                }else if(present.next!=null){
                    priv.next=present.next;
                    present=priv.next;
                }else{
                    priv.next=null;
                    present=null;
                }
            }else {
                priv = present;
                present=present.next;
            }
        }
        return head;
    }
}
