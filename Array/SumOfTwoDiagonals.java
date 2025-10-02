public class SumOfTwoDiagonals {
    public static void main(String[] args) {
        // Example: 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal (top-left to bottom-right)
            sum += matrix[i][i];

            // Secondary diagonal (top-right to bottom-left)
            if (i != n - i - 1) { // avoid double-counting middle element in odd-sized matrix
                sum += matrix[i][n - i - 1];
            }
        }

        System.out.println("Sum of diagonal elements = " + sum);
    }
}

