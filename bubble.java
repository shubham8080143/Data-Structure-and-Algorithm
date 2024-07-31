import java.util.Arrays;

public class bubble{
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){  //in each iteration we get max value in the last
             if(a[j]>a[j+1]){   
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }

        }
        System.out.println(Arrays.toString(a));
            
        }
    }
}