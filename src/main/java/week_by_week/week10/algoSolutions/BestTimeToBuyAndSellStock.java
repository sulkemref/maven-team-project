package week_by_week.week10.algoSolutions;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        //int [] prices= {7,1,5,3,6,4};
        // int[] prices = {7, 6, 4, 3, 1};
        int[] prices = {2,4,1};
        System.out.println(getMaxProfitBruteForce(prices));
        System.out.println(getMaxProfit(prices));

    }

    //Time Complexity : O(n²) / Space Complexity : O(1)
    public static int getMaxProfitBruteForce(int[] arr) {

        int benefit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > benefit) {
                    benefit = arr[j] - arr[i];
                }
            }
        }
        return benefit;
    }

    //Time Complexity : O(n) / Space Complexity : O(1)
    public static int getMaxProfit(int[] arr) {
        int minBuy=arr[0];
        int profit=0;

        for (int i = 1; i < arr.length; i++) {
            minBuy=Math.min(minBuy,arr[i]);
            profit=Math.max(profit,arr[i]-minBuy);
        }
        return profit;
    }
}
