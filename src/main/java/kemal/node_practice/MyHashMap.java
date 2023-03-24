package kemal.node_practice;


public class MyHashMap {

    //https://leetcode.com/problems/design-hashmap/

    ListNode head;
    ListNode tail;
    int val;

    public MyHashMap() {

    }

    public void put(int key, int value) {
        ListNode keyNode = new ListNode(key);
        ListNode valueNode = new ListNode(value);
        if (head==null){
            head=keyNode;
            tail=valueNode;
            head.next=tail;
        }
        ListNode present = head;
        while (present!=null){
            if(present.val==key){
                present.next.val=value;
                return;
            }
            present = present.next.next;
        }
        keyNode.next=valueNode;
        tail.next=keyNode;
        tail=valueNode;
    }


    public int get(int key) {
        if (head==null)
            return -1;
        ListNode present = head;
        while (present!=null){
            if(present.val==key){
                return present.next.val;
            }
            present = present.next.next;
        }
        return -1;
    }

    public void remove(int key) {
        if (head==null)
            return;
        ListNode present = head;
        ListNode prev = head;
        while (present!=null){
            if(present.val==key){
                if(present.next==tail){
                    tail=prev;
                    present.next=null;
                    tail.next=null;
                    if(present==head){head=tail=null;}// Fatih
                } else if (present==head) {
                    head=present.next.next;
                    present.next.next=null;
                    present.next=null;
                }else {
                    prev.next=present.next.next;
                    present.next.next=null;
                    present.next=null;
                }
                return;

            }
            prev=present.next;
            present = present.next.next;
        }

    }
}
