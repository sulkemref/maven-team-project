package kemal.node_practice;

public class Delete_N_Nodes_After_M_Nodes_of_a_Linked_List {

//    https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int m1 = 2;
        int n1 = 3;

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11};
        int m2 = 1;
        int n2 = 3;

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        ListNode listNodeResult1 = deleteNodes(listNode1,m1,n1);
        NodeUtils.printListNode(listNodeResult1);


        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        ListNode listNodeResult2 = deleteNodes(listNode2,m2,n2);
        NodeUtils.printListNode(listNodeResult2);

    }

    public static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode present = head;
        ListNode prev = head;
        int countM=m;
        while(present!=null){
            if(countM==0){
                for(int i = 0 ; i< n ; i++){
                    present = present.next;
                    if(present==null) {
                        prev.next = null;
                        return head;
                    }
                }
                prev.next = present;
                countM=m;
            }
            prev = present;
            present = present.next;
            countM--;
        }
        return head;
    }
}
