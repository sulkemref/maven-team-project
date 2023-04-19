package kemal.mentor_tasks.week10;

public class Excel_Sheet_Column_Number {

    public static void main(String[] args) {

        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("FXSHRXW"));
        System.out.println(titleToNumber("FXS"));
        System.out.println(titleToNumber("FX"));
        System.out.println(titleToNumber("ZZ"));
        System.out.println(titleToNumber("AAA"));

    }
    //https://leetcode.com/problems/excel-sheet-column-number/
    private static int titleToNumber(String columnTitle) { // Space O(1) Time (n)
        // A -> 1 * 26^0;
        // Z -> 26 * 26^0;
        // AA -> 1 * 26^1 + 1 * 26^0;
        // AAA -> 1 * 26^2 + 1 * 26^1 + 1 * 26^0;
        // ASCII : A 65
        int result = 0;
        int pow = columnTitle.length()-1;
        for(int i = 0; i<columnTitle.length() ;i++){
            int tempInt = columnTitle.charAt(i)-64;
            result+= tempInt * Math.pow(26,pow-i);
        }
        return result;
    }
}
