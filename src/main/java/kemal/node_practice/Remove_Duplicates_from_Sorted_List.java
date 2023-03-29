package kemal.node_practice;

public class Remove_Duplicates_from_Sorted_List {

    public static void main(String[] args) {

        int[] arr1 = {1,1,1};
        int[] arr2 = {1,1,2,2,2,2,2,3,3,5,6,9,9,9};

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);
        NodeUtils.printListNode(deleteDuplicates(listNode1));

        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);
        NodeUtils.printListNode(deleteDuplicates(listNode2));

    }
    public static ListNode deleteDuplicates(ListNode head) {
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
