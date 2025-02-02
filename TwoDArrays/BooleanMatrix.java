package TwoDArrays;

public class BooleanMatrix{
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
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
        System.out.println(BooleanMatrixProblem(n,m,arr));
        
    }
    public static int[][] BooleanMatrixProblem(int m,int n,int[][] mat){
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==1){
                   for(int k=0;k<n;k++){
                       matrix[i][k]=1;
                   }
                   break;
               }else{
                   matrix[i][j]=0;
               }
   
           }
           
        }
        return matrix;
       }
    }
