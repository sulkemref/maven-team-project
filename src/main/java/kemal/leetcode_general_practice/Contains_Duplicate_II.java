package kemal.leetcode_general_practice;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_II {

//    https://leetcode.com/problems/contains-duplicate-ii/

    private final static Contains_Duplicate_II obj = new Contains_Duplicate_II();

    public static void main(String[] args) {

        int[] nums = {99,99};
        int k = 2;

        System.out.println(obj.containsNearbyDuplicate(nums,k));

    }
    private final Set<Integer> set = new HashSet<>();

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k>nums.length||nums.length<2)
            return false;

        int i = 0;

        do{
            if(findDup(nums,i,i+k))
                return true;
            i++;
        }while(i<nums.length-k);
        return false;
    }

    private boolean findDup(int[] nums,int startIndex,int endIndex){
        set.clear();

        for(int i = startIndex; i<=endIndex;i++){
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
