import java.util.*;

public class matrices {

    // function to search element in matrix
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.println("enter the elements that you want to store in matrix ::");
        Scanner scan = new Scanner(System.in);
        int m = 3, n = 3;
        // m = matrix.length , n = matrix[0].length
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        // output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 9);

    }

}
