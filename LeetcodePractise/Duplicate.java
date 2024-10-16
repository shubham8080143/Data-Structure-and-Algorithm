package LeetcodePractise;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 3, 6, 5, 6 };
        containsDuplicate(nums);

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> a = new HashSet();
        for (int ele : nums) {
            if (a.contains(ele)) {
                System.out.println(true);
                return true;
            } else {
                a.add(ele);

            }

        }
        System.out.println(false);
        return false;
    }
}
    

