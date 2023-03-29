package week_by_week.week11;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 5, 5, 4, 1};
        System.out.println(withSet(nums));
    }


    /**
     * This code uses a brute force approach to find the first non-duplicate element in the input array. It checks each element of the array against every other element in the array to count the number of occurrences of each element. It then returns the first element that occurs exactly once.
     * <p>
     * The worst-case time complexity of this algorithm is O(n^2), as it requires nested loops to iterate through the array and count the occurrences of each element. This makes the algorithm inefficient for large arrays. Additionally, the algorithm uses O(1) space complexity as it does not require any additional data structures beyond the input array.
     * <p>
     * In terms of space complexity, the algorithm uses only O(1) space, since it only requires a constant amount of space to store the count variable.
     * <p>
     * Overall, this algorithm may be suitable for small input sizes, but it is not efficient for large arrays.
     *
     * @param nums
     */
    public static int bruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }

        return Integer.MAX_VALUE;
    }

    /**
     * This code sorts the input array using Arrays.sort(nums), which has a time complexity of O(n log n) on average, and then iterates through the sorted array in O(n) time to find the first non-duplicate element.
     * <p>
     * Therefore, the overall time complexity of this algorithm is O(n log n) + O(n) = O(n log n).
     * <p>
     * Note that while the algorithm has a higher time complexity than some other algorithms that can solve this problem in linear time (e.g., using a hash table), it has the advantage of using only O(1) space complexity, as it does not require any additional data structures beyond the input array.
     *
     * @param nums
     */
    public static int withSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    /**
     * This code uses a hash map to count the occurrences of each element in the input array. It first iterates through the input array to populate the hash map with the count of each element. It then iterates through the hash map to find the first element that occurs exactly once.
     * <p>
     * The time complexity of this algorithm is O(n) in the worst case, as it requires a single iteration through the input array to populate the hash map, and another iteration through the hash map to find the first non-duplicate element.
     * <p>
     * In terms of space complexity, the algorithm uses O(n) space to store the hash map, where n is the size of the input array. Therefore, the algorithm may be more memory-intensive for larger input arrays.
     * <p>
     * Overall, this algorithm has a better time complexity than the brute force approach, but may use more memory due to the hash map. It may be suitable for larger input arrays, where the time savings from using a hash map outweigh the additional memory usage.
     *
     * @param nums
     */
    public static int withHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Integer.MAX_VALUE;
    }

    /**
     * This code uses a HashSet to store the elements of the input array. It iterates through the input array and removes each element from the HashSet if it is already in the set, or adds it to the set if it is not already present. The first element left in the HashSet after this process is the first non-duplicate element.
     * <p>
     * The worst-case time complexity of this algorithm is O(n), as the remove() and add() methods of the HashSet have an average time complexity of O(1), and this method is called once for each element in the input array. Therefore, the algorithm is efficient for large input arrays.
     * <p>
     * In terms of space complexity, the algorithm uses O(n) space to store the HashSet, where n is the size of the input array.
     * <p>
     * Overall, this algorithm is efficient and has a better time complexity than the brute force and ArrayList approaches. It may be more memory-intensive than the brute force approach, but its time efficiency makes it a good option for larger input arrays.
     *
     * @param nums
     */
    public static int withSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (!set.remove(num)) {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    /**
     * Bit Manipulation (XOR)
     * Concept :
     * XOR of zero and some bit returns that bit i.e. x^0 = x...
     * XOR of two same bits returns 0 i.e. x^x = 0...
     * And, x^y^x = (x^x)^y = 0^y = y...
     * XOR all bits together to find the unique number.
     *
     * -If we use XOR operator between two same values, it will return zero.
     * -If one of the value is zero, and the other is non-zero, it returns the non-zero value.
     *
     * XOR
     * X^X = 0
     * 0^X = X
     *
     * Let's see some rules:
     * 0^A=A
     * A^A=0
     * A^B^A=B
     * (A^A^B) = (B^A^A) = (A^B^A) = B This shows that position doesn't matter.
     * Similarly , if we see , A^A^A.. with (even times)=0 and A^A^A.. with (odd times)=A
     *
     * We apply the above observations :
     *
     * Because, the elements with frequency=2 will result in 0. And then the only element with frequency=1 will generate the answer.
     *
     * Our array is : {4,1,2,1,2}
     * 4^1
     * 4^1^2
     * 4^1^2^1 ->[1^1=0]
     * 4^2
     * 4^2^2 -> [2^2=0]
     * 4
     * So, the element which we got as left should be our answer, so the answer is '4'
     *
     *
     * <p>This code uses the XOR operator to find the first non-duplicate element in an array of integers. It initializes a variable value to 0, and then iterates through the input array, performing the XOR operation between the current value of value and each element of the array. The result is the first non-duplicate element.
     *
     * The time complexity of this algorithm is O(n), as it iterates through the input array once and performs a constant-time operation for each element. Therefore, the algorithm is efficient for large input arrays.
     *
     * In terms of space complexity, the algorithm uses only constant space, as it only needs to store the variable value to compute the result.
     *
     * Overall, this algorithm is efficient and has a good time complexity compared to other solutions. It is a good option when memory usage needs to be minimized or when the input size is large.</p>
     * @param nums
     * @return
     */
    public static int withXOR(int[] nums) {
        int value = 0;
        for (int num : nums) {
            value = value ^ num;
        }
        return value;
    }
}
