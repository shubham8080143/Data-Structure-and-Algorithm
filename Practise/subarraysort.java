package Practise;

public class subarraysort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        System.out.println(check(arr));
        
    }
    static boolean  check(int[] nums){

        if(nums.length==1){
            return true;
        }
        int start=0;int end=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                start=i;
                break;

            }
        }

        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]>nums[i]){
                end=i;
                break;

            }
        }
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=nums[start];
            start++;
            end--;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;

            }
            
        }
        return true;


    }
    
}
