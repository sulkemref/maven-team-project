package almi.JavaCodingTasks.week16;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfList {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> listNodes = new HashSet<>();

        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA!=null){
           listNodes.add(currentA);
           currentA = currentA.next;
        }

        while (currentB != null) {
            if (listNodes.contains(currentB)){
                return currentB;
            } currentB = currentB.next;
        }

        return null;

    }


}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

