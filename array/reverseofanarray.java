import java.util.Scanner;

public class reverseofanarray {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = new int[7];
        Scanner scan = new Scanner(System.in);
        numbers[0] = scan.nextInt();
        numbers[1] = scan.nextInt();
        numbers[2] = scan.nextInt();
        numbers[4] = scan.nextInt();
        numbers[5] = scan.nextInt();
        numbers[6] = scan.nextInt();

        // int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
