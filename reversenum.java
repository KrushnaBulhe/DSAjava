
import java.util.*;

public class reversenum {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number u want to reverse::");
        int i = scan.nextInt();
        while (i > 0) {
            int lastdigit = i % 10;
            System.out.print(lastdigit);
            i = i / 10;
        }

        // enter the num that u want to reverse
        int j = scan.nextInt();
        int rev = 0;
        while (j > 0) {
            int lastdigit = j % 10;
            j = j / 10;
            rev = (rev * 10) + lastdigit;
            System.out.print(rev);

        }

    }

}
