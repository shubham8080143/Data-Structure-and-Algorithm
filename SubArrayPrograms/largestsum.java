package SubArrayPrograms;

public class largestsum {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a, n));
        
    }
    static int maxSubArraySum(int a[], int size)
    {
        int max=a[0];
        int curent_max=a[0];
        for(int i=1;i<size;i++){
            curent_max=Math.max(a[i],curent_max+a[i]);
            max=Math.max(max,curent_max);
        }
        return max;
    }
    
}
