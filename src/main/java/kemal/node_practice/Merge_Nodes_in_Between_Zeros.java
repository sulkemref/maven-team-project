package kemal.node_practice;

public class Merge_Nodes_in_Between_Zeros {

    public static void main(String[] args) {

//        https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

        int[] arr1 = {0,3,1,0,4,5,2,0}; // Output: [4,11]
        int[] arr2 = {0,1,0,3,0,2,2,0}; // Output: [1,3,4]
        int[] arr3 = {};

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        ListNode mergedList1 = mergeNodes(listNode1);
        NodeUtils.printListNode(mergedList1);

        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        ListNode mergedList2 = mergeNodes(listNode2);
        NodeUtils.printListNode(mergedList2);

        ListNode listNode3 = NodeUtils.createListNodeFromArray(arr3);
        NodeUtils.printListNode(listNode3);

        ListNode mergedList3 = mergeNodes(listNode3);
        NodeUtils.printListNode(mergedList3);


    }
    public static ListNode mergeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode result = head;
        ListNode tail = result;
        ListNode prev = result;
        head=head.next;
        int tempSum = 0;
        while(head!=null){
            if(head.val==0){
                tail.val=tempSum;
                prev=tail;
                tail=tail.next;
                tempSum=0;
            }else {
                tempSum+=head.val;
            }
            head=head.next;
        }
        prev.next=null;
        return result;
    }
}
