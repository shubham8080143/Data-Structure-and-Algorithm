package Practise;

public class lcm{
    public static void main(String[] args) {
        checkLCM(5, 4);
    }

    static void checkLCM(int i, int j) {
        int max = Math.max(i, j);
        while (true) {
            if (max % i == 0 && max % j == 0) {
                System.out.println("LCM of " + i + " and " + j + " is: " + max);
                break;
            }
            max++;
        }
    }
}
