package TwoDArrays;

//question link: https://www.geeksforgeeks.org/transpose-matrix-single-loop/
public class matrixTranspose {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int arr[][] = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        transpose(arr, n, m);
    }

    static void transpose(int arr[][], int n, int m) {
 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
