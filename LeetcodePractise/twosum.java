package LeetcodePractise;

public class twosum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        range(nums, 9);

        
    }
    public static void range(int[] nums ,int target){
        
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
            if(sum==target){
                System.out.println(i +"," +j);
            }

            }
            
        }
        
    }
    

    
}
