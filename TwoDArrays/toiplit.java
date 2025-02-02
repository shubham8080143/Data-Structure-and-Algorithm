package TwoDArrays;


import java.util.*;

class Solution {
        public boolean isToeplitzMatrix(int[][] matrix, int m, int n) {
          for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;

                }
            }
          }
          return true;
       }
}

public class toiplit{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] A = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        boolean ans = Obj.isToeplitzMatrix(A,m,n);
        System.out.println(ans);
    }
}
