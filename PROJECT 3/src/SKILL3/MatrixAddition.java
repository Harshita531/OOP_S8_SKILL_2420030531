package SKILL3;
public class MatrixAddition {
    public static void main(String[] args) {
        // First matrix
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix
        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int rows = a.length;
        int cols = a[0].length;

        // Result matrix to store the sum
        int[][] sum = new int[rows][cols];

        // Adding corresponding elements of two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
