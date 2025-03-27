public class spiralmat {
    public static void printspiral(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // print top boundary
            for (int j = startcol; j <= endcol; j++) {
                System.out.println(matrix[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.println(matrix[i][endcol] + " ");
            }

            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.println(matrix[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.println(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }

    public static void diagonalsum(int matrix[][]) {
        //time complexity for this code is O(N^2) , becoz of two loops
        //int sum = 0; 

        //for (int i = 0; i <= matrix.length; i++) {
            //for (int j = 0; j <= matrix[0].length; j++) {
                //if (i == j) { // logic for sum of primary diagonal
                    //sum += matrix[i][j];
                //}
                //if (i + j == matrix.length - 1) {
                    //sum += matrix[i][j];
                //}
            //}
        //}
        //return sum;

        for(int i=0 ; i<=matrix.length ;i++){           //time complexity is O(n)
            int sum = 0;
            //pd
            sum+= matrix[i][i] ;
            //sd
            if(i!=matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
        }
        return sum ;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonalsum(matrix);

    }

}
