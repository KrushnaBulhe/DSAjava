public class buysellstock {

    public static int stockprofit(int price[]) {
        int MaxProfit = 0;
        int BuyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if (BuyPrice < price[i]) { // profit
                int profit = price[i] - BuyPrice; // Todays profit
                MaxProfit = Math.max(MaxProfit, profit);

            } else {
                BuyPrice = price[i];

            }

        }
        return MaxProfit;

    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("the maximum profit for this prices is = " + stockprofit(price));

    }

}
