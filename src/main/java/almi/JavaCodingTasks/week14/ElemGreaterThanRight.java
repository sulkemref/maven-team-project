package almi.JavaCodingTasks.week14;

import java.lang.reflect.Array;
import java.util.*;

/** Given an unsorted integer array, return all greater elements than all elements present to their right using
 Stack.
 Example:
 Input: [10, 4, 6, 3, 5]
 Output: [10, 6, 5]
 **/
public class ElemGreaterThanRight {

    public static void main(String[] args) {


        int[] array = {10, 4, 6, 3, 5};
        int[] array2 = {9, 9, 9, 9};

        greaterThanRight(array);
    }

    public static void greaterThanRight(int[] array){

        Deque<Integer> stack = new LinkedList<>();

        for (int numb : array) {

            while (!stack.isEmpty() && stack.peek() <= numb) stack.pop();

            stack.push(numb);
        }


        List<Integer> arrayList = new ArrayList<>(stack);
        Collections.reverse(arrayList);
        System.out.println(arrayList);


    }


}

