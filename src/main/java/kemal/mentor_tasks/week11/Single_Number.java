package kemal.mentor_tasks.week11;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {

//    https://leetcode.com/problems/single-number/

    public static void main(String[] args) {

        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};

        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));

    }

    public static int singleNumber(int[] nums) { //Time O(n) Space O(n)
        if(nums.length==1)
            return nums[0];

        Map<Integer,Integer> map = new HashMap<>(); // Space O(n/2)

        for(int i = 0;  i< nums.length; i++){ // time O(n)
            if(map.containsKey(nums[i])){ // time O(1)
                map.put(nums[i],2); // time O(1)
            }else{
                map.put(nums[i],1); // time O(1)
            }
        }

        for (Map.Entry<Integer,Integer> eachEntry : map.entrySet()){ // time O(n/2)
            if(eachEntry.getValue()==1) // time O(1)
                return eachEntry.getKey();
        }

        return Integer.MAX_VALUE;
    }
}
