package RecurtionQuestions;

public class firstindex {
    public static int firstIndex(int arr[], int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            return index;
        }
        return firstIndex(arr, x, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 2, 5, 2, 7 };
        int x = 2;
        System.out.println(firstIndex(arr, x, 0));
    }
    
}
