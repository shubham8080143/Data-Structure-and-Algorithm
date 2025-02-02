package TwoDArrays;


import java.util.Scanner;

public class BoundaryTraversal {
    public static void boundaryTraversal(int[][] matrix, int m, int n) {
        if (m == 0 || n == 0) return; // Edge case: Empty matrix

        // Step 1: Print top row
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // Step 2: Print right column (excluding the first element, already printed)
        for (int i = 1; i < m; i++) {
            System.out.print(matrix[i][n - 1] + " ");
        }

        // Step 3: Print bottom row (Right to Left), if more than 1 row
        if (m > 1) {
            for (int j = n - 2; j >= 0; j--) {
                System.out.print(matrix[m - 1][j] + " ");
            }
        }

        // Step 4: Print left column (Bottom to Top), if more than 1 column
        if (n > 1) {
            for (int i = m - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        // Input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call function to print boundary traversal
        boundaryTraversal(matrix, m, n);

        sc.close();
    }
}

