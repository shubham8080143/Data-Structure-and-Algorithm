package Practise;

public class palidrome {
    public static void main(String[] args) { 
        int[] nums={1,2,3,1};
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[i]!=nums[j]){
                System.out.println(false);
                return;
            }
            i++;j--;

        }
        System.out.println(true);
        
    }
    
    
}
