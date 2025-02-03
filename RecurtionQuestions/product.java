package RecurtionQuestions;

public class Product {
    public static int product(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + product(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(product(a, b));
    }
    
}
