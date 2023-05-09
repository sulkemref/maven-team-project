package denis.week17;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        List<Integer> numbers = new LinkedList<>(Arrays.asList(6,2,8,0,4,7,9,3,5));
        //List<Integer> numbers = new LinkedList<>(Arrays.asList(2, 1));

        int p = 2;
        int q = 8;
        int result = 0;


        for (int i = 0; i < numbers.size(); i++) {
            tree.insert(numbers.get(i));
        }
        VisualizeTree.printTree(tree.root, null, false);

        TNode current = tree.root;

        if (numbers.size() > 2) {

            while (current.leftChild.leftChild != null && current.rightChild.rightChild != null) {

                if (current.leftChild.value == p && current.rightChild.value == q) {
                    result = current.value;
                    break;
                }
                if (current.leftChild.value == p && current.leftChild.rightChild.value == q) {
                    result = current.leftChild.value;
                    break;
                }

                if (current.rightChild.value == p && current.rightChild.leftChild.value == q) {
                    result = current.rightChild.value;
                    break;
                }

                if (current.rightChild.value == p && current.rightChild.rightChild.value == q) {
                    result = current.rightChild.value;
                    break;
                }

                if (current.value > current.leftChild.value) {
                    current = current.leftChild;
                }

                else {
                    current = current.rightChild;
                }


            }

            System.out.println("result = " + result);

        }
        else {
            result = current.value;
            System.out.println("result = " + result);
        }
    }
}
