public class prefixarray {

    public static void subarray(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + prefix[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                currsum = prefix[end] - prefix[start - 1];

            }

        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarray(numbers);

    }

}
