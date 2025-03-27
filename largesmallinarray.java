import java.util.*;

public class largesmallinarray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // means -infinity to find largest
        int smallest = Integer.MAX_VALUE; // means +infiinity to find smallest
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest value is ::" + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("the largest number from array is " + getLargest(numbers));
    }

}
