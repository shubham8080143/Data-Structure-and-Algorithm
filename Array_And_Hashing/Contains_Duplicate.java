package Array_And_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums={1,3,4,1};
        check_duplicate(nums);
        
    }

    static boolean check_duplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        
        return false;
        

    }
    
}

