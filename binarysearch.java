import java.util.*;

public class binarysearch {

    public static int BinarySearch(int Numbers[], int key) {
        int start = 0;
        int end = Numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (Numbers[mid] == key) {
                return mid;
            }
            if (Numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int Numbers[] = new int[7];
        Scanner scan = new Scanner(System.in);
        Numbers[0] = scan.nextInt();
        Numbers[1] = scan.nextInt();
        Numbers[2] = scan.nextInt();
        Numbers[3] = scan.nextInt();
        Numbers[4] = scan.nextInt();
        Numbers[5] = scan.nextInt();
        Numbers[6] = scan.nextInt();

        // int Numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14;
        System.out.println("number is at index::" + BinarySearch(Numbers, key));

    }

}
