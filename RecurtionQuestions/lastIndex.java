package RecurtionQuestions;

public class lastIndex {
    public static int lastIndex(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        int indexFromNext = lastIndex(arr, x, index + 1);
        if (indexFromNext != -1) {
            return indexFromNext;
        }
        if (arr[index] == x) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 5;
        System.out.println(lastIndex(arr, x, 0));
    }
    
}
