package LeetcodePractise;

public class MAxSubarraySum {
    public static void main(String[] args) {
        int[] num={1,-2,-3,4,5,-2,6,7,-8,-9};
       System.out.println( maxSubArray(num));
    }
        public static int maxSubArray(int[] nums) {
            int maxSum = nums[0];  // Initialize maxSum to the first element
            int currentSum = nums[0];  // Start the current sum with the first element
            
            System.out.println("Initial maxSum: " + maxSum);
            System.out.println("Initial currentSum: " + currentSum);
    
            for (int i = 1; i < nums.length; i++) {
                // Calculate currentSum for each element
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                // Update maxSum if currentSum is greater
                maxSum = Math.max(maxSum, currentSum);
    
                // Debug prints to see the values at each step
                System.out.println("Index " + i + ": nums[i] = " + nums[i]);
                System.out.println("Current currentSum: " + currentSum);
                System.out.println("Updated maxSum: " + maxSum);
            }
    
            return maxSum;
        }
    }
    
    

