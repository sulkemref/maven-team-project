package kemal.mentor_tasks.week07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
            // 9-7
        //9
        System.out.println(Arrays.toString(twoSumIndexes(nums,9)));

        System.out.println(Arrays.toString(twoSumElements(nums,9)));

    }

    public static int[] twoSumIndexes(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp))
                return new int[] {map.get(temp),i};
            map.put(nums[i],i);
        }

        return null;
    }

    public static int[] twoSumElements(int[] nums, int target) {
        return new int[] {nums[twoSumIndexes(nums,target)[0]], nums[twoSumIndexes(nums,target)[1]]};
    }


}
