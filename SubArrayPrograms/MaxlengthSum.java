package SubArrayPrograms;

import java.util.Arrays;

public class MaxlengthSum {
    public static void main(String[] args) {
        int[] a={6,7,9,7,5,1,-8,-5,-3};

       System.out.println( Arrays.toString(checksum(a, 13)));
        
    }

    static int[] checksum(int[] array,int target){
        int maxlength=0;int a=0,b=0;
       
       for(int i=0;i<array.length-1;i++){
        int sum=0;
        for(int j=i;j<array.length;j++){
            sum=sum+array[j];
            if(sum==target && j-i+1>maxlength){
                maxlength=j-i+1;
                a=i;
                b=j;

            }
            


        }
       }
       for(int i=a;i<=b;i++){
        System.out.print(array[i]+" ,");
       }

       return new int[] {a,b};
    }


    
}
