package week_by_week.week10.algoSolutions;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        String columnTitle = "ZY";
        System.out.println(getColumnNumber(columnTitle));

    }

    //Time Complexity : O(n) / Space Complexity : O(1)
    public static int getColumnNumber(String columnTitle) {
        int columnNumber = 0;

        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            int character = columnTitle.charAt(i) - 64;
            columnNumber += Math.pow(26, j) * character;
        }

        return columnNumber;
    }
}
