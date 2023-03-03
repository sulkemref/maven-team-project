package kemal.mentor_tasks.week08;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int number = (removeDuplicates(nums));

        System.out.println(number);

        for (int i = 0; i < number; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    private static int removeDuplicates(int[] nums) {  // space O(1) time O(n)
        int uniqNumbersCount = 1;
        int curretNumber = nums[0];

        for(int i  = 1; i< nums.length; i++){
            if(nums[i]!=curretNumber){
                nums[uniqNumbersCount++]=nums[i];
                curretNumber=nums[i];
            }
        }
        return uniqNumbersCount;
    }
}
