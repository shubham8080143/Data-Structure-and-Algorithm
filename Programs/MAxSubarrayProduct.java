public class MAxSubarrayProduct {
    public static void main(String[] args) {
        int[] nums={1,2,4,12,10,0,-5,6,7};
        System.out.println(maxproduct(nums));
        
    }
    
    //bruteforce method
    static int maxproduct(int[] nums){
        int maxProduct=1;int s=0;int e=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
              product=product*nums[j];
              if(maxProduct<product){
                maxProduct=product;
                s=i;e=j;
              }
            }
        }
         System.out.println(s+" "+e);
        return maxProduct;
    }


}
