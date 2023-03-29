package kemal.node_practice;

public class Odd_Even_LinkedList {

//    https://leetcode.com/problems/odd-even-linked-list/

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5}; // [1,3,5,2,4]
        int[] arr2 = {2,1,3,5,6,4,7}; // [2,3,6,7,1,5,4]

        ListNode listNode1 = NodeUtils.createListNodeFromArray(arr1);
        NodeUtils.printListNode(listNode1);

        listNode1 = oddEvenList(listNode1);
        NodeUtils.printListNode(listNode1);


        ListNode listNode2 = NodeUtils.createListNodeFromArray(arr2);
        NodeUtils.printListNode(listNode2);

        listNode2 = oddEvenList(listNode2);
        NodeUtils.printListNode(listNode2);

    }
    public static ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if (head.next==null||head.next.next==null){
            return head;
        }
        ListNode odd;
        ListNode resultOdd;
        ListNode even;
        ListNode resultEven;
        ListNode current = head.next.next;
        resultOdd=odd=head;
        resultEven=even=head.next;
        int checkNode = 3;
        while (current!=null){
            if (checkNode%2!=0){
                odd.next=current;
                odd=odd.next;
            }else {
                even.next=current;
                even=even.next;
            }
            current=current.next;
            checkNode++;
        }
        even.next=null;
        odd.next=resultEven;
        return resultOdd;
    }
}
