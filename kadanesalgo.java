public class kadanesalgo {

    public static void kadanealgo(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms); // compares the cs and ms , if anyone of both is bigger then it will stores in
                                   // ms

        }
        System.out.println("our maximum subarray sum is ::" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanealgo(numbers);

    }

}
