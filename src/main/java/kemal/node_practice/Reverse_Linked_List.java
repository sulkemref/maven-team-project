package kemal.node_practice;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Linked_List {

//    https://leetcode.com/problems/reverse-linked-list/

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2};
        int[] arr3 = {};
        int[] arr4 = {1};

        ListNode list1 = createListNodeFromArray(arr1);
        ListNode list2 = createListNodeFromArray(arr2);
        ListNode list3 = createListNodeFromArray(arr3);
        ListNode list4 = createListNodeFromArray(arr4);



        printListNode(list1);
        printListNode(list2);
        printListNode(list3);
        printListNode(list4);

        System.out.println("======================================");

        printListNode(reverseListShort(list1));
        printListNode(reverseListShort(list2));
        printListNode(reverseListShort(list3));
        printListNode(reverseListShort(list4));


    }
    public static ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode tail = head;
        ListNode prev = head;
        ListNode newHead = null;
        ListNode newTail = newHead;
        while (head.next!=null){
            if(tail.next==null){
                if(newHead==null){
                    newHead=tail;
                    newTail=newHead;
                }else{
                    newTail.next=tail;
                    newTail=tail;
                }
                prev.next=null;
                tail=head;
            }
            prev=tail;
            tail=tail.next;
        }
        newTail.next=head;
        newTail=head;
        return newHead;
    }

    public static ListNode reverseListShort(ListNode head){
        ListNode present = head;
        ListNode prev = null;
        ListNode next = null;
        while (present!=null){
            next = present.next;
            present.next=prev;
            prev=present;
            present=next;
        }
        return prev;
    }

    public static ListNode createListNodeFromArray(int[] arr){
        if(arr.length==0){
            return null;
        }
        ListNode head;
        ListNode tail;
        head=tail=new ListNode(arr[0]);
        if (arr.length == 1) {
            return head;
        }
        for(int i = 1 ; i<arr.length; i++){
           tail.next=new ListNode(arr[i]);
           tail=tail.next;
        }
        return head;
    }
    public static void printListNode(ListNode head){
        System.out.println();
        while (head!=null){
            System.out.print(head.val+ " => " +((head.next==null)?"null":""));
            head=head.next;
        }
        System.out.println();
    }

    public static int indexOf(ListNode head, int value){
        int index = 0;
        ListNode current = head;
        while (current!=null){
            if (current.val==value)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }

}
