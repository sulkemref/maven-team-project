package denis.week12;

public class RemoveDuplicatesLinkedList {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;


        Node current = node1;



        while (current.next != null)
        {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }

     //while (current.next != null) {

        // if (current.value != current.next.value) {
         //   last.next = current;
         //}

          //   current = current.next;


     //}
          //last.next = current;


        System.out.println("node1 = " + node1);

      }

        }










