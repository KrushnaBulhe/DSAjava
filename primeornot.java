
import java.util.*;

public class primeornot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n ::");
        int n = scan.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {

            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == true) {
                System.out.println(n + " is prime::");
            } else {
                System.out.println(n + " is not prime::");
            }

        }

    }

}
