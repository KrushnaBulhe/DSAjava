public class arrayassignment {

    public static boolean hasDuplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Return true immediately when a duplicate is found
                }
            }
        }
        return false; // If no duplicates are found, return false
    }

    /*
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     */

    public static int StockProfit(int price[]) {
        int MaxProfit = 0;
        int BuyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < BuyPrice) {
                BuyPrice = price[i];
            } else {

                int profit = price[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);

            }
        }
        return MaxProfit;

    }

    public static int trappedwater(int Height[]) {
        // calculation of left max boundary by using array(auxillary array)
        int leftmax[] = new int[Height.length];
        leftmax[0] = Height[0];
        for (int i = 1; i < Height.length; i++) {
            leftmax[i] = Math.max(Height[i], leftmax[i - 1]);
        }
        // calculation of right max boundary by using array(auxillary array)
        int rightmax[] = new int[Height.length];
        rightmax[Height.length - 1] = Height[Height.length - 1];
        for (int i = Height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(Height[i], rightmax[i + 1]);
        }

        // loop
        int TrappedWater = 0;
        for (int i = 0; i < Height.length; i++) {
            // waterlevel = min(left_max_boundary,right_max_boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water = waterlevel - height[i]
            TrappedWater += waterlevel - Height[i];

        }
        return TrappedWater;

    }

    public static void main(String[] args) {
        // int nums[] = { 1, 2, 3, 1 };
        // int nums2[] = { 1, 2, 3, 4 };
        // int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // System.out.println(hasDuplicate(nums));
        // System.out.println(hasDuplicate(nums2));
        // System.out.println(hasDuplicate(nums3));

        // int price[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(StockProfit(price));

        int Height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedwater(Height));
    }

}
