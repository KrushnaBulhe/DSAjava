
import java.util.*;

public class continuest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // used to skip an iteration
            }
            System.out.println(i);
        }

        // displaying all numbers entered by user except multiple of 10

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("entered the number");
            int n = scan.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("your number was::" + n);
        } while (true);

    }

}
