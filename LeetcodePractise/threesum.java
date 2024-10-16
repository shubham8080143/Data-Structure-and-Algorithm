package LeetcodePractise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that they add up to zero.
public class threesum {  
    public static void main(String[] args) {
        int[] nums={-1,-5,-7,-3,-8,4,6,-10,2,1,8,-15,7,0};
        System.out.println(findrange(nums));
        
    }
    static List<List<Integer>> findrange(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
           if(nums[i]==nums[i+1]){
            continue;
           }
           int left=i+1;
           int right=nums.length-1;
           while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                if(left<right && nums[left]==nums[left+1] ) continue;
                if(left<right && nums[right]==nums[right-1] ) continue;
            }
            else if(sum<0){
                 left++;
                
            }else{
                right--;
                
            }
           }

        }
        return result;

    }
   
    
}
