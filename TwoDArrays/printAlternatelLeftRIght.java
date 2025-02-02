package TwoDArrays;

//question link: https://www.geeksforgeeks.org/print-alternate-elements-of-a-given-matrix/

public class printAlternatelLeftRIght {  
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int arr[][] = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = count++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    arr[i][j] = count++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
