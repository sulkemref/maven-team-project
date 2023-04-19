package kemal.node_practice;

import org.w3c.dom.NodeList;

public class Delete_Node_in_a_Linked_List {

//    https://leetcode.com/problems/delete-node-in-a-linked-list/

    int[] arr1 ={4,5,1,9};
    int[] n1 = {5};
    int[] n2= {4};
    int[] n3={9};
    ListNode head = NodeUtils.createListNodeFromArray(arr1);
    ListNode node1 = NodeUtils.createListNodeFromArray(n1);
    ListNode node2 = NodeUtils.createListNodeFromArray(n2);
    ListNode node3 = NodeUtils.createListNodeFromArray(n3);


    public static void main(String[] args) {

        Delete_Node_in_a_Linked_List obj = new Delete_Node_in_a_Linked_List();

        NodeUtils.printListNode(obj.head);
        obj.deleteNode(obj.node1);

        NodeUtils.printListNode(obj.head);


    }
    public void deleteNode(ListNode node) {
        ListNode present = head;
        ListNode prev= head;
        if(head==null||node==null)
            return;
        if(head.val==node.val){
            head=head.next;
            prev=null;
            return;
        }
        while (present!=null){
            if(present.val==node.val&&present.next==null){
                prev.next=null;
                return;
            }
            if(present.val==node.val&&present.next!=null){
                prev.next=present.next;
                present.next=null;
                return;
            }
            prev=present;
            present=present.next;
        }

    }
}
