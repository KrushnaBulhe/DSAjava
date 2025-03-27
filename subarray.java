public class subarray {
    public static void subarray(int numbers[]) {
        int totsubarr = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");

                }
                totsubarr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays are ::" + totsubarr);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarray(numbers);

    }

}
