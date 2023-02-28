package kemal.mentor_tasks.week07;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr1 = {9,6,4,2,3,5,7,0,1};
        int[] arr2 = {3, 0, 1};

        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));

    }
    public static int missingNumber(int[] nums) {

        int sumElements = 0;
        int faclorial = 0;

        for(int i = 0 ; i< nums.length; i++){
            sumElements+=nums[i];
            faclorial+=i;
        }
        return (faclorial+nums.length)-sumElements;
    }


    public static int missingNumberOld(int[] nums) { // O(n) space

        Set<Integer> setNums = new HashSet<>();
        for(int each: nums){
            setNums.add(each);
        }

        int result = setNums.size();
        for(int i = 0 ; i< setNums.size(); i++){
            if(!setNums.contains(i)){
                result = i;
            }
        }

        return result;
    }
}
