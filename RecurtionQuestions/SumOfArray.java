package RecurtionQuestions;

public class SumOfArray {
    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,7,8,9, 3, 4, 5};
        int n = arr.length;
        System.out.println(sumOfArray(arr, n));
    }
    
}
