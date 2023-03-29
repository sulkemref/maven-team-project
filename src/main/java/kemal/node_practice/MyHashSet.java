package kemal.node_practice;

public class MyHashSet {

//    https://leetcode.com/problems/design-hashset/

    ListNode head;
    ListNode tail;
    int key;

    public MyHashSet() {

    }

    public void add(int key) {
        if(contains(key))
            return;
        ListNode node = new ListNode(key);
        if (head==null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void remove(int key) {
        if(head==null)
            return;
        ListNode present = head;
        ListNode previous = head;
        while (present!=null){
            if(present.val==key){
                if(present==head) {
                    head = present.next;
                    present.next = null;
                }else if(present==tail) {
                        tail=previous;
                        tail.next=null;
                }else{
                    previous.next=present.next;
                    present.next=null;
                }
                    return;
                }
            previous=present;
            present=present.next;
        }
    }

    public boolean contains(int key) {
        if (head==null)
            return false;
        ListNode present = head;
        while (present!=null){
            if(present.val==key){
                return true;
            }
            present=present.next;
        }
        return false;
    }

}
