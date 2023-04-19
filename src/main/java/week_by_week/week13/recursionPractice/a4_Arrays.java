package week_by_week.week13.recursionPractice;

public class a4_Arrays {

    public static void main(String[] args) {
        int[] nums = {3, 1, 0, 7, 5};

        System.out.print("displayArrayInOrder : ");
        displayArrayInOrder(nums, nums.length - 1);
        System.out.print("\ndisplayArrayInReverse : ");
        displayArrayInReverse(nums, nums.length - 1);
        System.out.print("\n maa x");
        System.out.println("maxOfArray(nums, nums.length-1) = " + maxOfArray(nums, nums.length - 1));
        System.out.println("maxOfArray2 : ");

        System.out.print(maxOfArray2(nums, 0));

        // -----------------------------
        // input : [15, 11, 40, 4, 4, 9], starting index, target number : 4
        //output : 3 (first index of 4)
        System.out.println("\nfirstIndex(new int[]{15, 11, 40, 4, 4, 9}, 0, 4) = "
                + firstIndex(new int[]{15, 11, 40, 40, 4, 9}, 0, 4));

        int[] ints = new int[]{15, 11, 40, 8, 8, 9};
        System.out.println("lastIndex(ints, ints.length-1, 8) = " + lastIndex(ints, ints.length - 1, 8));

    }

    /*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the elements of array from beginning to end each in a separate line.
4. For the above purpose complete the body of displayArrayInOrder function. Don't change the signature.
Sample Input
3   1   0   7   5
Sample Output
3   1   0   7   5
 */
    public static void displayArrayInOrder(int[] arr, int idx) {
        if (idx < 0) return;
        displayArrayInOrder(arr, idx - 1);
        System.out.print(arr[idx] + " ");
    }

    /*
    1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the elements of array from end to beginning each in a separate line.
4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
Sample Input
3   1   0   7   5
Sample Output
5   7   0   1   3
 */

    public static void displayArrayInReverse(int[] arr, int idx) {
        if (idx < 0) return;
        System.out.print(arr[idx] + " ");
        displayArrayInReverse(arr, idx - 1);
    }

    /*
    Sample Input    6   15  30  40  4   11  9
    Sample Output 40
     */

    public static int maxOfArray(int[] arr, int idx) {
        if (idx < 0) return Integer.MIN_VALUE;
        int max = maxOfArray(arr, idx - 1);
        return Math.max(max, arr[idx]);
    }

    public static int maxOfArray2(int[] arr, int idx) {     // pepCoding solution
        if (idx >= arr.length) {
            return Integer.MIN_VALUE;  //we have the constraint that the size of array will not be zero hence we have not considered that case here
        }
        int misa = maxOfArray2(arr, idx + 1); //misa stands for maximum in smaller array
        return Math.max(arr[idx], misa);
    }

    /*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the first index at which x occurs in array a.
5. If x exists in array, print the first index where it is found otherwise print -1.
input : [15, 11, 40, 4, 4, 9], starting index, target number : 4
output : 3 (first index of 4)
     */

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx >= arr.length) return -1;
        return arr[idx] == x ? idx : firstIndex(arr, idx + 1, x);
    }

    public static int firstIndex2(int[] arr, int idx, int x) {      // pepCoding solution
        if (idx == arr.length) return -1;
        if (arr[idx] == x) return idx;
        return firstIndex2(arr, idx + 1, x);
    }

    /*
    1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the last index at which x occurs in array a.
5. If x exists in array, print the last index where it is found otherwise print -1.
input : [15, 11, 40, 8, 8, 9], starting index, target number : 8
output : 4 (last index of 8)
     */
    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx < 0) return -1;
        return arr[idx] == x ? idx : lastIndex(arr, idx - 1, x);
    }

    public static int lastIndex2(int[] arr, int idx, int x) {   // pepCoding
        if (idx == arr.length) {
            return -1;
        }

        int liisa = lastIndex2(arr, idx + 1, x);
        if (liisa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }

    /*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the all indices at which x occurs in array a.
5. Return an array of appropriate size which contains all indices at which x occurs in array a.
input : [15, 11, 40, 8, 8, 9], starting index, target number : 8
output : 3 4 (indices of 8)
     */

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        return null;
    }

    /*
    For this problem, we don't need to take any input. A function is already defined as: public static int[] allIndices(int[] arr, int x, int idx, int fsf).
We just need to complete this code.
Looking at this public static int[] allIndices(int[] arr, int x, int idx, int fsf), we can see that as a parameter,
there is an array arr, a number x, an index and an integer fsf is passed. Integer fsf (found so far) will keep a track
of how many times we have visited x. Array and x are the values that the user provides.
Here our main problem is to know the size of the array in which we will store all indices of x.
That's when the integer fsf (found so far) comes into use.
We will use the concept that when we go up in the stack using recursion, we come back also.
So, while going up on the stack we will keep updating fsf and as soon as base case hits, we define an array of size fsf,
and while returning i.e. while moving down on stack, we will fill that array with all indices of x.
     */

    public static int[] allIndices2(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        int[] iarr;

        if (arr[idx] == x) {
            iarr = allIndices2(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
        } else {
            iarr = allIndices2(arr, x, idx + 1, fsf);
        }

        return iarr;
    }
}