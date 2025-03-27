public class operator {
    public static void main(String[] args) {
        /*
         * int a = 10;
         * int b = ++a; // pre increament operator.....1.value change 2.value used
         * System.out.println(a);
         * System.out.println(b);
         */

        int a = 10;
        int b = a++; // post increament operator.....1.old value used first 2.value changed
        System.out.println(a);
        System.out.println(b);

    }

}
