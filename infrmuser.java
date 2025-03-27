
import java.util.*;

public class infrmuser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next(); // used to take input till the space is not
        System.out.println(input);

        String name = scan.nextLine(); // use too take input for a complete line
        System.out.println(name);

        int a = scan.nextInt(); // used to take input for the integer value
        System.out.println(a);

        float price = scan.nextFloat(); // used to take input for the floating value
        System.out.println(price);

    }
}
