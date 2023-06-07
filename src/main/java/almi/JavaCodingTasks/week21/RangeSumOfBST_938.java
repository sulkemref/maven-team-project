package almi.JavaCodingTasks.week21;

public class RangeSumOfBST_938 {


     /**
        Given the root node of a binary search tree and two integers low and high,
        return the sum of values of all nodes with a value in the inclusive range [low, high].
     **/


     public static int sumOfBSTRange(TreeNode root, int low, int high) {

         int sum = 0;

         if (root == null) return 0;

         if (root.val >= low && root.val <= high) sum += root.val;

         if (root.val > low) sum += sumOfBSTRange(root.left, low, high);

         if (root.val < high) sum += sumOfBSTRange(root.right, low, high);

         return sum;
     }




    public static void main(String[] args) {

        System.out.println(sumOfBSTRange(new TreeNode(10), 7, 15));


    }

}
