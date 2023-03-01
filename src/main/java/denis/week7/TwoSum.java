package denis.week7;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        Integer[] arr = {16, 3, 11, 5, 15};
        int target = 8;

        System.out.println(twoSum(arr, target));
        System.out.println(twoSum2(arr, target));
    }

    public static String twoSum(Integer[] arr, int target) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result += arr[i] + " " + arr[j];

                }

            }
        }
        return result;
    }

    public static String twoSum2(Integer[] arr, int target) {
        String result = "";
        Arrays.sort(arr);
        Integer[] arr2 = {16, 3, 11, 5, 15};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                result = arr[i] + " + " + arr[i + 1] + " = " + target;
            }
        }
        return result;
    }
}

