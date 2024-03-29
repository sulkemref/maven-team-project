package kemal.node_practice;

public class NodeUtils {

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

    public static void printListNode(ListNode head){
        while (head!=null){
            System.out.print(head.val+ " => ");
            head=head.next;
        }
        System.out.print("null\n");
    }

    public static ListNode reverseListNode(ListNode head){
        ListNode present = head;
        ListNode prev = null;
        ListNode next;
        while (present!=null){
            next = present.next;
            present.next=prev;
            prev=present;
            present=next;
        }
        return prev;
    }

}
