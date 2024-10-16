package SubArrayPrograms;

import java.util.Arrays;

public class subarraysum{
    public static void main(String[] args) {
        int[] a={1,2,3,4};
  rangeSum(a, 4, 1, 5);
        
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] a=new int[n*(n+1)/2];
        int count=0;
        for(int i=0;i<nums.length;i++){  //this lopp is for counting all subarry sums and stores it in the array of a and create new array
            int sum=nums[i];
            a[count++]=sum;
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
               a[count++]=sum;
                
            }
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int add=0;                 
        for(int i=left-1;i<right;i++){          //this array count the sum of the new sortes array of subarray sum 
            add=add+a[i];
            
        }
        System.out.println(add);
        
        return add;
        
        
        
    }
    
}
