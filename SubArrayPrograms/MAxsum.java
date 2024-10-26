package SubArrayPrograms;

import java.util.logging.Logger;

public class MAxsum {

    // Create a logger instance
    private static final Logger logger = Logger.getLogger(MAxsum.class.getName());

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        
        logger.info("Maximum Subarray Sum: " + sum(arr));
    }

    static int sum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; 
            for (int j = i; j < arr.length; j++) {
                sum += arr[j]; 
                if (sum > maxSum) {
                    maxSum = sum; 
                }
            }
        }
        return maxSum;
    }
}
