package denis.week12;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{4, 3, 2, 1};
        int[] arr2 = new int[]{9};

        plusOneArray(arr);
        plusOneArray(arr1);
        plusOneArray(arr2);

    }

    public static void plusOneArray(int[] arr) {

        String str = Arrays.toString(arr);
        System.out.println("Before: "+str);

        str = str.replace(",", "");
        str = str.replace(" ", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        int i = Integer.parseInt(str);
        i = i + 1;
        str = String.valueOf(i);
        int[] newArr = new int[str.length()];

        for (int j = 0; j < str.length(); j++) {
            newArr[j] = Integer.parseInt(str.charAt(j) + "");

        }
        System.out.println("After: "+Arrays.toString(newArr));
    }
}

