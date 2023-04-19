package denis.week7;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        Integer [] num = new Integer[] {9,6,4,2,3,5,7,0,1};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(num));
        int n = num.length;
        Integer result = 0;

        for (int i = 0; i <= n; i++) {
            if (!arrayList.contains(i)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
