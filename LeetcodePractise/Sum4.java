package LeetcodePractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        
    }
    class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to use two-pointer technique

        // Iterate over the first element
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Iterate over the second element
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Use two-pointer technique for the remaining two elements
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}

    
}
