package almi.JavaCodingTasks.week16;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfList {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> listNodes = new HashSet<>();
        // create Set because we will be looking for intersection by NodeAddress NOT NodeValues

        ListNode currentA = headA;
        ListNode currentB = headB;
        // specifying current node(heads)

        while (currentA!=null){
           listNodes.add(currentA);             // add each element of A to our Set
           currentA = currentA.next;            // iterate after each elem
        }

        while (currentB != null) {
            if (listNodes.contains(currentB)){ // if currentB(head) {byAddress} is in our Set
                return currentB;
            } currentB = currentB.next;        // iterate to next node
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

