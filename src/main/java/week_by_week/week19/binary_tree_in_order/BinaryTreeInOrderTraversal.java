package week_by_week.week19.binary_tree_in_order;

import week_by_week.week17.treeReview.MyTree;
import week_by_week.week17.treeReview.Node;
import week_by_week.week17.treeReview.VisualizeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

    public static void main(String[] args) {

        Integer[] arr = {4, 15, 3, 5};
        MyTree myTree = new MyTree();

        for (Integer integer : arr) {
            myTree.insert(integer);
        }

        VisualizeTree.printTree(myTree.root, null, false);

        System.out.println(recursiveSolution(myTree.root));
        System.out.println(inorderTraversal(myTree.root));


    }

    /**
     <p>In this recursive solution, we define a helper function called helper.
     This function takes in the current node and the result list as parameters.</p>
     <p>The base case is when the node is null, in which case we simply return.
     Otherwise, we recursively call helper on the left child of the current node,
     add the value of the current node to the result list, and then recursively call
     inorderHelper on the right child of the current node.</p>
    <p>To use the inorderTraversal method, you can create a binary tree and pass its root node as an argument.
     The method will return a list containing the inorder traversal of the tree's nodes.</p>
    <p>The time complexity of the recursive solution is also O(N), where N is the number of
     nodes in the binary tree. Each node is visited exactly once in the inorder traversal.
     The space complexity is O(N) due to the recursive call stack, as the maximum depth of the recursion
     is equal to the height of the binary tree.</p>
     */
    public static List<Integer> recursiveSolution(Node root) {
        List<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    private static List<Integer> helper(Node node, List<Integer> list) {

        if (node == null) {
            return list;
        }
        helper(node.leftChild, list);
        list.add(node.value);
        helper(node.rightChild, list);
        return list;
    }

    /**
   <p>In the provided solution for the inorder traversal of a binary tree, we are visiting each node exactly once.
     For each node, we perform constant time operations such as stack push, pop, and adding the node's value to
     the result list. Therefore, the time complexity of the solution is O(N), where N is the number of nodes in the binary tree.</p>
     <p>In the worst-case scenario, where the binary tree is highly unbalanced and resembles a linked list, the number of nodes N is
     equal to the height of the tree. Thus, the time complexity can be considered O(N) or O(H), where H is the height of the tree.</p>
     <p>In terms of space complexity, the solution uses a stack to store nodes as we traverse the tree. In the worst-case scenario,
     where the binary tree is skewed and has a height of N, the stack can contain up to N nodes. Therefore, the space complexity is also O(N).</p>

     */
    public static List<Integer> inorderTraversal(Node root){
        List<Integer>list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (!stack.isEmpty() || current !=null){
            if (current!=null){
                stack.push(current);
                current=current.leftChild;
            }else {
                current=stack.pop();
                list.add(current.value);
                current=current.rightChild;
            }
        }
        return list;
    }

}
