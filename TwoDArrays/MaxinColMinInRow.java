package TwoDArrays;

import java.util.*;
//question link: https://www.geeksforgeeks.org/find-a-peak-element-in-a-2d-array/

public class MaxinColMinInRow  {
    public static int maximaMinima(int[][] mat) {
       for(int i=0;i<mat.length;i++){
        int index=findminRow(mat[i]);
        if(findminColumn(mat,i,index,mat[i][index])){
            return mat[i][index];
        }
       }
       return -1;
    }

    static int findminRow(int[] row){
        int min =row[0]; // Assume the first element is the smallest
        int miindex=0;
        for (int i = 1; i < row.length; i++) {
            if (row[i] < min) {
                min = i; // Update min if a smaller value is found
            miindex=i;
            }
        }
        return miindex;
    }
    static boolean findminColumn(int[][] col,int row,int index ,int num){
  for(int i=0;i<col.length;i++){
    if(num<col[i][index]){
        return false;
    }
  }
  return true;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}