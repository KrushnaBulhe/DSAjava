public class maxsubarraysum {

    public static void maxsubarraysum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // means - infinity
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];

                }

                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("the maximum sum is ::" + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxsubarraysum(numbers);

    }
}
