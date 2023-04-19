package week_by_week.week14;

import java.util.*;

public class FindAllElementsGreaterThanTheirRight {

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 3, 5};

        System.out.println(findElementsStack(arr));
    }

    /**
     * This solution uses a double for loop to find all elements in an unsorted integer array that are greater than all elements to their right. The basic idea is to compare each element in the array with all elements to its right. If the element is less than or equal to any element to its right, we skip it and move on to the next element. Otherwise, we add it to a list called elements.
     *
     * The time complexity of this solution is O(n^2), where n is the length of the input array. This is because we are traversing the input array twice (once for the outer loop and once for the inner loop), and each comparison inside the inner loop takes constant time.
     *
     * The space complexity of this solution is O(k), where k is the number of elements in the output list elements. This is because we are creating a list to store the output, and its size can be at most n if all elements in the input array satisfy the condition.
     *
     * Overall, this solution is not very efficient and can be slow for large inputs. It is recommended to use a more optimized algorithm, such as the stack-based solutions we discussed earlier, to solve this problem.
     * @param arr
     * @return List of Integers
     */
    public static List<Integer> findElementsBruteForce(int[] arr) {
        List<Integer> elements = new ArrayList<>();

        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    continue outer;
                }
            }
            elements.add(arr[i]);
        }
        return elements;
    }

    /**
     * The time complexity of this solution is O(n), where n is the length of the input array. We only traverse the input array once in the for loop, and each operation inside the loop takes constant time.
     *
     * The space complexity of this solution is also O(n), where n is the length of the input array. This is because the size of the stack can be at most n, if all elements in the input array are in decreasing order.
     *
     * Overall, this solution is efficient and should be able to handle large inputs without running into performance issues.
     * @param arr
     * @return List of Integers
     */
    public static List<Integer> findElementsStack(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        stack.add(arr[arr.length-1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > stack.peek()){
                stack.push(arr[i]);
            }
        }
        List<Integer> result = new ArrayList<>(stack);
        Collections.reverse(result);
        return result;

    }

    // time complexity O(n)  space complexity O(n)
    List<Integer> withLinkedList(int[] arr) {
        LinkedList<Integer> stack = new LinkedList<>();
        if (arr == null || arr.length == 0) {
            return stack;
        }

        for (int value : arr) {
            // pop all the elements that are less than the current element
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }
            // push current element into the stack
            stack.push(value);
        }
        // Collections reverse method reverses the element of a List in linear time i.e time complexity is O(n).
        stack.sort(Collections.reverseOrder());
        return stack;
    }

    List<Integer> withStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        if (nums == null || nums.length == 0) return stack;
        stack.push(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > stack.peek()) {
                stack.push(nums[i]);
            }
        }
        stack.sort(Comparator.reverseOrder());
        return stack;
    }

    Deque<Integer> withDeque(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        if (nums == null || nums.length == 0) return stack;
        stack.push(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > stack.peek()) {
                stack.push(nums[i]);
            }
        }
        return stack;
    }

    Deque<Integer> withArrayDeque(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        if (nums == null || nums.length == 0) return stack;
        stack.push(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > stack.peek()) {
                stack.push(nums[i]);
            }
        }
        return stack;
    }

    List<Integer> withArrayList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        list.add(nums[nums.length - 1]);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > list.get(list.size() - 1)) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
