package kemal.mentor_tasks.week12;

public class Plus_One {

//    https://leetcode.com/problems/plus-one/description/

    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0;i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0]++;
        return digits;
    }

}
