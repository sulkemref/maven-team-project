package kemal.utilities;

import java.util.Objects;

public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      private final int random = (int)(Math.random() * 100);
      public TreeNode(int x) { val = x; }

      @Override
      public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", hashCode=" + hashCode() +
                    '}';
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TreeNode treeNode = (TreeNode) o;

            if (val != treeNode.val) return false;
            if (random != treeNode.random) return false;
            if (!Objects.equals(left, treeNode.left)) return false;
            return Objects.equals(right, treeNode.right);
      }

      @Override
      public int hashCode() {
            int result = val;
            result = 31 * result + (left != null ? left.hashCode() : 0);
            result = 31 * result + (right != null ? right.hashCode() : 0);
            result = 31 * result + random;
            return result;
      }
}
