package kemal.mentor_tasks.week13;

public class Remove_Linked_List_Elements {

//    https://leetcode.com/problems/remove-linked-list-elements/

    public ListNode13 removeElements(ListNode13 head, int val) {
        if(head==null)
            return null;
        ListNode13 current=head;
        ListNode13 priv = current;

        while(current!=null){
            if(current.val==val){
                if(current==head){
                    head=head.next;
                    current.next=null;
                    current=priv=head;
                }else if(current.next==null){
                    priv.next=null;
                    current=null;
                }else{
                    priv.next=current.next;
                    current.next=null;
                    current=priv.next;
                }
            }else{
                priv=current;
                current=current.next;
            }
        }
        return head;
    }
}

