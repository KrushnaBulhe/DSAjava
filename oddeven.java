import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enetr the nummber u want to check ::");
        int A = scan.nextInt();

        if (A % 2 == 0) {
            System.out.println("entered nuber is even");
        } else {
            System.out.println("entered number is not even");
        }

    }

}
