
import java.util.*;

public class braekst {
    public static void main(String[] args) {
        /*
         * for (int i = 1; i <= 5; i++) {
         * if (i == 3) {
         * break;
         * }
         * System.out.println(i);
         * }
         * System.out.println("i am out of the loop");
         */
        // keep entering and printing number till user enters multiplt of 10
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("enter a number::");
            int n = scan.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);

    }
}