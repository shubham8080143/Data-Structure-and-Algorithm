package SubArrayPrograms;

import java.util.HashMap;

public class sumuptotarget {
    public static void main(String[] args) {
        int nums[] ={2,3,4,5,1,2,7,8,5,6,9};
       System.out.println(subarraySum(nums, 9));
        
    }
    


    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  
        
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}

    

