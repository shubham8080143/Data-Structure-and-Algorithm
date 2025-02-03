package RecurtionQuestions;

public class SmallestinArray {
    public static int smallest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], smallest(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 4, 5 };
        int n = arr.length;
        System.out.println(smallest(arr, n));
    }
    
}
