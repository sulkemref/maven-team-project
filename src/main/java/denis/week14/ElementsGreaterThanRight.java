package denis.week14;

import java.util.Stack;

public class ElementsGreaterThanRight {

    public static void main(String[] args) {

        Integer [] arr = new Integer[] {10,4,6,3,5};
        Stack <Integer> bucket = new Stack<>();
        int count = 0;
        bucket.push(arr[count]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j] && !bucket.get(count).equals(arr[j])) {
                    bucket.push(arr[i]);
                    count++;
                    break;
                }
                else if (arr[i].equals(arr[j])) {
                    bucket.pop();
                    bucket.push(arr[j]);
                    break;
                }
                else if (!bucket.get(count).equals(arr[j]) ){
                    bucket.pop();
                    bucket.push(arr[j]);
                    break;
                }
            }

        }
        System.out.println(bucket);

    }
}
