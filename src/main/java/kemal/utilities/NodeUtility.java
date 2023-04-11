package kemal.utilities;


import java.util.ArrayList;
import java.util.List;

public class NodeUtility {
    public static ListNode createListNodeFromArray(int[] arr){
        int length = arr.length;
        if(length==0){
            return null;
        }
        ListNode head;
        ListNode tail;
        head=tail=new ListNode(arr[0]);
        if (length == 1) {
            return head;
        }
        for(int i = 1 ; i<arr.length; i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }

    public static int[] createIntArrFromListNode(ListNode head){
        if(head==null){
            return null;
        }

        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current!=null){
            list.add(current.val);
            current=current.next;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static List<Integer> createIntegerListFromListNode(ListNode head){
        if(head==null){
            return null;
        }

        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current!=null){
            list.add(current.val);
            current=current.next;
        }

        return list;
    }

    public static void printListNode(ListNode head){
        while (head!=null){
            System.out.print(head.val+ " => " +((head.next==null)?"null":""));
            head=head.next;
        }
        System.out.println();
    }

    public static ListNode reverseListNode(ListNode head){
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
}
