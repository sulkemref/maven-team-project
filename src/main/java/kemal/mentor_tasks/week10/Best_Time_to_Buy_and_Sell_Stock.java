package kemal.mentor_tasks.week10;

public class Best_Time_to_Buy_and_Sell_Stock {


    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));


    }
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    private static int maxProfit(int[] prices) { // Space O(1) Time O(n)
        int minElement = prices[0];
        int maxProfit = 0;

        for(int i = 1;i<prices.length;i++){
            if(prices[i]<minElement){
                minElement = prices[i];
            }else if(prices[i]-minElement>maxProfit){
                maxProfit = prices[i]-minElement;
            }
        }
        return maxProfit;
    }
}
