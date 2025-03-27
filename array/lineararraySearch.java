import java.util.*;

public class lineararraySearch {

    // for finding integer(linear search)
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;

    }

    // function for finding the string (linear search)
    public static int searchString(String names[], String nameKey) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameKey)) {
                return i;
            }
        }

        return -1;
    }

    // function for finding largest and smallest in an array (linear search)

    public static int largestArray(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest is " + smallest);
        return largest;

    }

    // searching an element by binary search

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right half
                start = mid + 1;
            } else { // left half
                end = mid - 1;
            }
        }

        return -1;
    }

    // reverse of an array

    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swaping

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;

        }
    }


    //making of possible pairs of given array

    public static void pairsArray(int numbers[]){
        int totPairs = 0 ;
        for(int i = 0 ; i<numbers.length ; i++){
            for(int j = i + 1 ; j<numbers.length ; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
                totPairs++;
            }
            System.out.println();
        }

        System.out.println("Total pairs formed are " + totPairs);
    }



    //printing of subarrays of given array

    public static void subArrays (int numbers[]) {
        int total = 0 ;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j = i ; j<numbers.length ; j++){
                int end = j;
                for(int k = start ; k <= end ; k++){     //used to print the subarrays
                    System.out.print(numbers[k] + " ");
                }

                total ++ ;

                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println(total);
    }

    public static void main(String[] args) {

        int numbers[] = { 10, 20, 30, 40, 50, 60, 85, 90};

        // int numbers[] = { 1,2,3};

        int key = 45;

        Arrays.sort(numbers); // binary search works only on sorted array

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index);
        }

        String names[] = { "prasad", "krushna", "piyush", "om", "kishor" };

        String nameKey = "om";

        int index2 = searchString(names, nameKey);

        if (index2 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index2);
        }

        System.out.println("largest element is " + largestArray(numbers));

        System.out.println("The number is at index " + binarySearch(numbers, key));


        //printing pairs of array

        pairsArray(numbers);

        
        //printing subarrays of array

        subArrays(numbers);
        

        // printing reverse array

        reverseArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();



    }
}
