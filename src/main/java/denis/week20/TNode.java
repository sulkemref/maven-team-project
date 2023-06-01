package denis.week20;



 public class TNode {
     int value;
     TNode left;
     TNode right;
     TNode() {}
     TNode(int val) { this.value = val; }
    TNode(int val, TNode left, TNode right) {
        this.value = val;
        this.left = left;
         this.right = right;
     }
 }

