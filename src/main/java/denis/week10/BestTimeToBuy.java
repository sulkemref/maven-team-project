package denis.week10;

public class BestTimeToBuy {

    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices2 = new int[]{7, 6, 4, 3, 1};
        System.out.println(checkStocks(prices));
        System.out.println(checkStocks(prices2));

    }

    public static int checkStocks (int [] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int index = 0;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                index = i;
            }
        }
        for (int j = index; j < prices.length; j++) {
            if (prices[j] > maxPrice) {
                maxPrice = prices[j];
            }

        }

        if (maxPrice - minPrice > 0) {
            return maxPrice - minPrice;
        } else {
            return 0;
        }

    }
}

