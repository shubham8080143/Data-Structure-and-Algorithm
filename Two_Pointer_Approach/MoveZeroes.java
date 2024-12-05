package Two_Pointer_Approach;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] num={6,8,7,9,0,7,6,89,0,8,0,9,0};
       moveZeroes(num);
        

    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.println(nums.toString());
    }
    
}
