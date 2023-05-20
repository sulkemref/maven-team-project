package kemal.leetcode_general_practice;

import java.util.Arrays;

public class House_Robber {

//    https://leetcode.com/problems/house-robber/description

    private final static House_Robber obj = new House_Robber();

    public static void main(String[] args) {

        int result = obj.rob(new int[]{2,7,9,3,1});

        int[] nums = {2,-7,9,-3,1};
        Arrays.stream(nums).forEach(Math::abs);

        System.out.println(Arrays.toString(nums));
        String s = "123124";
        for (String s1 : s.split("")) {
            
        }
        System.out.println(result);

    }
    private int money;
    public int rob(int[] nums) {
        int rob1=0,rob2=0;

        for(int n :nums) {
            int temp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }

//    private void findMaxExpensiveHouse(int[] nums,int startIndex, int endIndex){
//        if(endIndex-startIndex<0||endIndex>nums.length-1||startIndex<0)
//            return;
//        int index = findMaxIndex(nums,startIndex,endIndex);
//        money+=nums[index];
//        findMaxExpensiveHouse(nums,startIndex,index-2);
//        findMaxExpensiveHouse(nums,index+2,endIndex);
//    }
//
//    private int findMaxIndex(int[] nums,int startIndex, int endIndex){
//
//        int maxIndex = startIndex;
//        int maxElement = nums[startIndex];
//
//        for(int i = startIndex+1; i<=endIndex;i++){
//            if(maxElement<nums[i]){
//                maxIndex=i;
//                maxElement=nums[i];
//            }
//        }
//        return maxIndex;
//    }
}
