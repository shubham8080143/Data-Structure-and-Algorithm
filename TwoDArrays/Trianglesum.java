package TwoDArrays;

public class Trianglesum {
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
        triangleSums(n,arr);
    }

    public static void triangleSums(int n, int[][] matrix) {
        int upper=0;int lower=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    upper+= matrix[i][j];
                }
                if(j<=i){
                    lower+=matrix[i][j];
                }
            }
        }
        System.out.print(upper+" "+lower);
    }
    
}
