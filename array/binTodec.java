
public class binTodec {

    public static int binTodec(int binNum) {
        int myNum = binNum;
        int decimal = 0;
        int power = 0;
        while (binNum > 0) {
            int lastdig = binNum % 10;
            decimal = decimal + (lastdig + (int) Math.pow(2, power));

            power++;
            binNum = binNum / 10;

        }

        System.out.println("decimal of " + myNum + "=" + decimal);
        return decimal;

    }

    public static void decTobin(int p) {
        int myNumb = p;
        int pow = 0;
        int binary = 0;
        int rem = 0;
        while (p > 0) {
            rem = p % 2;

            binary = binary + (rem * (int) Math.pow(10, pow));

            pow++;
            p = p / 2;
        }

        System.out.println("binary of " + myNumb + "=" + binary);
    }

    public static void main(String[] args) {
        decTobin(15);

    }

}
