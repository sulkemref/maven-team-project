package kemal.node_practice;

public class Merge_Two_Sorted_Lists {

//    https://leetcode.com/problems/merge-two-sorted-lists/

    public static void main(String[] args) {

//       int[] arr1 = {1,2,4};
//       int[] arr2 = {1,3,4};
        int[] arr1 = {5};
        int[] arr2 = {1,2,4};

        ListNode list1 = NodeUtils.createListNodeFromArray(arr1);
        ListNode list2 = NodeUtils.createListNodeFromArray(arr2);

        System.out.println("List 1:");
        NodeUtils.printListNode(list1);
        System.out.println("List 2:");
        NodeUtils.printListNode(list2);

        ListNode result = mergeTwoLists(list1,list2);

        System.out.println("Result:");
        NodeUtils.printListNode(result);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head = (list1.val<=list2.val)?list1:list2;
        if(head==list1){
            list1=list1.next;
        }else{
            list2=list2.next;
        }
        ListNode tail = head;

        while(list1!=null&&list2!=null){
                if(list1.val==list2.val){
                    tail.next=list1;
                    tail=list1;
                    list1=list1.next;
                    tail.next=list2;
                    tail=list2;
                    list2=list2.next;
                }else if(list1.val<list2.val){
                    tail.next=list1;
                    tail=list1;
                    list1=list1.next;
                }else {
                    tail.next=list2;
                    tail=list2;
                    list2=list2.next;
                }
            }
            if(list1!=null){
                tail.next=list1;
            }else {
                tail.next=list2;
            }

        return head;
    }
}
